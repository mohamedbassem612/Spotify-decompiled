package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nlh0 implements e9d0, plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nlh0(rlh0 rlh0Var, boolean z, byte b) {
        this.a = b;
        this.b = rlh0Var;
        this.c = z;
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        boolean z = this.c;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 1:
                kh70Var.J0(rlh0Var.c, i, z);
                break;
            case 2:
                kh70Var.U(rlh0Var.c, i, z);
                break;
            default:
                kh70Var.e0(rlh0Var.c, i, z);
                break;
        }
    }

    public void invoke(Object obj) {
        o8u0 o8u0Var = (o8u0) obj;
        switch (this.a) {
            case 0:
                o8u0Var.O(this.b.f128p.t, this.c);
                break;
            default:
                o8u0Var.O(this.b.f128p.t, this.c);
                break;
        }
    }
}
