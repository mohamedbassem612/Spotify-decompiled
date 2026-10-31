package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dlh0 implements plh0, e9d0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;

    public /* synthetic */ dlh0(rlh0 rlh0Var, byte b) {
        this.a = b;
        this.b = rlh0Var;
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 0:
                kh70Var.C(rlh0Var.c, i);
                break;
            case 1:
                kh70Var.k(rlh0Var.c, i);
                break;
            case 2:
                kh70Var.J(rlh0Var.c, i);
                break;
            case 3:
                kh70Var.h(rlh0Var.c, i);
                break;
            case 4:
                kh70Var.F(rlh0Var.c, i);
                break;
            case 5:
                kh70Var.p(rlh0Var.c, i);
                break;
            case 6:
                kh70Var.D(rlh0Var.c, i);
                break;
            case 7:
                kh70Var.u0(rlh0Var.c, i);
                break;
            case 8:
                kh70Var.L0(rlh0Var.c, i);
                break;
            case 9:
                kh70Var.m(rlh0Var.c, i);
                break;
            case 10:
                int iO = rlh0Var.o();
                xlh0 xlh0Var = rlh0Var.c;
                if (iO < 6) {
                    kh70Var.d(xlh0Var, i, 0.0f);
                } else {
                    kh70Var.w(xlh0Var, i);
                }
                break;
            case 11:
                kh70Var.y(rlh0Var.c, i);
                break;
            case 12:
                kh70Var.N(rlh0Var.c, i);
                break;
            case 13:
                kh70Var.K0(rlh0Var.c, i);
                break;
            default:
                kh70Var.E0(rlh0Var.c, i);
                break;
        }
    }

    public void invoke(Object obj) {
        byte b = this.a;
        rlh0 rlh0Var = this.b;
        o8u0 o8u0Var = (o8u0) obj;
        switch (b) {
            case 15:
                o8u0Var.p0(rlh0Var.y);
                break;
            default:
                o8u0Var.p0(rlh0Var.y);
                break;
        }
    }
}
