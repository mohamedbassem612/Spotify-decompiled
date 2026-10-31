package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sus0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uus0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sus0(uus0 uus0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uus0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uus0 uus0Var = this.b;
        switch (b) {
            case 0:
                return h5p1.s(uus0Var.a, uus0Var.f, new php0(uus0Var.e.c(), (byte) 20), new py40(4, (lnm) null, (byte) 2));
            case 1:
                ((qtr) obj).b(new pnp0(uus0Var, (lnm) null, (byte) 7));
                return rih1Var;
            default:
                xus0 xus0Var = (xus0) obj;
                bpb1 bpb1Var = uus0Var.f;
                if (xus0Var instanceof vus0) {
                    Boolean bool = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    z710.d(uus0Var.c, ((vus0) xus0Var).a, false, 4);
                    return rih1Var;
                }
                if (!xus0Var.equals(wus0.a)) {
                    eg.o();
                    return null;
                }
                Boolean bool2 = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool2);
                return rih1Var;
        }
    }
}
