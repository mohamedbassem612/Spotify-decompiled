package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class at51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fb91 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ idn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at51(fb91 fb91Var, boolean z, idn0 idn0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = fb91Var;
        this.c = z;
        this.d = idn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        idn0 idn0Var = this.d;
        boolean z = this.c;
        fb91 fb91Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ft51.g(fb91Var, z, idn0Var, b0kVar, czo1.p(1));
                break;
            default:
                ft51.g(fb91Var, z, idn0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
