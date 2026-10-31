package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xld1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ nmd1 b;
    public final /* synthetic */ n3z c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xld1(nmd1 nmd1Var, String str, n3z n3zVar) {
        super(2);
        this.b = nmd1Var;
        this.d = str;
        this.c = n3zVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.d;
        n3z n3zVar = this.c;
        nmd1 nmd1Var = this.b;
        switch (b) {
            case 0:
                u961 u961Var = nmd1Var.x;
                return new jpg0(new n3(nmd1Var.a, (gap) u961Var.a, (l0x0) u961Var.b, (gw70) u961Var.c, (f1n0) u961Var.d), new ccb1(str, n3zVar, (byte) 29));
            default:
                kpc.e((kpc) obj, "episode", new amd1(nmd1Var, n3zVar, str, (y1c1) obj2), 4);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xld1(nmd1 nmd1Var, n3z n3zVar, String str) {
        super(2);
        this.b = nmd1Var;
        this.c = n3zVar;
        this.d = str;
    }
}
