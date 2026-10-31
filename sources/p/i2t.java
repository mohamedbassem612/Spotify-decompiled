package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class i2t implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2t b;

    public /* synthetic */ i2t(String str, j2t j2tVar) {
        this.a = (byte) 0;
        this.b = j2tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j2t j2tVar = this.b;
        switch (b) {
            case 0:
                try {
                    j2tVar.e.get();
                    j2tVar.e(j2t.n.decrementAndGet(), j2t.m.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    j2tVar.toString();
                    j2h1.p("DeferrableSurface");
                    synchronized (j2tVar.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", j2tVar, Boolean.valueOf(j2tVar.c), Integer.valueOf(j2tVar.b)), e);
                    }
                }
            case 1:
                j2tVar.a();
                return;
            default:
                j2tVar.b();
                return;
        }
    }

    public /* synthetic */ i2t(j2t j2tVar, byte b) {
        this.a = b;
        this.b = j2tVar;
    }
}
