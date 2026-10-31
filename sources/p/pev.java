package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pev {
    public final fnh0 a;
    public final n2t b;
    public final boolean c;
    public volatile boolean d;
    public final oev e = new oev(this);

    public pev(fnh0 fnh0Var, n2t n2tVar, boolean z) {
        this.a = fnh0Var;
        this.b = n2tVar;
        this.c = z;
    }

    public final void a() {
        if (this.d || !this.c) {
            this.d = false;
            this.b.d(vt7.a);
        }
    }
}
