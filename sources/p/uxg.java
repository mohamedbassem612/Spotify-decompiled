package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uxg implements shm {
    public final /* synthetic */ byte a;
    public final Object b;

    public uxg(npm1 npm1Var, mta mtaVar) {
        this.a = (byte) 5;
        this.b = npm1Var;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new huz(c(hti0Var), (byte) 10);
            case 1:
                return new huz(d(hti0Var), (byte) 10);
            case 2:
                return new huz(hti0Var.f.c ? ((gmt) obj).d() : null, (byte) 10);
            case 3:
                p860 p860Var = hti0Var.f.d;
                return new huz(p860Var != null ? ((o860) obj).h(p860Var) : null, (byte) 10);
            case 4:
                return new huz(e(hti0Var), (byte) 10);
            case 5:
                String str = hti0Var.a;
                ((npm1) obj).getClass();
                str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
                return new huz((Object) null, (byte) 10);
            case 6:
                return new huz(f(hti0Var), (byte) 10);
            case 7:
                ok51 ok51Var = hti0Var.f.b;
                return new huz(ok51Var != null ? ((dc31) obj).d(ok51Var) : null, (byte) 10);
            default:
                return new huz(g(hti0Var), (byte) 10);
        }
    }

    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return c(hti0Var);
            case 1:
                return d(hti0Var);
            case 2:
                if (hti0Var.f.c) {
                    return ((gmt) obj).d();
                }
                return null;
            case 3:
                p860 p860Var = hti0Var.f.d;
                if (p860Var == null) {
                    return null;
                }
                return ((o860) obj).h(p860Var);
            case 4:
                return e(hti0Var);
            case 5:
                String str = hti0Var.a;
                ((npm1) obj).getClass();
                str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
                return null;
            case 6:
                return f(hti0Var);
            case 7:
                ok51 ok51Var = hti0Var.f.b;
                if (ok51Var == null) {
                    return null;
                }
                return ((dc31) obj).d(ok51Var);
            default:
                return g(hti0Var);
        }
    }

    public jhm c(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || qxc0Var.i != wls0.f || !qxc0Var.t.h.a.contains(wls0.d)) {
            return null;
        }
        ajq0 ajq0Var = (ajq0) this.b;
        String str = hti0Var.a;
        return new jhm("list_uncollaborative", (hux) vlx.c, (fhm) null, (Integer) 2131960090, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(tpg.Q0, new irf(str, (byte) 8)), new vxg(ajq0Var, str, (byte) 0)), 244);
    }

    public jhm d(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || !qxc0Var.t.g.c) {
            return null;
        }
        gal galVar = (gal) this.b;
        String str = hti0Var.a;
        ((aqv) galVar.c).getClass();
        String strA = aqv.a(str);
        return new jhm("list_create_cover_art", (hux) bmx.c, (fhm) null, (Integer) 2131960079, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(y6n.b1, new kak(strA, (byte) 21)), new kjk(galVar, strA, (byte) 24)), 244);
    }

    public jhm e(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || !qxc0Var.t.i) {
            return null;
        }
        return new jhm("list_leave", (hux) tkx.c, (fhm) null, (Integer) 2131960082, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(hyb0.d, hyb0.e), new lhx((dxy) this.b, hti0Var.a, hti0Var.c, qxc0Var, (byte) 27)), 244);
    }

    public jhm f(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        wls0 wls0Var = qxc0Var.i;
        x7i1 x7i1Var = qxc0Var.t;
        wls0 wls0Var2 = wls0.c;
        boolean z = wls0Var == wls0Var2;
        boolean zContains = x7i1Var.h.a.contains(wls0Var2);
        boolean zContains2 = x7i1Var.h.a.contains(wls0.d);
        if ((z || !zContains) && !(z && zContains2)) {
            return null;
        }
        return ((c1d0) this.b).a(hti0Var.a, wls0Var);
    }

    public jhm g(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        exc0 exc0Var = qxc0Var.t.g;
        if (!exc0Var.a && !exc0Var.c && !exc0Var.b) {
            return null;
        }
        nt21 nt21Var = (nt21) this.b;
        String str = hti0Var.a;
        ((ktv) nt21Var.c).getClass();
        String strD = ktv.d(str);
        return new jhm("list_settings", (hux) xmx.c, (fhm) null, (Integer) 2131960089, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(rq61.f, new pg61(strD, (byte) 3)), new c861(nt21Var, strD, (byte) 5)), 244);
    }

    public /* synthetic */ uxg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
