package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i7e1 implements b4e1 {
    public final qga0 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public qr50 e = qr50.c;
    public boolean f = true;
    public f341 g = w1x0.X;
    public final /* synthetic */ r7e1 h;

    public i7e1(r7e1 r7e1Var, qga0 qga0Var) {
        this.h = r7e1Var;
        this.a = qga0Var;
    }

    @Override // p.b4e1
    public final void a() {
        f();
    }

    @Override // p.b4e1
    public final void b(long j, f341 f341Var) {
        r7e1 r7e1Var = this.h;
        boolean z = r7e1Var.i;
        ggg1 ggg1Var = r7e1Var.a;
        aae1 aae1Var = r7e1Var.b;
        if (z) {
            r7e1Var.A(this.e, j);
            r7e1Var.w(false);
            r7e1Var.r.setValue(g7e1.b);
            this.c = j;
            this.d = 0L;
            r7e1Var.w = -1;
            this.f = true;
            this.g = f341Var;
            if (aae1Var.c() == null) {
                return;
            }
            if (aae1Var.f(j)) {
                if (ggg1Var.h().d.length() == 0) {
                    return;
                }
                int iD = aae1Var.d(j, true);
                long jB = r7e1Var.B(new i4e1(r7e1Var.a.h(), nbe1.b, (nbe1) null, (mmr0) null, (List) null, (List) null, (b8e1) null, 124), iD, iD, false, this.g, false, false, new vs50(0));
                ggg1Var.o(jB);
                r7e1Var.x(ree1.c);
                this.b = (int) (jB >> 32);
                return;
            }
            int iD2 = aae1Var.d(j, true);
            sct0 sct0Var = r7e1Var.k;
            if (sct0Var != null) {
                sct0Var.a(0);
            }
            ggg1Var.getClass();
            ggg1Var.o(e6p1.e(iD2, iD2));
            r7e1Var.w(true);
            this.f = false;
            r7e1Var.x(ree1.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[PHI: r16
      0x00ff: PHI (r16v4 long) = (r16v3 long), (r16v5 long) binds: [B:60:0x0113, B:56:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.b4e1
    public final void e(long j) {
        int iIntValue;
        int iD;
        f341 f341Var;
        af5 af5Var;
        long j2;
        r7e1 r7e1Var = this.h;
        boolean z = r7e1Var.i;
        ggg1 ggg1Var = r7e1Var.a;
        aae1 aae1Var = r7e1Var.b;
        if (!z || aae1Var.c() == null || ggg1Var.h().d.length() == 0) {
            return;
        }
        long jG = Offset.g(this.d, j);
        this.d = jG;
        long jG2 = Offset.g(this.c, jG);
        if (this.b >= 0 || aae1Var.f(jG2)) {
            y9e1 y9e1VarC = aae1Var.c();
            int length = (y9e1VarC == null || (af5Var = y9e1VarC.a.a) == null) ? 0 : af5Var.b.length();
            int i = this.b;
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > length) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : aae1Var.d(this.c, false);
            iD = aae1Var.d(jG2, false);
            if (this.b < 0 && iIntValue == iD) {
                return;
            }
            f341Var = this.g;
            r7e1Var.x(ree1.c);
        } else {
            iIntValue = aae1Var.d(this.c, true);
            iD = aae1Var.d(jG2, true);
            f341Var = iIntValue == iD ? w1x0.X : this.g;
        }
        f341 f341Var2 = f341Var;
        int i2 = iIntValue;
        int i3 = iD;
        long j3 = ggg1Var.h().e;
        long jB = r7e1Var.B(r7e1Var.a.h(), i2, i3, false, f341Var2, false, false, new vs50(9));
        if (this.b == -1 && !nbe1.d(jB)) {
            this.b = (int) (jB >> 32);
        }
        if (nbe1.h(jB)) {
            jB = e6p1.e((int) (jB & 4294967295L), (int) (jB >> 32));
        }
        if (nbe1.c(jB, j3)) {
            j2 = j3;
        } else {
            int i4 = (int) (jB >> 32);
            int i5 = (int) (j3 >> 32);
            qr50 qr50Var = qr50.b;
            if (i4 == i5 || ((int) (jB & 4294967295L)) != ((int) (j3 & 4294967295L))) {
                qr50 qr50Var2 = qr50.c;
                if (i4 == i5) {
                    j2 = j3;
                    if (((int) (jB & 4294967295L)) != ((int) (j2 & 4294967295L))) {
                        qr50Var = qr50Var2;
                    }
                } else {
                    j2 = j3;
                }
                if ((i4 + ((int) (jB & 4294967295L))) / 2.0f > (i5 + ((int) (j2 & 4294967295L))) / 2.0f) {
                    qr50Var = qr50Var2;
                }
            } else {
                j2 = j3;
            }
            this.e = qr50Var;
            this.f = false;
        }
        if (nbe1.d(j2) || !nbe1.d(jB)) {
            ggg1Var.o(jB);
        }
        r7e1Var.A(this.e, jG2);
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            r7e1 r7e1Var = this.h;
            r7e1Var.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            r7e1Var.w = -1;
            this.g = w1x0.X;
            r7e1Var.r.setValue(g7e1.a);
            this.a.invoke();
            if (this.f) {
                r7e1Var.r();
            }
        }
    }

    @Override // p.b4e1
    public final void onCancel() {
        f();
    }

    @Override // p.b4e1
    public final void c() {
    }

    @Override // p.b4e1
    public final void d() {
    }
}
