package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mjp1 implements ujp1 {
    public final qgp1 a;
    public final wbn1 b;

    public mjp1(wbn1 wbn1Var, qgp1 qgp1Var) {
        p9n1 p9n1Var = ohp1.a;
        this.b = wbn1Var;
        this.a = qgp1Var;
    }

    @Override // p.ujp1
    public final void a(Object obj, Object obj2) {
        wjp1.b(obj, obj2);
    }

    @Override // p.ujp1
    public final boolean b(cip1 cip1Var, cip1 cip1Var2) {
        return cip1Var.zzc.equals(cip1Var2.zzc);
    }

    @Override // p.ujp1
    public final void c(Object obj, i2i1 i2i1Var) {
        throw td6.k(obj);
    }

    @Override // p.ujp1
    public final int d(cip1 cip1Var) {
        cip1Var.zzc.getClass();
        return 506991;
    }

    @Override // p.ujp1
    public final boolean e(Object obj) {
        throw td6.k(obj);
    }

    @Override // p.ujp1
    public final void f(Object obj) {
        this.b.getClass();
        ubn1 ubn1Var = ((cip1) obj).zzc;
        if (ubn1Var.d) {
            ubn1Var.d = false;
        }
        p9n1 p9n1Var = ohp1.a;
        throw td6.k(obj);
    }

    @Override // p.ujp1
    public final int g(qgp1 qgp1Var) {
        ubn1 ubn1Var = ((cip1) qgp1Var).zzc;
        int i = ubn1Var.c;
        if (i != -1) {
            return i;
        }
        ubn1Var.c = 0;
        return 0;
    }

    @Override // p.ujp1
    public final cip1 zza() {
        qgp1 qgp1Var = this.a;
        if (qgp1Var instanceof cip1) {
            return (cip1) ((cip1) qgp1Var).j(4, null);
        }
        yhp1 yhp1Var = (yhp1) ((cip1) qgp1Var).j(5, null);
        boolean zK = yhp1Var.b.k();
        cip1 cip1Var = yhp1Var.b;
        if (!zK) {
            return cip1Var;
        }
        cip1Var.getClass();
        qjp1.c.a(cip1Var.getClass()).f(cip1Var);
        cip1Var.l();
        return yhp1Var.b;
    }
}
