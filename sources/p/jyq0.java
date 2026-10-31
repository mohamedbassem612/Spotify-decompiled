package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jyq0 implements x310 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final zx4 f;

    public jyq0(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, zx4 zx4Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        this.e = ynb0Var5;
        this.f = zx4Var;
    }

    @Override // p.x310
    public final boolean a(r9c r9cVar) {
        m210 m210VarB = r9cVar.b();
        if (m210VarB == null || !"partner_ui".equals(m210VarB.a)) {
            return false;
        }
        String str = m210VarB.i;
        String strC = r9cVar.c();
        if (((!kyq0.a().contains(str) && !"".equals(str)) || u890.j(strC, uyq0.n.a()) || u890.j(strC, uyq0.m.a()) || u890.j(strC, uyq0.o.a())) && kyq0.b().contains(r9cVar.e())) {
            return (r9cVar.j() || u890.j(r9cVar.e(), "com.spotify.pme.unauthenticated")) && this.f.b();
        }
        return false;
    }

    @Override // p.x310
    public final w310 b(r9c r9cVar) {
        String strE = r9cVar.e();
        if (u890.j(strE, "spotify_media_browser_root_pme")) {
            return (w310) this.a.get();
        }
        if (u890.j(strE, "spotify:genre:0JQ5DAD4lhWdgI5FP4QROh")) {
            return (w310) this.c.get();
        }
        if (u890.j(strE, "com.spotify.pme.home")) {
            return (w310) this.b.get();
        }
        if (u890.j(strE, "com.spotify.pme.unauthenticated")) {
            return (w310) this.e.get();
        }
        if (u890.j(strE, "com.spotify.your-library")) {
            return (w310) this.d.get();
        }
        eg.m(f4i1.e(r9cVar.e(), " not supported by PMEContentLoaderProvider"));
        return null;
    }
}
