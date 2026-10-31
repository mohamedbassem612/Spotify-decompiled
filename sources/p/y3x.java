package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y3x {
    public final tho1 a;
    public final zrk b;

    public y3x(zrk zrkVar, tho1 tho1Var) {
        this.a = tho1Var;
        this.b = zrkVar;
    }

    public final void a(Throwable th) {
        this.b.execute(new x3x(this, th));
    }

    public final void b() {
        this.b.execute(new x3x(this));
    }
}
