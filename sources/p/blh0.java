package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class blh0 implements plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;
    public final /* synthetic */ yoh0 c;

    public /* synthetic */ blh0(rlh0 rlh0Var, yoh0 yoh0Var, byte b) {
        this.a = b;
        this.b = rlh0Var;
        this.c = yoh0Var;
    }

    public final void f(kh70 kh70Var, int i) {
        byte b = this.a;
        yoh0 yoh0Var = this.c;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 0:
                kh70Var.v(rlh0Var.c, i, yoh0Var.e(rlh0Var.o(), true), true);
                break;
            default:
                kh70Var.z(rlh0Var.c, i, yoh0Var.e(rlh0Var.o(), true));
                break;
        }
    }
}
