package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uis implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vis b;

    public /* synthetic */ uis(vis visVar, byte b) {
        this.a = b;
        this.b = visVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vis visVar = this.b;
        switch (b) {
            case 0:
                visVar.e((r7x0) null);
                break;
            default:
                visVar.k();
                break;
        }
    }
}
