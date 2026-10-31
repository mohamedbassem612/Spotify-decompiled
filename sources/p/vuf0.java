package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vuf0 implements jik1 {
    public final /* synthetic */ byte a;
    public final lik1 b;

    public vuf0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = nik1.p1;
                break;
            case 2:
                this.b = nik1.p1;
                break;
            default:
                this.b = nik1.B1;
                break;
        }
    }

    public final lik1 getViewUri() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public vuf0(lik1 lik1Var) {
        this.a = (byte) 3;
        this.b = lik1Var;
    }
}
