package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mo00 implements e9d0, akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ mo00(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        ffu0 ffu0Var = (ffu0) obj;
        switch (b) {
            case 3:
                ffu0Var.M(z);
                break;
            case 4:
                ffu0Var.Z(z);
                break;
            default:
                ffu0Var.o0(z);
                break;
        }
    }

    public void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        o8u0 o8u0Var = (o8u0) obj;
        switch (b) {
            case 0:
                o8u0Var.K(z);
                break;
            case 1:
                o8u0Var.k(z);
                break;
            default:
                o8u0Var.K(z);
                break;
        }
    }
}
