package cn.ac.ict.test02;

import java.util.List;

public class LoadData {

    private int status;
    private String reason;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"inc":220,"type":"Tapping_L","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/f61c0eeff33b2f105ca6e460eaae3854.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":221,"type":"Tremor_RR","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/ec32594884d0768076f2f8ada6b9176c.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":222,"type":"Tapping_R","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/37602b466f9602761202575226d53505.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":223,"type":"Tremor_LR","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/970d463144bee12149c62f5470f4838a.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":224,"type":"Stride","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/b568885eedf0f154f8747b6aefb9f439.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":225,"type":"Face","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/bee5e7f801f3ca61e2a1365b39ac0ef1.mp4","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":226,"type":"Sound","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/5b4ca35989b01fba2a6467fad64d8951.wav","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":227,"type":"Stand_L","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/3d1c23d9e4c606ac4c14513742aa7b46.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":228,"type":"ArmDroop_R","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/ac64001c7d9a8514c8fab0a626be3e9f.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":229,"type":"ArmDroop_L","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/d08e3eb5d24153d65942b23d3c23341a.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":230,"type":"Stand_R","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/01897c24185221a54e2471a71a410fb5.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":231,"type":"Tremor_LP","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/1de0c042ae63b7369a5a8a2d022684ee.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":232,"type":"Tremor_RP","uid":42,"doctor":"dua:田飞鹏","patient":"刘雪","score":0,"patient_age":50,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/ca721b23c101567327f7726eaef11348.txt","ctime":1578378895,"batch":"e2943722-166f-4b88-bcbb-c78961d2"},{"inc":218,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/e3ca7c404058a31d2a57673bfc5a86dd.wav","ctime":1577102712,"batch":"021ed8c4-dbe7-4962-83e1-a0c30b23"},{"inc":219,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/42870cb6a7a39060c1f7bfe505f92092.txt","ctime":1577102712,"batch":"021ed8c4-dbe7-4962-83e1-a0c30b23"},{"inc":216,"type":"Tapping_R","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/31b552bdba0e98a872ffa09646e33b7d.txt","ctime":1577101388,"batch":"744cb682-3178-4b62-912f-9986f4fb"},{"inc":217,"type":"Tapping_L","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/3b7ba623a62c4940850d148ea9af1eb9.txt","ctime":1577101388,"batch":"744cb682-3178-4b62-912f-9986f4fb"},{"inc":215,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/dcdefcce75a6b9c6daeaa89e7dd7e505.wav","ctime":1577101326,"batch":"84b62bd3-8ce5-41da-86ef-e4830bcb"},{"inc":214,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/0fe2dc5bfafb2ba1f8b8dc86ecd7ed2f.wav","ctime":1577101138,"batch":"338c2966-e302-474e-b9e3-70c83497"},{"inc":213,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/5cf51d27d09a2dd7a307e7c4c531c44a.txt","ctime":1577095980,"batch":"c18a1e44-f93e-44a9-9456-4562d567"},{"inc":212,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/1b6e753e522aef20e54cc3baf18722e4.txt","ctime":1577095802,"batch":"e8067eb4-485e-4bae-9fe6-096c2617"},{"inc":211,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/c960a5a251483c3bb75c5e80363d9b7c.txt","ctime":1577095198,"batch":"e77259a3-1fb2-477b-b3cf-9d9e6517"},{"inc":210,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/99103b310275be146d30e86af9f1129a.wav","ctime":1577095117,"batch":"c59b0b59-3cc6-4c61-ab23-e278d1c4"},{"inc":209,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/de8e19d1934b30a9b0d4c92ecb3b20f7.txt","ctime":1577094633,"batch":"2e506c36-0eb7-487a-9924-7a1d720e"},{"inc":208,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/1b5fee852b89dbb2ed24ea055ebcc398.txt","ctime":1577071059,"batch":"868fff7c-c1f0-4ed1-9438-e7328e67"},{"inc":205,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/f878d6d2bdc4590c3ccf26270e572f44.wav","ctime":1577070630,"batch":"6b52a4e2-2b5f-498d-9aca-5026988b"},{"inc":206,"type":"Tapping_R","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/053c4dd121c4192fa4f6300084711902.txt","ctime":1577070630,"batch":"6b52a4e2-2b5f-498d-9aca-5026988b"},{"inc":207,"type":"Tapping_L","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/d83e9d7782deaf213ccd8c676bd13d9e.txt","ctime":1577070630,"batch":"6b52a4e2-2b5f-498d-9aca-5026988b"},{"inc":204,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/064d9e00bfc1dcb88a359ebf669d5e8b.txt","ctime":1577069874,"batch":"69325ab5-c536-41d5-9cbb-932c719f"},{"inc":203,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/66d4fdc3352889c9571019abb32ea9b6.txt","ctime":1577069713,"batch":"77f4d60b-67e5-4253-bea7-6f31a7be"},{"inc":202,"type":"Tremor_RR","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/66546f7a51172c7a091c5b93b5845d54.txt","ctime":1577069569,"batch":"06a76325-396b-4587-8d26-4e054fae"},{"inc":201,"type":"ArmDroop_L","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/0adb0629d0a0afa290dc0b4a8ed6444e.txt","ctime":1576573362,"batch":"38eb30aa-92c1-4e00-803c-6a214826"},{"inc":200,"type":"ArmDroop_R","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/75e4a8d8c14e2e21e88f3273e520a957.txt","ctime":1576573361,"batch":"38eb30aa-92c1-4e00-803c-6a214826"},{"inc":199,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/869636ceeabbdf1f9e22407ecc7d8da8.wav","ctime":1576573221,"batch":"3c733674-1841-4123-ac03-b4b3b715"},{"inc":196,"type":"Tapping_R","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/6c077a4b7f3f61d38f1ddf2dce9f2585.txt","ctime":1576573220,"batch":"3c733674-1841-4123-ac03-b4b3b715"},{"inc":197,"type":"Tapping_L","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/b5574da57b83b8b769c5cf8c5797ba14.txt","ctime":1576573220,"batch":"3c733674-1841-4123-ac03-b4b3b715"},{"inc":198,"type":"Stride","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/e1cbc6e0cb8252dcd5ba75bf72db67c5.txt","ctime":1576573220,"batch":"3c733674-1841-4123-ac03-b4b3b715"},{"inc":195,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/5f2706fffcb78014e44a12274a386513.wav","ctime":1576572812,"batch":"0f692a22-22fc-4eb1-87f3-6365f498"},{"inc":194,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/97e2d730e824b50dea84cd7af40205c4.wav","ctime":1576571998,"batch":"4196cf4f-6a0f-4c42-85b6-5b577cc8"},{"inc":193,"type":"Sound","uid":26,"doctor":"dua:测试","patient":"测试","score":0,"patient_age":49,"patient_sex":"F","patient_med":"","onoff":0,"file":"Parkins/6ca7b4cd8542a873984c06e959324775.wav","ctime":1576570752,"batch":"e976db0c-d3f0-4402-8074-f547c63c"}]
         * urlpfx : http://ivita-files.oss-cn-qingdao.aliyuncs.com/
         * maxpage : 6
         */

        private String urlpfx;
        private int maxpage;
        private List<DataBean> data;

        public String getUrlpfx() {
            return urlpfx;
        }

        public void setUrlpfx(String urlpfx) {
            this.urlpfx = urlpfx;
        }

        public int getMaxpage() {
            return maxpage;
        }

        public void setMaxpage(int maxpage) {
            this.maxpage = maxpage;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * inc : 220
             * type : Tapping_L
             * uid : 42
             * doctor : dua:田飞鹏
             * patient : 刘雪
             * score : 0
             * patient_age : 50
             * patient_sex : F
             * patient_med :
             * onoff : 0
             * file : Parkins/f61c0eeff33b2f105ca6e460eaae3854.txt
             * ctime : 1578378895
             * batch : e2943722-166f-4b88-bcbb-c78961d2
             */

            private int inc;
            private String type;
            private int uid;
            private String doctor;
            private String patient;
            private int score;
            private int patient_age;
            private String patient_sex;
            private String patient_med;
            private int onoff;
            private String file;
            private int ctime;
            private String batch;

            public int getInc() {
                return inc;
            }

            public void setInc(int inc) {
                this.inc = inc;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getDoctor() {
                return doctor;
            }

            public void setDoctor(String doctor) {
                this.doctor = doctor;
            }

            public String getPatient() {
                return patient;
            }

            public void setPatient(String patient) {
                this.patient = patient;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public int getPatient_age() {
                return patient_age;
            }

            public void setPatient_age(int patient_age) {
                this.patient_age = patient_age;
            }

            public String getPatient_sex() {
                return patient_sex;
            }

            public void setPatient_sex(String patient_sex) {
                this.patient_sex = patient_sex;
            }

            public String getPatient_med() {
                return patient_med;
            }

            public void setPatient_med(String patient_med) {
                this.patient_med = patient_med;
            }

            public int getOnoff() {
                return onoff;
            }

            public void setOnoff(int onoff) {
                this.onoff = onoff;
            }

            public String getFile() {
                return file;
            }

            public void setFile(String file) {
                this.file = file;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public String getBatch() {
                return batch;
            }

            public void setBatch(String batch) {
                this.batch = batch;
            }
        }
    }
}
