package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hlh0 implements plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ hlh0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    public final void f(kh70 kh70Var, int i) {
        byte b = this.a;
        int i2 = this.d;
        int i3 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                kh70Var.n0(((rlh0) obj).c, i, i3, i2);
                break;
            case 1:
                kh70Var.q(((rlh0) obj).c, i, i3, i2);
                break;
            case 2:
                kh70Var.G0(((rlh0) obj).c, i, i3, i2);
                break;
            default:
                kh70Var.y0(((qlh0) obj).a.c, i, i3, i2);
                break;
        }
    }
}
