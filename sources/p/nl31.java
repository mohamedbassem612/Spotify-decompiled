package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nl31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ol31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl31(ol31 ol31Var, byte b) {
        super(1);
        this.a = b;
        this.b = ol31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ol31 ol31Var = this.b;
        switch (b) {
            case 0:
                return new m441(new ciw0(ol31Var, ((gl31) obj).f, (lnm) null, (byte) 16));
            case 1:
                gl31 gl31Var = (gl31) obj;
                vnr0 vnr0Var = gl31Var.b;
                boolean z = gl31Var.c;
                vnr0 vnr0Var2 = gl31Var.d;
                int i = gl31Var.e;
                float f = gl31Var.g;
                boolean z2 = !ol31Var.c;
                el31 el31Var = gl31Var.i;
                return new ml31(vnr0Var, z, vnr0Var2, i, jl31.a, f, z2, el31Var.a, el31Var.b);
            default:
                ((qtr) obj).b(new k8y0(ol31Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
