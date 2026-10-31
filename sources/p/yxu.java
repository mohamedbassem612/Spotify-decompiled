package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yxu implements wxu {
    public final /* synthetic */ byte a;
    public final zob1 b;
    public final /* synthetic */ y1c1 c;

    public yxu(y1c1 y1c1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = y1c1Var;
                this.b = ((w2c1) y1c1Var).U(k2v.class);
                break;
            default:
                this.c = y1c1Var;
                this.b = ((w2c1) y1c1Var).U(k2v.class);
                break;
        }
    }

    public final void a(String str, String str2) {
        byte b = this.a;
        w2c1 w2c1Var = this.c;
        switch (b) {
            case 0:
                w2c1Var.T(new fwu(str, str2));
                break;
            default:
                w2c1Var.T(new fwu(str, str2));
                break;
        }
    }

    public final void b(String str, String str2) {
        byte b = this.a;
        w2c1 w2c1Var = this.c;
        switch (b) {
            case 0:
                w2c1Var.T(new dwu(str, str2));
                break;
            default:
                w2c1Var.T(new dwu(str, str2));
                break;
        }
    }

    public final zob1 getStatus() {
        byte b = this.a;
        return this.b;
    }
}
