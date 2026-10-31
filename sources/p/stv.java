package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class stv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ kvv c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stv(kp5 kp5Var, kvv kvvVar, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = kp5Var;
                this.c = kvvVar;
                this.d = iu30Var;
                this.e = i;
                super(2);
                break;
            default:
                this.b = kp5Var;
                this.c = kvvVar;
                this.d = iu30Var;
                this.e = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        kvv kvvVar = this.c;
        kp5 kp5Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                kp5Var.c(kvvVar, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                kp5Var.d(kvvVar, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                kp5Var.e(kvvVar, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                kp5Var.g(kvvVar, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ stv(kp5 kp5Var, kvv kvvVar, iu30 iu30Var, int i, byte b, boolean z) {
        super(2);
        this.a = b;
        this.b = kp5Var;
        this.c = kvvVar;
        this.d = iu30Var;
        this.e = i;
    }
}
