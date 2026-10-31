package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class azg implements rqw {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public azg(ecd1 ecd1Var) {
        this.a = (byte) 7;
        this.c = ecd1Var;
        this.b = (ia00) ecd1Var.b;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        iu30 iu30Var;
        r6h1 r6h1Var;
        byte b = this.a;
        Object obj3 = this.b;
        opl0 opl0Var = null;
        switch (b) {
            case 0:
                return ((ia00) obj3).a((xyg) obj, (xyg) obj2, op80Var);
            case 1:
                if (((Boolean) ((iu30) this.c).invoke(obj)).booleanValue()) {
                    return ((ia00) obj3).a(obj, obj2, op80Var);
                }
                return null;
            case 2:
                pfj1 pfj1Var = (pfj1) obj;
                return ((rqw) this.c).a(pfj1Var, obj2, j6p1.k(op80Var, j6p1.k(new h3h1(new ydh0(pfj1Var)), new k3h1(0))));
            case 3:
                return null;
            case 4:
                Integer numN = l0o1.n(op80Var);
                int iIntValue = numN != null ? numN.intValue() : 0;
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC != null && (iu30Var = h3h1VarC.b) != null && (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) != null) {
                    opl0Var = new opl0(Integer.valueOf(iIntValue), r6h1Var, (byte) 0);
                }
                this.c = opl0Var;
                return opl0Var != null ? new g3h1(opl0Var) : q6x.b;
            case 5:
                l581 l581Var = (l581) obj;
                m581 m581Var = (m581) obj2;
                if (l6p1.l(m581Var.a) == 0) {
                    return null;
                }
                return ((ia00) ((hy00) this.c).b).a(l581Var, m581Var, op80Var);
            case 6:
                trf1 trf1Var = (trf1) obj;
                trf1 trf1Var2 = (trf1) obj2;
                if (trf1Var2.b.size() != 1 || trf1Var2.k) {
                    return ((tva1) this.c).d.a(trf1Var, trf1Var2, op80Var);
                }
                return null;
            default:
                return ((ia00) obj3).a((hth1) obj, (jth1) obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        byte b = this.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return ((ia00) obj4).b((xyg) obj, (xyg) obj2, (wyg) obj3, op80Var);
            case 1:
                if (((Boolean) ((iu30) this.c).invoke(obj)).booleanValue()) {
                    return ((ia00) obj4).b(obj, obj2, obj3, op80Var);
                }
                return null;
            case 2:
                return ((rqw) obj4).b((pfj1) obj, obj2, obj3, op80Var);
            case 3:
                return ((i7h1) obj4).b((wlr0) obj, (zlr0) obj2, (vlr0) obj3, op80Var);
            case 4:
                return null;
            case 5:
                return ((hy00) obj4).e((l581) obj, (m581) obj2, (r581) obj3, op80Var);
            case 6:
                return ((ia00) obj4).b((trf1) obj, (trf1) obj2, (srf1) obj3, op80Var);
            default:
                return ((ia00) obj4).b((hth1) obj, (jth1) obj2, (gth1) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                xyg xygVar = (xyg) obj2;
                return (xygVar.c instanceof q1f1) && ((ia00) ((tm) this.c).f).c((xyg) obj, xygVar, op80Var);
            case 1:
                return ((Boolean) ((iu30) this.c).invoke(obj)).booleanValue() && ((ia00) obj3).c(obj, obj2, op80Var);
            case 2:
                return ((rqw) obj3).c((pfj1) obj, obj2, op80Var);
            case 3:
                return ((i7h1) obj3).c((wlr0) obj, (zlr0) obj2, op80Var);
            case 4:
                return false;
            case 5:
                return ((ia00) ((hy00) obj3).b).c((l581) obj, (m581) obj2, op80Var);
            case 6:
                trf1 trf1Var = (trf1) obj;
                trf1 trf1Var2 = (trf1) obj2;
                if (trf1Var2.b.size() != 1 || trf1Var2.k) {
                    return ((tva1) this.c).d.c(trf1Var, trf1Var2, op80Var);
                }
                return false;
            default:
                hth1 hth1Var = (hth1) obj;
                jth1 jth1Var = (jth1) obj2;
                if (dko1.p(hth1Var) == null) {
                    return false;
                }
                return ((ia00) ((ecd1) this.c).b).c(hth1Var, jth1Var, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((ia00) obj3).d((xyg) obj, (xyg) obj2, op80Var);
            case 1:
                if (((Boolean) ((iu30) this.c).invoke(obj)).booleanValue()) {
                    return ((ia00) obj3).d(obj, obj2, op80Var);
                }
                return null;
            case 2:
                return ((rqw) obj3).d((pfj1) obj, obj2, op80Var);
            case 3:
                wlr0 wlr0Var = (wlr0) obj;
                zlr0 zlr0Var = (zlr0) obj2;
                if (zlr0Var instanceof xlr0) {
                    return null;
                }
                return ((i7h1) this.c).d(wlr0Var, zlr0Var, op80Var);
            case 4:
                return null;
            case 5:
                return ((ia00) ((hy00) obj3).b).d((l581) obj, (m581) obj2, op80Var);
            case 6:
                trf1 trf1Var = (trf1) obj;
                trf1 trf1Var2 = (trf1) obj2;
                if (trf1Var2.b.size() != 1 || trf1Var2.k) {
                    return ((tva1) this.c).d.d(trf1Var, trf1Var2, op80Var);
                }
                return null;
            default:
                hth1 hth1Var = (hth1) obj;
                jth1 jth1Var = (jth1) obj2;
                if (dko1.p(hth1Var) == null) {
                    return null;
                }
                return ((ia00) ((ecd1) this.c).b).d(hth1Var, jth1Var, op80Var);
        }
    }

    public azg(iu30 iu30Var, ia00 ia00Var) {
        this.a = (byte) 1;
        this.c = iu30Var;
        this.b = ia00Var;
    }

    public azg(i8h1 i8h1Var) {
        this.a = (byte) 4;
        this.b = i8h1Var;
    }

    public /* synthetic */ azg(rqw rqwVar, byte b) {
        this.a = b;
        this.c = rqwVar;
        this.b = rqwVar;
    }

    public azg(tm tmVar) {
        this.a = (byte) 0;
        this.c = tmVar;
        this.b = (ia00) tmVar.f;
    }

    public azg(tva1 tva1Var) {
        this.a = (byte) 6;
        this.c = tva1Var;
        this.b = tva1Var.d;
    }
}
