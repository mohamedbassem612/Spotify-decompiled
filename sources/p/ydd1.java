package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ydd1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ydd1(int i, String str) {
        this.a = (byte) 2;
        this.c = i;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        xdd1 xdd1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    d441VarG1.K(1, str);
                    d441VarG1.r(2, i);
                    int iW = y7y0.w(d441VarG1, "work_spec_id");
                    int iW2 = y7y0.w(d441VarG1, "generation");
                    int iW3 = y7y0.w(d441VarG1, "system_id");
                    if (d441VarG1.f1()) {
                        xdd1Var = new xdd1(d441VarG1.P0(iW), (int) d441VarG1.getLong(iW2), (int) d441VarG1.getLong(iW3));
                        break;
                    } else {
                        xdd1Var = null;
                    }
                    return xdd1Var;
                } finally {
                    d441VarG1.close();
                }
            case 1:
                d441 d441VarG2 = ((y341) obj).g1("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    d441VarG2.K(1, str);
                    d441VarG2.r(2, i);
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
            default:
                d441 d441VarG3 = ((y341) obj).g1("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    d441VarG3.r(1, i);
                    d441VarG3.K(2, str);
                    d441VarG3.f1();
                    return rih1Var;
                } finally {
                    d441VarG3.close();
                }
        }
    }

    public /* synthetic */ ydd1(String str, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = i;
    }
}
