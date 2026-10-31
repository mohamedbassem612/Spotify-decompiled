package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jjn1 implements qjn1 {
    public final nhn1 a;

    public jjn1(nhn1 nhn1Var) {
        this.a = nhn1Var;
    }

    @Override // p.qjn1
    public final void a(Object obj, Object obj2) {
        aqo1.z(obj, obj2);
    }

    @Override // p.qjn1
    public final void b(Object obj) {
        bkn1 bkn1Var = ((rin1) obj).zzc;
        if (bkn1Var.e) {
            bkn1Var.e = false;
        }
        throw td6.k(obj);
    }

    @Override // p.qjn1
    public final boolean c(rin1 rin1Var, rin1 rin1Var2) {
        return rin1Var.zzc.equals(rin1Var2.zzc);
    }

    @Override // p.qjn1
    public final int d(rin1 rin1Var) {
        bkn1 bkn1Var = rin1Var.zzc;
        int i = bkn1Var.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < bkn1Var.a; i2++) {
            int i3 = bkn1Var.b[i2] >>> 3;
            ain1 ain1Var = (ain1) bkn1Var.c[i2];
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(8) * 9;
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(16) * 9;
            int iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i3) * 9;
            int iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(24) * 9;
            int iF = ain1Var.f();
            int i4 = (352 - iNumberOfLeadingZeros) >>> 6;
            iG = x0d.g((352 - iNumberOfLeadingZeros4) >>> 6, (gvg.b(iF, 9, 352) >>> 6) + iF, ((352 - iNumberOfLeadingZeros2) >>> 6) + ((352 - iNumberOfLeadingZeros3) >>> 6) + i4 + i4, iG);
        }
        bkn1Var.d = iG;
        return iG;
    }

    @Override // p.qjn1
    public final void e(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        rin1 rin1Var = (rin1) obj;
        if (rin1Var.zzc == bkn1.f) {
            rin1Var.zzc = bkn1.a();
        }
        throw td6.k(obj);
    }

    @Override // p.qjn1
    public final void f(Object obj, a9a a9aVar, hin1 hin1Var) {
        njx0.e(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p.qjn1
    public final int g(rin1 rin1Var) {
        return rin1Var.zzc.hashCode();
    }

    @Override // p.qjn1
    public final void h(Object obj, ltf1 ltf1Var) {
        throw td6.k(obj);
    }

    @Override // p.qjn1
    public final rin1 zza() {
        nhn1 nhn1Var = this.a;
        if (nhn1Var instanceof rin1) {
            return ((rin1) nhn1Var).g();
        }
        kin1 kin1Var = (kin1) ((rin1) nhn1Var).u(5);
        boolean zV = kin1Var.b.v();
        rin1 rin1Var = kin1Var.b;
        if (!zV) {
            return rin1Var;
        }
        rin1Var.getClass();
        ljn1.b.a(rin1Var.getClass()).b(rin1Var);
        rin1Var.w();
        return kin1Var.b;
    }

    @Override // p.qjn1
    public final boolean zzl(Object obj) {
        throw td6.k(obj);
    }
}
