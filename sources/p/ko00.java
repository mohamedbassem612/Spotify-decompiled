package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ko00 implements e9d0, wlh0, ezh0, akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ko00(byte b, int i, int i2) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public void a(rlh0 rlh0Var) {
        rlh0Var.y(this.b, this.c);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((ffu0) obj).A0(this.b, this.c);
                break;
            default:
                ((ffu0) obj).R0(this.b, this.c);
                break;
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.c(i, this.b, this.c);
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((o8u0) obj).X(this.b, this.c);
                break;
            default:
                ((o8u0) obj).X(this.b, this.c);
                break;
        }
    }
}
