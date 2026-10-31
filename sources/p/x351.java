package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x351 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ y7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x351(String str, y7e1 y7e1Var) {
        super(1);
        this.b = str;
        this.c = y7e1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        y7e1 y7e1Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                if (y7e1Var.d().d.length() == 0) {
                    b261.n(e261Var, str);
                }
                return rih1.a;
            default:
                if (str != null) {
                    c4p1.E(str, y7e1Var);
                }
                return new tj4((byte) 21);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x351(y7e1 y7e1Var, String str) {
        super(1);
        this.c = y7e1Var;
        this.b = str;
    }
}
