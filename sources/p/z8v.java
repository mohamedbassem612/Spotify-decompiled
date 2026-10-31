package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class z8v implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9v b;
    public final /* synthetic */ c9v c;

    public /* synthetic */ z8v(b9v b9vVar, c9v c9vVar, byte b) {
        this.a = b;
        this.b = b9vVar;
        this.c = c9vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c9v c9vVar = this.c;
        b9v b9vVar = this.b;
        switch (b) {
            case 0:
                c9vVar.z(b9vVar.a, b9vVar.b);
                break;
            case 1:
                c9vVar.U(b9vVar.a, b9vVar.b);
                break;
            default:
                c9vVar.q(b9vVar.a, b9vVar.b);
                break;
        }
    }
}
