SET SCHEMA PAY_TEST;
INSERT INTO PAY_ENTITY (ENTITY_CODE, COUNTRY_CODE2, COUNTRY_CODE3) VALUES ('14017', 'SG', 'SGP');
INSERT INTO PAY_ENTITY (ENTITY_CODE, COUNTRY_CODE2, COUNTRY_CODE3) VALUES ('10107', 'CN', 'CHN');
INSERT INTO PAY_ENTITY (ENTITY_CODE, COUNTRY_CODE2, COUNTRY_CODE3) VALUES ('14024', 'HK', 'HKG');

INSERT INTO FILE_ORIGIN (ORIGIN_CODE) VALUES ('SWIFTNET');
INSERT INTO FILE_ORIGIN (ORIGIN_CODE) VALUES ('GIRO');
INSERT INTO FILE_ORIGIN (ORIGIN_CODE) VALUES ('OPTIM');
INSERT INTO FILE_ORIGIN (ORIGIN_CODE) VALUES ('SERAPIS');

INSERT INTO PAY_TYPE (PAY_TYPE_CODE) VALUES ('DOM');
INSERT INTO PAY_TYPE (PAY_TYPE_CODE) VALUES ('INT');
INSERT INTO PAY_TYPE (PAY_TYPE_CODE) VALUES ('ATA');
INSERT INTO PAY_TYPE (PAY_TYPE_CODE) VALUES ('DOM_RTGS');
INSERT INTO PAY_TYPE (PAY_TYPE_CODE) VALUES ('INT_RTGS');

INSERT INTO PAY_FILE_ELEMENT(ELEMENT_LEVEL, ELEMENT_NAME, ELEMENT_XPATH) VALUES('REQUEST', 'FILE_NAME', '');
INSERT INTO PAY_FILE_ELEMENT(ELEMENT_LEVEL, ELEMENT_NAME, ELEMENT_XPATH) VALUES('GRPHDR', 'FILE_NAME', '');
INSERT INTO PAY_FILE_ELEMENT(ELEMENT_LEVEL, ELEMENT_NAME, ELEMENT_XPATH) VALUES('PMTINST', 'FILE_NAME', '');
INSERT INTO PAY_FILE_ELEMENT(ELEMENT_LEVEL, ELEMENT_NAME, ELEMENT_XPATH) VALUES('PMTTRAN', 'FILE_NAME', '');

INSERT INTO PAY_SUB_TYPE (PAY_TYPE_CODE, PAY_SUB_TYPE_CODE) VALUES ((SELECT PAY_TYPE_CODE FROM PAY_TYPE WHERE PAY_TYPE_CODE = 'INT'), 'OL2F');