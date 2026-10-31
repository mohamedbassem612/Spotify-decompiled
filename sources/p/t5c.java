package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t5c extends vc9 {
    public ohd a;
    public iu30 b;

    @Override // p.vc9
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // p.vc9
    public final void b(Throwable th) {
        ohd ohdVar = this.a;
        if (ohdVar != null) {
            ohdVar.resumeWith(new m231(th));
        }
    }
}
