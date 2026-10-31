package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcc0 implements tha1 {
    public final /* synthetic */ byte a;
    public final String b;
    public final me30 c;
    public final agc0 d;
    public final Object e;

    public /* synthetic */ fcc0(String str, Object obj, me30 me30Var, agc0 agc0Var, byte b) {
        this.a = b;
        this.b = str;
        this.e = obj;
        this.c = me30Var;
        this.d = agc0Var;
    }

    public final g3d0 a(g3d0 g3d0Var) {
        switch (this.a) {
            case 0:
                if (g3d0Var instanceof n2d0) {
                    return n2d0.a;
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            case 1:
                if (g3d0Var instanceof r2d0) {
                    return r2d0.a;
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            case 2:
                if (g3d0Var instanceof t2d0) {
                    return t2d0.a;
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            default:
                if (g3d0Var instanceof y2d0) {
                    return y2d0.a;
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 2131962816;
            case 1:
                return 2131962813;
            case 2:
                return 2131962814;
            default:
                return 2131962819;
        }
    }

    public final void c(qxc0 qxc0Var) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vha1 vha1Var = (vha1) obj;
                i8h1 i8h1Var = vha1Var.a;
                fjl0 fjl0Var = vha1Var.b;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("add_time", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                wha1 wha1Var = (wha1) obj;
                i8h1 i8h1Var2 = wha1Var.a;
                fjl0 fjl0Var2 = wha1Var.b;
                x6h1 x6h1VarC2 = fjl0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("album_name", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC2.a(), fjl0Var2.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                xha1 xha1Var = (xha1) obj;
                i8h1 i8h1Var3 = xha1Var.a;
                fjl0 fjl0Var3 = xha1Var.b;
                x6h1 x6h1VarC3 = fjl0Var3.c.c();
                x6h1VarC3.i.add(new a7h1("artist_name", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC3.a(), fjl0Var3.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                vha1 vha1Var2 = (vha1) obj;
                i8h1 i8h1Var4 = vha1Var2.a;
                fjl0 fjl0Var4 = vha1Var2.b;
                x6h1 x6h1VarC4 = fjl0Var4.c.c();
                x6h1VarC4.i.add(new a7h1("name", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC4.a(), fjl0Var4.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }

    public final boolean e(qxc0 qxc0Var) {
        byte b = this.a;
        String str = this.b;
        agc0 agc0Var = this.d;
        le30 le30Var = le30.S0;
        me30 me30Var = this.c;
        switch (b) {
            case 0:
                if (me30Var.a(qxc0Var.e) != le30Var) {
                    agc0Var.getClass();
                    if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
                        return false;
                    }
                }
                return true;
            case 1:
                if (me30Var.a(qxc0Var.e) != le30Var) {
                    agc0Var.getClass();
                    if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
                        return false;
                    }
                }
                return true;
            case 2:
                if (me30Var.a(qxc0Var.e) != le30Var) {
                    agc0Var.getClass();
                    if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
                        return false;
                    }
                }
                return true;
            default:
                if (me30Var.a(qxc0Var.e) != le30Var) {
                    agc0Var.getClass();
                    if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final g3d0 getSortOrder() {
        switch (this.a) {
            case 0:
                return n2d0.a;
            case 1:
                return r2d0.a;
            case 2:
                return t2d0.a;
            default:
                return y2d0.a;
        }
    }
}
