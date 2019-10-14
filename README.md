# CCC1-APM Client

A tool to simply recreate the CCC1 estimate for any company, office and appraiser combination in any environment. *(Currently, Prod is not supported in order to prevent testers activity in Prod)*

Go to the `apm/` directory from the parent directory

`cd apm`

## Different approaches to recreate the estimate data:

### Command line input

Provide the fiddler session template path, *(absolute path or relative path)*, company name, claim office name and the appraiser name in the command line.

Examples:

**Note: The fiddler session file is in the `apm/fiddler_captures` directory**

`python ccc1_client.py -i fiddler_captures/E01_TCOR_2800.saz --companyname="WORKFLOW INSURANCE COMPANY" --officename="FLORIDA CLAIM OFFICE" --appraiser="Reinspectorone, Florida" -s`

The above command **shows** an E01 estimate structure with a total cost of repair of $2800 for the company, office and appraiser provided.

To actually create the estimate, just remove the `-s` option. So:

`python ccc1_client.py -i fiddler_captures/E01_TCOR_2800.saz --companyname="WORKFLOW INSURANCE COMPANY" --officename="FLORIDA CLAIM OFFICE" --appraiser="Reinspectorone, Florida"`

For more options use the `--help command`:

`python ccc1_client.py --help`


### YAML file input

Example of test data in the YAML file:

`- 
  CCC1:
    FIDDLER_FILE: fiddler_captures/S01_TCOR_4487.saz
    COMPANY_NAME: WORKFLOW INSURANCE COMPANY
    OFFICE_NAME: FLORIDA CLAIM OFFICE
    APPRAISER: Reinspectorone, Florida
`

Just provide the absolute or relative path to the YAML test data file in the command line.

`python ccc1_client.py --testdatapath testresources/testdata.yaml`

#### Example of a multiple data test data file:

`apm/testresources/multiple_testdata.yaml`

---

## APM Architecture:

![alt text](documentation/images/CCC1Client.png)

![alt text](documentation/images/Workfile.png)