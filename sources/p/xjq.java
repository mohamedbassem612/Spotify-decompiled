package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xjq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ xjq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final lis a(i8h1 i8h1Var) {
        byte b = this.a;
        ywp ywpVar = this.b;
        switch (b) {
            case 0:
                String string = ((rww0) ((yjq) ywpVar.c).c).O0().getString("extra_feature_identifier");
                if (string == null) {
                    string = "UNKNOWN";
                }
                return new lis(string, i8h1Var);
            default:
                String str = ((m0x0) ((byp) ywpVar.c).c).e;
                c8o.m(str);
                return new lis(str, i8h1Var);
        }
    }
}
