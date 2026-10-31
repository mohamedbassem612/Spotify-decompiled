package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ybo implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia00 b;
    public final /* synthetic */ ia00 c;

    public /* synthetic */ ybo(ia00 ia00Var, byte b) {
        this.a = b;
        this.c = ia00Var;
        this.b = ia00Var;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.c;
        ia00 ia00Var2 = this.b;
        switch (b) {
            case 0:
                return ia00Var2.a((sbo) obj, (wbo) obj2, op80Var);
            case 1:
                anl anlVar = (anl) obj;
                bnl bnlVar = (bnl) obj2;
                if (bnlVar.g == null) {
                    return null;
                }
                return ia00Var.a(anlVar, bnlVar, op80Var);
            case 2:
                return ia00Var2.a((f6x) obj, (f6x) obj2, op80Var);
            case 3:
                b4z b4zVar = (b4z) obj;
                n4z n4zVar = (n4z) obj2;
                if (qon1.r(n4zVar) == 0) {
                    return null;
                }
                return ia00Var.a(b4zVar, n4zVar, op80Var);
            case 4:
                return ia00Var2.a((ilg0) obj, (plg0) obj2, op80Var);
            case 5:
                return ia00Var2.a((fmg0) obj, (gmg0) obj2, op80Var);
            default:
                return ia00Var2.a((cak0) obj, (dak0) obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.b((sbo) obj, (wbo) obj2, (rbo) obj3, op80Var);
            case 1:
                return ia00Var.b((anl) obj, (bnl) obj2, (zml) obj3, op80Var);
            case 2:
                return ia00Var.b((f6x) obj, (f6x) obj2, (rih1) obj3, op80Var);
            case 3:
                return ia00Var.b((b4z) obj, (n4z) obj2, (h4z) obj3, op80Var);
            case 4:
                return ia00Var.b((ilg0) obj, (plg0) obj2, (glg0) obj3, op80Var);
            case 5:
                return ia00Var.b((fmg0) obj, (gmg0) obj2, (dmg0) obj3, op80Var);
            default:
                return ia00Var.b((cak0) obj, (dak0) obj2, (bak0) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        ia00 ia00Var2 = this.c;
        switch (b) {
            case 0:
                wbo wboVar = (wbo) obj2;
                return (wboVar instanceof ubo) && ia00Var2.c((sbo) obj, wboVar, op80Var);
            case 1:
                return ia00Var.c((anl) obj, (bnl) obj2, op80Var);
            case 2:
                f6x f6xVar = (f6x) obj;
                return !(f6xVar.d instanceof g6x) && ia00Var2.c(f6xVar, (f6x) obj2, op80Var);
            case 3:
                return ia00Var.c((b4z) obj, (n4z) obj2, op80Var);
            case 4:
                ilg0 ilg0Var = (ilg0) obj;
                return !ilg0Var.g && ia00Var2.c(ilg0Var, (plg0) obj2, op80Var);
            case 5:
                fmg0 fmg0Var = (fmg0) obj;
                return !fmg0Var.j && ia00Var2.c(fmg0Var, (gmg0) obj2, op80Var);
            default:
                cak0 cak0Var = (cak0) obj;
                return cak0Var.e && ia00Var2.c(cak0Var, (dak0) obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.c;
        ia00 ia00Var2 = this.b;
        switch (b) {
            case 0:
                sbo sboVar = (sbo) obj;
                wbo wboVar = (wbo) obj2;
                if (wboVar instanceof ubo) {
                    return ia00Var.d(sboVar, wboVar, op80Var);
                }
                return null;
            case 1:
                return ia00Var2.d((anl) obj, (bnl) obj2, op80Var);
            case 2:
                f6x f6xVar = (f6x) obj;
                f6x f6xVar2 = (f6x) obj2;
                if (f6xVar.d instanceof g6x) {
                    return null;
                }
                return ia00Var.d(f6xVar, f6xVar2, op80Var);
            case 3:
                return ia00Var2.d((b4z) obj, (n4z) obj2, op80Var);
            case 4:
                return ia00Var2.d((ilg0) obj, (plg0) obj2, op80Var);
            case 5:
                return ia00Var2.d((fmg0) obj, (gmg0) obj2, op80Var);
            default:
                return ia00Var2.d((cak0) obj, (dak0) obj2, op80Var);
        }
    }
}
