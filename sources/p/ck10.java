package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ck10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck10(String str, String str2, String str3, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str3);
                b261.A(e261Var, str2);
                if (str != null) {
                    e261Var.b(z161.O, str);
                }
                break;
            case 1:
                p4h p4hVarN = ((kb61) obj).N();
                fn31.T(p4hVarN.d, (o8n) null, 0, new x4c(p4hVarN, this.b, this.c, this.d, null, (byte) 11), 3);
                break;
            default:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str3, m6k.class, false);
                qv00Var.a(str3, jo70.class, false);
                qv00Var.a(str3, xkk1.class, false);
                qv00Var.a(str2, jo70.class, false);
                qv00Var.a(str2, xkk1.class, false);
                qv00Var.a(str, j6k.class, false);
                qv00Var.a(str, lhe0.class, false);
                break;
        }
        return rih1Var;
    }
}
