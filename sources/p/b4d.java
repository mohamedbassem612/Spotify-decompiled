package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b4d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c4d b;
    public final /* synthetic */ String c;

    public /* synthetic */ b4d(c4d c4dVar, String str, byte b) {
        this.a = b;
        this.b = c4dVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        c4d c4dVar = this.b;
        switch (b) {
            case 0:
                c4dVar.b.onCameraAvailable(str);
                break;
            default:
                c4dVar.b.onCameraUnavailable(str);
                break;
        }
    }
}
