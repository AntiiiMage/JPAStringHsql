--%%entity_code%%
--%%origin_code%%
--%%subtype_code%%
--%%testcase_name%%
--%%testcase_desc%%
--%%element_level%%
--%%element_name%%
--%%element_value%%

SET SCHEMA PAY_TEST;
INSERT INTO PAY_TEST_CASE (ENTITY_CODE, ORIGIN_CODE, PAY_SUB_TYPE_ID,TEST_CASE_NAME,TEST_CASE_DESCPRIPTION) VALUES 
('%%entity_code%%', '%%origin_code%%', 
(SELECT PAY_SUB_TYPE_ID FROM PAY_SUB_TYPE WHERE PAY_SUB_TYPE_CODE = '%%subtype_code%%'),
'%%testcase_name%%',
'%%testcase_desc%%'
);

INSERT INTO PAY_FILE_ENRICHMENT (PAY_TEST_CASE_ID, ELEMENT_ID, ELEMENT_VALUE) VALUES 
(
(SELECT PAY_TEST_CASE_ID FROM PAY_TEST_CASE WHERE ENTITY_CODE = '%%entity_code%%' AND ORIGIN_CODE = '%%origin_code%%' AND 
	PAY_SUB_TYPE_ID = (SELECT PAY_SUB_TYPE_ID FROM PAY_SUB_TYPE WHERE PAY_SUB_TYPE_CODE = '%%subtype_code%%'), AND TEST_CASE_NAME = '%%testcase_name%%'),
(SELECT ELEMENT_ID FROM PAY_FILE_ELEMENT WHERE ELEMENT_LEVEL = '%%element_level%%' AND ELEMENT_NAME = '%%element_name%%'),
'%%element_value%%'
);


INSERT INTO PAY_FILE_ENRICHMENT (PAY_TEST_CASE_ID, ELEMENT_ID, ELEMENT_VALUE, RANDOM_ID) VALUES 
(
(SELECT PAY_TEST_CASE_ID FROM PAY_TEST_CASE WHERE ENTITY_CODE = '%%entity_code%%' AND ORIGIN_CODE = '%%origin_code%%' AND 
	PAY_SUB_TYPE_ID = (SELECT PAY_SUB_TYPE_ID FROM PAY_SUB_TYPE WHERE PAY_SUB_TYPE_CODE = '%%subtype_code%%'), AND TEST_CASE_NAME = '%%testcase_name%%'),
(SELECT ELEMENT_ID FROM PAY_FILE_ELEMENT WHERE ELEMENT_LEVEL = '%%element_level%%' AND ELEMENT_NAME = '%%element_name%%'),
'%%element_value%%',
'1'
);