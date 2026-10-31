package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c5o1 implements r6o1 {
    public final qrn1 a;
    public final y1x0 b;

    public c5o1(y1x0 y1x0Var, qrn1 qrn1Var) {
        own1 own1Var = twn1.a;
        this.b = y1x0Var;
        this.a = qrn1Var;
    }

    @Override // p.r6o1
    public final void a(Object obj, Object obj2) {
        y6o1.b(obj, obj2);
    }

    @Override // p.r6o1
    public final void b(Object obj) {
        this.b.getClass();
        y1x0.f(obj);
        own1 own1Var = twn1.a;
        throw td6.k(obj);
    }

    @Override // p.r6o1
    public final void c(Object obj, y1t0 y1t0Var) {
        throw td6.k(obj);
    }

    @Override // p.r6o1
    public final int d(vyn1 vyn1Var) {
        return vyn1Var.zzc.hashCode();
    }

    @Override // p.r6o1
    public final boolean e(vyn1 vyn1Var, vyn1 vyn1Var2) {
        return vyn1Var.zzc.equals(vyn1Var2.zzc);
    }

    @Override // p.r6o1
    public final void f(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        vyn1 vyn1Var = (vyn1) obj;
        if (vyn1Var.zzc == n8o1.f) {
            vyn1Var.zzc = n8o1.a();
        }
        throw td6.k(obj);
    }

    @Override // p.r6o1
    public final int g(qrn1 qrn1Var) {
        n8o1 n8o1Var = ((vyn1) qrn1Var).zzc;
        int i = n8o1Var.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < n8o1Var.a; i2++) {
            int i3 = n8o1Var.b[i2] >>> 3;
            gun1 gun1Var = (gun1) n8o1Var.c[i2];
            int iQ = vun1.q(8);
            int iQ2 = vun1.q(i3) + vun1.q(16);
            int iQ3 = vun1.q(24);
            int iC = gun1Var.c();
            iG = x0d.g(iQ + iQ, iQ2, lqn1.d(iC, iC, iQ3), iG);
        }
        n8o1Var.d = iG;
        return iG;
    }

    @Override // p.r6o1
    public final vyn1 zza() {
        qrn1 qrn1Var = this.a;
        if (qrn1Var instanceof vyn1) {
            return ((vyn1) qrn1Var).e();
        }
        dyn1 dyn1Var = (dyn1) ((vyn1) qrn1Var).b(5, null);
        boolean zC = dyn1Var.b.c();
        vyn1 vyn1Var = dyn1Var.b;
        if (!zC) {
            return vyn1Var;
        }
        vyn1Var.f();
        return dyn1Var.b;
    }

    @Override // p.r6o1
    public final boolean zzl(Object obj) {
        throw td6.k(obj);
    }
}
