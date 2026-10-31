package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ptw implements wsw, ky11 {
    public final xcn0 a = new xcn0();
    public boolean b;
    public m511 c;
    public final px20 d;
    public final r1t e;
    public final r1t f;

    public ptw(boolean z, k40 k40Var) {
        px20 px20Var = new px20(new w3w(k40Var, this, (byte) 7), z);
        this.d = px20Var;
        this.e = new r1t(1, this, ptw.class, "publishBoundsChanged", "publishBoundsChanged(Lcom/spotify/element/core/instrumentation/Rect;)V", 0, (byte) 22);
        this.f = new r1t(1, px20Var, px20.class, "onIntersectionPercentageChanged", "onIntersectionPercentageChanged(I)V", 0, (byte) 23);
    }

    public final void a(tka0 tka0Var, xsw xswVar) {
        tka0 tka0Var2 = otw.a;
        boolean zEquals = tka0Var.equals(tka0Var2);
        xcn0 xcn0Var = this.a;
        if (zEquals && this.b && !xcn0Var.c.containsKey(tka0Var)) {
            xcn0Var.c(tka0Var2, new tsw(this.c));
        }
        xcn0Var.a(tka0Var, xswVar);
    }

    public final void b() {
        this.a.b(true);
    }

    public final r1t c() {
        return this.e;
    }

    public final r1t d() {
        return this.f;
    }

    public final px20 e() {
        return this.d;
    }

    public final void f() {
        this.a.b(false);
    }

    public final void h() {
        this.a.b(false);
    }
}
