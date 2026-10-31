package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r1d0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snc0 b;

    public /* synthetic */ r1d0(snc0 snc0Var, byte b) {
        this.a = b;
        this.b = snc0Var;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.destroy();
                break;
            default:
                this.b.destroy();
                break;
        }
    }
}
