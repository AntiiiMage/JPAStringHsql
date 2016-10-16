SET SCHEMA PAY_TEST;
INSERT INTO PAY_FILE_ENRICHMENT (PAY_TEST_CASE_ID, ELEMENT_ID, ELEMENT_VALUE) VALUES 
(
(SELECT PAY_TEST_CASE_ID FROM PAY_TEST_CASE WHERE ENTITY_CODE = '14024' AND ORIGIN_CODE = 'SWIFTNET' AND 
	PAY_SUB_TYPE_ID = (SELECT PAY_SUB_TYPE_ID FROM PAY_SUB_TYPE WHERE PAY_SUB_TYPE_CODE = 'OL2F')),
(SELECT ELEMENT_ID FROM PAY_FILE_ELEMENT WHERE ELEMENT_LEVEL = 'PMTINST' AND ELEMENT_NAME = 'FILE_NAME'),
'TEST ACCOUNT'
);