package org.example;

import validator.JsonValidator;
import validator.ValidateResult;

public class Main {
    public static void main(String[] args) {

        String json = """
                [
                  {
                    "TRT_INFO": {
                      "TRT_KEY": ["1234-111aa-dasdsad"],
                      "YYK_ID": "41359160",
                      "PAT_ID": "1",
                      "RCPT_GB": "외래",
                      "TRT_YMD": "2022-07-18",
                      "TRT_S_YMD": "2022-07-18",
                      "TRT_E_YMD": "2022-07-18",
                      "INSURE_TYPE": "건강보험",
                      "INSURE_TYPE_CD": "P01",
                      "DEPT_CD": "D01",
                      "DEPT_NM": "내과",
                      "DR_NM": "김x희",
                      "DR_CD": "6",
                      "TRT_AMT": "5000",
                      "CUSTOM1": "20220718",
                      "CUSTOM2": "20220718",
                      "CUSTOM3": "20220718",
                      "CUSTOM4": "20220718",
                      "CUSTOM5": "20220718"
                    },
                    "ISR_INFO": {
                      "ISR_KEY": "aaaaa-bbbbb-cccc...",
                      "HOSP_ID": "41359160",
                      "HOSP_NM": "365속시원한가정의학과의원",
                      "PAT_ID": "1",
                      "PAT_NM": "홍길동",
                      "PAT_HP": "01000000000",
                      "PATIENT_TEL": "4444",
                      "VIRTUAL_FAX": "5555",
                      "INSURANT_NM": "6666",
                      "INSURANT_JUMIN": "1111112222222",
                      "BENEFICIARY": "aaaaaaaa",
                      "BENEFICIARY_JUMIN": "2222223333333",
                      "BANK_CD": "012",
                      "BANK_NAME": "KEB하나은행",
                      "BANK_NUMBER": "1231412312",
                      "ACCIDENT_TYPE": "질병",
                      "ACCIDENT_CONTENT": "회의가 너무 많아 골이 깨짐",
                      "INSURER": {
                        "Code": "1.2.410.200071.1.1.1.1.2.14",
                        "Name": "교보생명"
                      }
                    },
                    "RCPT_HEADER": {
                      "RCPT_ID": "20240306-0002",
                      "RCPT_GB": "외래",
                      "PAT_ID": "1",
                      "PAT_NM": "홍길동",
                      "TRT_S_YMD": "2022-07-18",
                      "TRT_E_YMD": "2022-07-18",
                      "DEPT_CD": "D06",
                      "DEPT_NM": "신경외과",
                      "TRT_TYPE": "건강보험",
                      "TRT_TYPE_CD": "P01",
                      "TRT_AMT": "16970",
                      "PAT_AMT": "5000",
                      "PAID_AMT": "0",
                      "DISCNT_AMT": "0",
                      "DISCNT_DESC": "",
                      "PAID_NOT_AMT": "0",
                      "PAID_NOT_AMT_DESC": "",
                      "AMT_TO_PAY": "5000",
                      "PAY_AMT": "5000",
                      "OWN_AMT": "5000",
                      "INSURER_AMT": "11970",
                      "ALL_OWN_AMT": "0",
                      "SPC_AMT": "0",
                      "SPC_EX_AMT": "0",
                      "UP_LIMIT_AMT": "0",
                      "DRG_NO": ""
                    },
                    "RCPT_DETAIL": [
                      {
                        "RCPT_ID": "20240306-0002",
                        "ITEM_NM": "진찰료",
                        "ITEM_CD": "C01",
                        "OWN_AMT": "5091",
                        "INSURER_AMT": "11879",
                        "ALL_OWN_AMT": "0",
                        "SPC_AMT": "0",
                        "SPC_EX_AMT": "0"
                      }
                    ],
                    "FEE_DETAIL": [
                      {
                        "RCPT_ID": "20220718_1",
                        "TRT_YMD": "2022-07-18",
                        "TRT_CD": "C05",
                        "TRT_NM": "투약조제(약품료)",
                        "SUGA_CD": "7901",
                        "EDI_CD": "641602060",
                        "ITEM_NM": "(원외)우루사정200mg 대웅제약",
                        "UNIT_PRICE": "0",
                        "ITEM_CNT": "3.0000",
                        "DAYS": "1",
                        "INS_TYPE": "급여",
                        "CALC_AMT": "0",
                        "OWN_AMT": "0",
                        "INSURER_AMT": "0",
                        "ALL_OWN_AMT": "0",
                        "SPC_AMT": "0",
                        "SPC_EX_AMT": "0"
                      },
                      {
                        "RCPT_ID": "20220718_1",
                        "TRT_YMD": "2022-07-18",
                        "TRT_CD": "C01",
                        "TRT_NM": "진찰료",
                        "SUGA_CD": "",
                        "EDI_CD": "AA154",
                        "ITEM_NM": "초진진찰료",
                        "UNIT_PRICE": "16970",
                        "ITEM_CNT": "1.0000",
                        "DAYS": "1",
                        "INS_TYPE": "급여",
                        "CALC_AMT": "16970",
                        "OWN_AMT": "5091",
                        "INSURER_AMT": "11879",
                        "ALL_OWN_AMT": "0",
                        "SPC_AMT": "0",
                        "SPC_EX_AMT": "0"
                      }
                    ],
                    "PRS_INFO": [
                      {
                        "RX_ID": "2022071800001",
                        "INSURE_TYPE_CD": "P01",
                        "INSURE_TYPE_NM": "건강보험",
                        "PAT_ID": "1",
                        "PAT_NM": "홍길동",
                        "BIRTH_YMD": "1985-06-14",
                        "PAT_SEX": "남성",
                        "TRT_YMD": "2022-07-18",
                        "HOSP_NM": "테스트의원",
                        "HOSP_CD": "16001478",
                        "HOSP_TEL": "02-310-9160",
                        "HOSP_FAX": "",
                        "HOSP_EMAIL": "",
                        "DIAG_CD": "J00",
                        "DR_NM": "김병희",
                        "DR_NO": "106001",
                        "EDI_CD": "641602060",
                        "DRUG_NM": "(641602060)우루사정200mg 대웅제약",
                        "DOSE_AMT_ONCE": "1.0000",
                        "DOSE_CNT_PER_DAY": "3",
                        "DAYS_OF_DOSE": "1",
                        "METHOD": ""
                      }
                    ]
                  }
                ] 
                """;

        String ruleString = """
                [
                  {
                    "TRT_INFO": { 														### 진료이력
                      "TRT_KEY": "(_isString && gt(10)) && lt(1000) || _oneOf(1234-456, abcdef, hig, this, is, good, day, 'this is good day')",	### "1234-111aa-dasdsad",
                      "YYK_ID": "_longerThan(10, 11)",											### "41359160", // 요양기관 기호
                      "PAT_ID": "_digit",											### "1", // 환자번호
                      "INSURE_TYPE": "_any( a, b)",									### "건강보험", // 보험유형명
                      "INSURE_TYPE_CD": "_any",							### "P01", // 보험유형코드
                      "DEPT_CD": "_any",											### "D01", // 진료과목코드
                      "DEPT_NM": "_any",											### "내과", // 진료과목명
                      "DR_NM": "_any",												### "갑돌이", // 의사명
                      "RCPT_GB": "_oneOf(입원,외래,응급,퇴원,중간)",											### "외래", // 영수증 유형 [입원,외래,응급,퇴원,중간]
                      "TRT_YMD": "_digit",											### "2022-07-18", // 진료일
                      "$$$$" : "${CUSTOM1} > ${CUSTOM1}",                           ### Object-Validation( inter-field-validation)
                      "TRT_S_YMD": "_date(${yyyy}-${mm}-${dd}) || _digitOr(-)",										### "2022-07-18", // 진료시작일
                      "TRT_E_YMD": "_any && _between(0, 1000)",										### "2022-07-18", // 진료종료일
                      "DR_CD": "_any",												### "6", // 의사번호
                      "TRT_AMT": "_any",											### "5000", // 환자부담 총맥
                      "CUSTOM1": "_any",											### "20220718", // 진료영수증 조회를 위한 검색 조건
                      "CUSTOM2": "_any",											### "20220718", // 진료영수증항목별내역 조회를 위한 검색 조건
                      "CUSTOM3": "_any",											### "20220718", // 진료비 세부내역 조회를 위한 검색 조건
                      "CUSTOM4": "_any",											### "20220718", // 원외처방내역 조회를 위한 검색 조건
                      "CUSTOM5": "_any"											### "20220718" // 진단내역 조회를 위하ㅣㄴ 검색조건
                    },
                    "ISR_INFO": { 														### 청구자정보
                      "_?_:ISR_KEY": "_between(1, 100)",											### "aaaaa-bbbbb-cccc...",
                      "HOSP_ID": "_any",											### "41359160", // 요양기관기호
                      "HOSP_NM": "_any",											### "365속시원한가정의학과의원", // 요양기관명
                      "PAT_ID": "_any",											### "1", // 환자번호
                      "PAT_NM": "_any",											### "홍길동", // 환자명
                      "PAT_HP": "_any",											### "01000000000", // 차트에 등록된 전화번호
                      "PATIENT_TEL": "_any",									### "4444", // 환자가 입력한 전화버ㅏㄴ호
                      "VIRTUAL_FAX": "_any",									### "5555", // 보험사 가상팩스번호(가상팩스를 사용하는 보험사일 경우)
                      "INSURANT_NM": "_any",									### "6666", // 피보험자 성명
                      "INSURANT_JUMIN": "_any",							### "1111112222222", // 피보험자 주민등록번호
                      "BENEFICIARY": "_any",									### "aaaaaaaa", // 수익자 성명
                      "BENEFICIARY_JUMIN": "_any",						### "2222223333333", // 수익자 전화번호
                      "BANK_CD": "_any",											### "012", // 은행코드
                      "BANK_NAME": "_any",										### "KEB하나은행", // 은행명
                      "BANK_NUMBER": "_any",									### "1231412312", // 계좌번호
                      "ACCIDENT_TYPE": "_any",								### "질병", // 사고유형 [질병, 상해, 사고]
                      "SOMEKEY": "_any",
                      "ACCIDENT_CONTENT": "_any",						### "회의가 너무 많아 골이 깨짐", // 사고내용
                      "INSURER": { 													### 보험사 정보
                        "Code": "_any",											### "1.2.410.200071.1.1.1.1.2.14",
                        "Name": "_any" 											### "교보생명"
                      }
                    },
                    "RCPT_HEADER": { 												### 진료영수증
                      "RCPT_ID": "_any",											### "20240306-0002", // 영수증 번호
                      "RCPT_GB": "_any",											### "외래", // 진료구분 [입원,외래,응급,퇴원,중간]
                      "PAT_ID": "_any",											### "1", // 환자번호
                      "PAT_NM": "_any",											### "홍길동", // 환자성명
                      "TRT_S_YMD": "_any",										### "2022-07-18", // 시작일자
                      "TRT_E_YMD": "_any",										### "2022-07-18", // 종료일자
                      "DEPT_CD": "_any",											### "D06", // 진료과목코드
                      "DEPT_NM": "_any",											### "신경외과", // 진료과목명
                      "TRT_TYPE": "_any",										### "건강보험", // 보험유형
                      "TRT_TYPE_CD": "_any",									### "P01", // 보험유형코드
                      "TRT_AMT": "_any",											### "16970", // 진료비 총액
                      "PAT_AMT": "_any",											### "5000", // 환자부담 총액
                      "PAID_AMT": "_any",										### "0", // 이미 수납한 금액
                      "DISCNT_AMT": "_any",									### "0", // 감면액
                      "DISCNT_DESC": "_any",									### "", // 감면 사유
                      "PAID_NOT_AMT": "_any",								### "0", // 미수액
                      "PAID_NOT_AMT_DESC": "_any",						### "", // 미수 사유
                      "AMT_TO_PAY": "_any",									### "5000", // 납부할 금액
                      "PAY_AMT": "_any",											### "5000", // 납부한 금액
                      "OWN_AMT": "_any",											### "5000", // 본인부담금 합계
                      "INSURER_AMT": "_any",									### "11970", // 공단부담금 합계
                      "ALL_OWN_AMT": "_any",									### "0", // 전액본인부담금 합계
                      "SPC_AMT": "_any",											### "0", // 선택진료료 합계 비급여
                      "SPC_EX_AMT": "_any",									### "0", // 선택진료료 이외 합계 비급여
                      "UP_LIMIT_AMT": "_any",								### "0", // 상한액 초과금
                      "DRG_NO": "_any" 											### "" // 질병군 번호
                    },
                    "RCPT_DETAIL": [ 												### 진료비영수증항목별내역
                      {
                        "RCPT_ID": "_any",										### "20240306-0002", // 영수증번호
                        "ITEM_NM": "_any",										### "진찰료", // 의료비항목명
                        "ITEM_CD": "_any",										### "C01",  // 의료비항목코드
                        "OWN_AMT": "_any",										### "5091", // 급여 본인부담금
                        "INSURER_AMT": "_any",								### "11879", // 급여 공단부담금
                        "ALL_OWN_AMT": "_any",								### "0", // 전액 본인부담금
                        "SPC_AMT": "_any",										### "0", // 비급여 선택진료료
                        "SPC_EX_AMT": "_any" 								### "0" // 비급여 선택진료료 이회
                      }
                    ],
                    "FEE_DETAIL": [ 													### 진료비세부내역항복별내역
                      {
                        "RCPT_ID": "_any",										### "20220718_1", // 영수증번호
                        "TRT_YMD": "_any",										### "2022-07-18", // 진료일자
                        "TRT_CD": "_any",										### "C05", // 의료비항목코드
                        "TRT_NM": "_any",										### "투약조제(약품료)", // 의료비항목명
                        "SUGA_CD": "_any",										### "7901", // 수가코드
                        "EDI_CD": "_any",										### "641602060", // edi코드
                        "ITEM_NM": "_any",										### "(원외)우루사정200mg 대웅제약", // 품목명
                        "UNIT_PRICE": "_any",								### "0", // 금액
                        "ITEM_CNT": "_any",									### "3.0000", // 횟수
                        "DAYS": "_any",											### "1", // 일수
                        "INS_TYPE": "_any",									### "급여", // 급여, 비급여 구분
                        "CALC_AMT": "_any",									### "0",  // 총액 (금액(1회) x 실시(투여)횟수 x 실시(투여)일수를 계산)
                        "OWN_AMT": "_any",										### "0", // 본인부담금
                        "INSURER_AMT": "_any",								### "0", // 공단부담금
                        "ALL_OWN_AMT": "_any",								### "0", // 전액본인부담금
                        "SPC_AMT": "_any",										### "0", // 비급여 선택진료료 금액
                        "SPC_EX_AMT": "_any" 								### "0" // 비급여 선택진료료 이외 금액
                      }
                    ],
                    "PRS_INFO": [ 														### 원외처방전
                      {
                        "RX_ID": "_any",											### "2022071800001", // 교부번호
                        "INSURE_TYPE_CD": "_any",						### "P01", // 보험유형코드
                        "INSURE_TYPE_NM": "_any",						### "건강보험", // 보험유형명
                        "PAT_ID": "_any",										### "1", // 환자번호
                        "PAT_NM": "_any",										### "홍길동", // 환자명
                        "BIRTH_YMD": "_any",									### "1985-06-14", // 환자 생년월일
                        "PAT_SEX": "_any",										### "남성", // 성별 [남성, 여성]
                        "TRT_YMD": "_any",										### "2022-07-18", // 진료일자
                        "HOSP_NM": "_any",										### "테스트의원",
                        "HOSP_CD": "_any",										### "16001478",
                        "HOSP_TEL": "_any",									### "02-310-9160",
                        "HOSP_FAX": "_any",									### "",
                        "HOSP_EMAIL": "_any",								### "",
                        "DIAG_CD": "_any",										### "J00", // 질병코드(상병코드)
                        "DR_NM": "_any",											### "김병희", // 처방의 성함
                        "DR_NO": "_any",											### "106001", // 처방의 의사면허번호
                        "EDI_CD": "_any",										### "641602060", // edi코드
                        "DRUG_NM": "_any",										### "(641602060)우루사정200mg 대웅제약", // 약품명
                        "DOSE_AMT_ONCE": "_any",							### "1.0000", // 1회 투여량
                        "DOSE_CNT_PER_DAY": "_any",					### "3", // 1일 투여횟수
                        "DAYS_OF_DOSE": "_any",							### "1", // 투여일수
                        "METHOD": "_any" 										### "" // 용법설명
                      }
                    ]
                  }
                ]
                """;

        String id = "hiwebnet";

        /**
         *  make rule.
         */
        JsonValidator jv = JsonValidator.apply(id, ruleString);

        ValidateResult ret = jv.evaluate(id, json);

        ret.show();

        System.out.println("Hello world!");
    }
}