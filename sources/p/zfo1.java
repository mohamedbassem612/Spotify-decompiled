package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zfo1 implements sgo1 {
    public final o3o1 a;
    public final fen1 b;

    public zfo1(fen1 fen1Var, o3o1 o3o1Var) {
        p9n1 p9n1Var = t8o1.a;
        this.b = fen1Var;
        this.a = o3o1Var;
    }

    @Override // p.sgo1
    public final int a(o3o1 o3o1Var) {
        cjo1 cjo1Var = ((iao1) o3o1Var).zzc;
        int i = cjo1Var.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < cjo1Var.a; i2++) {
            int i3 = cjo1Var.b[i2] >>> 3;
            n5o1 n5o1Var = (n5o1) cjo1Var.c[i2];
            int iO = x6o1.o(8);
            int iO2 = x6o1.o(i3) + x6o1.o(16);
            int iO3 = x6o1.o(24);
            int iE = n5o1Var.e();
            iG = x0d.g(iO + iO, iO2, lqn1.n(iE, iE, iO3), iG);
        }
        cjo1Var.d = iG;
        return iG;
    }

    @Override // p.sgo1
    public final boolean b(Object obj) {
        throw td6.k(obj);
    }

    @Override // p.sgo1
    public final int c(iao1 iao1Var) {
        return iao1Var.zzc.hashCode();
    }

    @Override // p.sgo1
    public final boolean d(iao1 iao1Var, iao1 iao1Var2) {
        return iao1Var.zzc.equals(iao1Var2.zzc);
    }

    @Override // p.sgo1
    public final void e(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        iao1 iao1Var = (iao1) obj;
        if (iao1Var.zzc == cjo1.f) {
            iao1Var.zzc = cjo1.b();
        }
        throw td6.k(obj);
    }

    @Override // p.sgo1
    public final void f(Object obj, qeh1 qeh1Var) {
        throw td6.k(obj);
    }

    @Override // p.sgo1
    public final iao1 zze() {
        o3o1 o3o1Var = this.a;
        if (o3o1Var instanceof iao1) {
            return ((iao1) o3o1Var).n();
        }
        t9o1 t9o1Var = (t9o1) ((iao1) o3o1Var).j(5);
        boolean zH = t9o1Var.b.h();
        iao1 iao1Var = t9o1Var.b;
        if (!zH) {
            return iao1Var;
        }
        iao1Var.p();
        return t9o1Var.b;
    }

    @Override // p.sgo1
    public final void zzf(Object obj) {
        this.b.getClass();
        cjo1 cjo1Var = ((iao1) obj).zzc;
        if (cjo1Var.e) {
            cjo1Var.e = false;
        }
        p9n1 p9n1Var = t8o1.a;
        throw td6.k(obj);
    }

    @Override // p.sgo1
    public final void zzg(Object obj, Object obj2) {
        ygo1.p(obj, obj2);
    }
}
