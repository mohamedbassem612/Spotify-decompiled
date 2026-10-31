package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xss0 implements mn31 {
    public final kly0 a;
    public final y741 b;

    public xss0(kly0 kly0Var, y741 y741Var) {
        this.a = kly0Var;
        this.b = y741Var;
    }

    @Override // p.shh0
    public final boolean a(r9c r9cVar) {
        m210 m210VarB = r9cVar.b();
        boolean zEquals = "com.google.android.deskclock".equals(m210VarB != null ? m210VarB.k : null);
        m210 m210VarB2 = r9cVar.b();
        boolean zEquals2 = "partner_ui".equals(m210VarB2 != null ? m210VarB2.a : null);
        m210 m210VarB3 = r9cVar.b();
        return (r9cVar.l() && (zEquals2 || zEquals || "app_remote".equals(m210VarB3 != null ? m210VarB3.a : null))) || (nhc1.Y(r9cVar.e(), "spotify:section:", false) && !this.b.a(r9cVar));
    }

    @Override // p.shh0
    public final rhh0 b() {
        return (rhh0) this.a.get();
    }
}
