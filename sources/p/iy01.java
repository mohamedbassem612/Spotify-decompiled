package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iy01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy01(ky01 ky01Var, byte b) {
        super(1);
        this.a = b;
        this.b = ky01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ky01 ky01Var = this.b;
        switch (b) {
            case 0:
                fy01 fy01Var = (fy01) obj;
                if (fy01Var.c) {
                    return d3p1.H(ky01Var.c, ky01Var.d, fy01Var);
                }
                p111 p111Var = fy01Var.d;
                return d5p1.h(gio1.b(new hy01(p111Var.a, p111Var.e, p111Var.f, p111Var.h, p111Var.i, p111Var.X, p111Var.Y, p111Var.d)));
            default:
                ((qtr) obj).b(new pnp0(ky01Var, null, (byte) 17));
                return rih1.a;
        }
    }
}
