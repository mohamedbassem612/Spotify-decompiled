package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qig implements a4l {
    public final g0l a;
    public final li9 b;
    public final rku c = new rku();

    public qig(g0l g0lVar, li9 li9Var) {
        this.a = g0lVar;
        this.b = li9Var;
    }

    @Override // p.a4l
    public final void a() {
        this.c.a();
    }

    @Override // p.a4l
    public final void b() {
        this.c.b(((inr) this.a).j().filter(f331.g).firstElement().subscribe(new mba(this, (byte) 21)));
    }
}
