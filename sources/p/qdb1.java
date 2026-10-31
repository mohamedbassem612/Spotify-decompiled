package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdb1(ve51 ve51Var, byte b) {
        super(1);
        this.a = b;
        this.b = ve51Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ve51 ve51Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(ve51Var.b, ve51Var.d, (ndb1) obj);
            case 1:
                String str = ((ndb1) obj).a;
                if (ve51Var.c) {
                    return str;
                }
                return null;
            case 2:
                String str2 = ((ndb1) obj).a;
                if (ve51Var.c) {
                    return str2;
                }
                return null;
            default:
                return (String) ve51Var.g;
        }
    }
}
