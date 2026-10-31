package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oud {
    public final flw0 a;
    public final wh71 b;
    public final int c;

    public oud(flw0 flw0Var, wh71 wh71Var, int i) {
        this.a = flw0Var;
        this.b = wh71Var;
        this.c = i;
    }

    public final Object a(iud iudVar, lnm lnmVar) {
        boolean z = iudVar instanceof hud;
        flw0 flw0Var = this.a;
        int i = this.c;
        d9n d9nVar = d9n.a;
        if (z) {
            Object objA = flw0Var.a(new yhw0(i, ((hud) iudVar).a), lnmVar);
            if (objA == d9nVar) {
                return objA;
            }
        } else if (iudVar instanceof eud) {
            Object objA2 = flw0Var.a(new vhw0(i, ((eud) iudVar).a), lnmVar);
            if (objA2 == d9nVar) {
                return objA2;
            }
        } else if (iudVar instanceof gud) {
            Object objA3 = flw0Var.a(new xhw0(i, ((gud) iudVar).a), lnmVar);
            if (objA3 == d9nVar) {
                return objA3;
            }
        } else if (iudVar instanceof fud) {
            Object objA4 = flw0Var.a(new whw0(i), lnmVar);
            if (objA4 == d9nVar) {
                return objA4;
            }
        } else if (iudVar instanceof dud) {
            Object objA5 = flw0Var.a(new uhw0(i, ((dud) iudVar).a), lnmVar);
            if (objA5 == d9nVar) {
                return objA5;
            }
        } else if (iudVar instanceof bud) {
            Object objA6 = flw0Var.a(new shw0(i, ((bud) iudVar).a), lnmVar);
            if (objA6 == d9nVar) {
                return objA6;
            }
        } else {
            boolean z2 = iudVar instanceof ytd;
            wh71 wh71Var = this.b;
            if (z2) {
                Object objA7 = wh71Var.a(new ny71(((ytd) iudVar).a, i), lnmVar);
                if (objA7 == d9nVar) {
                    return objA7;
                }
            } else if (iudVar instanceof aud) {
                Object objA8 = wh71Var.a(new mmt(((aud) iudVar).a, i), lnmVar);
                if (objA8 == d9nVar) {
                    return objA8;
                }
            } else {
                if (!(iudVar instanceof ztd)) {
                    eg.o();
                    return null;
                }
                ztd ztdVar = (ztd) iudVar;
                Object objA9 = wh71Var.a(new oy71(ztdVar.a, ztdVar.b, ztdVar.c, ztdVar.d, i), lnmVar);
                if (objA9 == d9nVar) {
                    return objA9;
                }
            }
        }
        return rih1.a;
    }

    public final kge b() {
        return hu20.d(new mr20[]{new mgb(this.a.a, this, (byte) 17), new mgb(this.b.b(new uh71(rc11.a.b(mtd.class), Integer.valueOf(this.c))), this, (byte) 18)});
    }
}
