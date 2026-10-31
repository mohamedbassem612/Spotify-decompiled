package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ilh0 implements e9d0, plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ilh0(rlh0 rlh0Var, int i, byte b) {
        this.a = b;
        this.b = rlh0Var;
        this.c = i;
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        int i2 = this.c;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 2:
                kh70Var.j0(rlh0Var.c, i, i2);
                break;
            case 3:
            case 6:
            case 7:
            default:
                kh70Var.F0(rlh0Var.c, i, i2);
                break;
            case 4:
                kh70Var.d0(rlh0Var.c, i, i2);
                break;
            case 5:
                kh70Var.n(rlh0Var.c, i, i2);
                break;
            case 8:
                kh70Var.X(rlh0Var.c, i, i2);
                break;
            case 9:
                kh70Var.g0(rlh0Var.c, i, i2);
                break;
        }
    }

    public void invoke(Object obj) {
        o8u0 o8u0Var = (o8u0) obj;
        switch (this.a) {
            case 0:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
            case 1:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
            case 2:
            case 4:
            case 5:
            default:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
            case 3:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
            case 6:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
            case 7:
                o8u0Var.O(this.c, this.b.f128p.u);
                break;
        }
    }
}
