package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ucn implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mko b;

    public /* synthetic */ ucn(mko mkoVar, byte b) {
        this.a = b;
        this.b = mkoVar;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                this.b.stop();
                break;
        }
    }
}
