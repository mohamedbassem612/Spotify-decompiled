package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ole implements yt11 {
    public final bq11 a;
    public final mp8 b;
    public final String c;
    public final q8n d;
    public final vgm e;
    public final String f;
    public final vu30 g;

    public ole(bq11 bq11Var, mp8 mp8Var, String str, q8n q8nVar, vgm vgmVar, String str2, vu30 vu30Var) {
        this.a = bq11Var;
        this.b = mp8Var;
        this.c = str;
        this.d = q8nVar;
        this.e = vgmVar;
        this.f = str2;
        this.g = vu30Var;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        ou80 ou80Var;
        ou80 ou80Var2;
        if (unb1Var instanceof jmb1) {
            int iOrdinal = ((jmb1) unb1Var).f.ordinal();
            bq11 bq11Var = this.a;
            d9n d9nVar = d9n.a;
            String str = null;
            if (iOrdinal == 0) {
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str = ou80Var.a;
                }
                Object objA = bq11.a(bq11Var, str, onmVar);
                if (objA == d9nVar) {
                    return objA;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                if (tv80Var != null && (ou80Var2 = tv80Var.a) != null) {
                    str = ou80Var2.a;
                }
                Object objB = bq11.b(bq11Var, str, onmVar);
                if (objB == d9nVar) {
                    return objB;
                }
            } else if (tv80Var != null) {
                Object objY = fn31.Y(this.d, new gke(this, unb1Var, tv80Var, null, (byte) 1), onmVar);
                if (objY == d9nVar) {
                    return objY;
                }
            }
        }
        return rih1.a;
    }

    public final s9d1 b() {
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        vu30 vu30Var;
        if ((unb1Var instanceof jmb1) && tv80Var != null && (vu30Var = this.g) != null) {
            Object objY = fn31.Y(this.d, new ur1((byte) 7, this.e, unb1Var, this, tv80Var, vu30Var, (lnm) null), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}
