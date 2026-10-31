package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dxm implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0r b;

    public /* synthetic */ dxm(c0r c0rVar, byte b) {
        this.a = b;
        this.b = c0rVar;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }
}
