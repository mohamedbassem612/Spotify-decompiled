package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xzk extends bbc {
    public final int S0;

    public xzk(int i, int i2) {
        super(i);
        this.S0 = i2;
        if (i2 == 1) {
            bhn0.k("This implementation does not support suspension for senders, use ", rc11.a.b(bbc.class).r(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        hhg1.f(gvg.e(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // p.bbc
    public final boolean D() {
        return this.S0 == 2;
    }

    public final Object Y(Object obj, boolean z) {
        rih1 rih1Var = rih1.a;
        if (this.S0 == 3) {
            Object objL = super.l(obj);
            return (!(objL instanceof pge) || (objL instanceof oge)) ? objL : rih1Var;
        }
        o4l1 o4l1Var = dbc.d;
        rge rgeVar = (rge) bbc.f.get(this);
        while (true) {
            long andIncrement = bbc.b.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zA = A(andIncrement, false);
            int i = dbc.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (rgeVar.e != j3) {
                rge rgeVarM = m(j3, rgeVar);
                if (rgeVarM != null) {
                    rgeVar = rgeVarM;
                } else if (zA) {
                    break;
                }
            }
            int iV = V(rgeVar, i2, obj, j, o4l1Var, zA);
            if (iV == 0) {
                rgeVar.b();
                return rih1Var;
            }
            if (iV != 1) {
                if (iV != 2) {
                    if (iV == 3) {
                        eg.m("unexpected");
                        return null;
                    }
                    if (iV == 4) {
                        if (j >= q()) {
                            break;
                        }
                        rgeVar.b();
                        break;
                    }
                    if (iV == 5) {
                        rgeVar.b();
                    }
                } else {
                    if (zA) {
                        rgeVar.i();
                        break;
                    }
                    o4l1 o4l1Var2 = o4l1Var instanceof o4l1 ? o4l1Var : null;
                    if (o4l1Var2 != null) {
                        o4l1Var2.b(rgeVar, i2 + i);
                    }
                    i((rgeVar.e * j2) + ((long) i2));
                }
            }
            return rih1Var;
        }
        return flo1.e(u());
    }

    @Override // p.bbc, p.r261
    public final Object b(Object obj, lnm lnmVar) throws Throwable {
        if (Y(obj, true) instanceof oge) {
            throw u();
        }
        return rih1.a;
    }

    @Override // p.bbc, p.r261
    public final Object l(Object obj) {
        return Y(obj, false);
    }
}
