package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cch1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ech1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cch1(ech1 ech1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ech1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ech1 ech1Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(ech1Var.a);
            default:
                l7e0 l7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                zuc0 zuc0Var = j7e0Var != null ? j7e0Var.a : null;
                return new ao01(new co01(zuc0Var != null ? zuc0Var.b : 0, ech1Var.a, l7e0Var.getUri()), vby0.v(zuc0Var != null ? zuc0Var.h : null));
        }
    }
}
