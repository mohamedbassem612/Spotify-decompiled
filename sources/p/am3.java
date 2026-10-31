package p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class am3 {
    public final bm3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public bm3 h;
    public final HashMap i;

    public am3(bm3 bm3Var) {
        this.a = bm3Var;
        this.b = true;
        this.i = new HashMap();
    }

    public final void a(ul3 ul3Var, int i, ndo0 ndo0Var) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(ndo0Var, jB);
                ndo0Var = ndo0Var.Y0;
                ndo0Var.getClass();
                if (ndo0Var.equals(this.a.r())) {
                    break loop0;
                }
            } while (!c(ndo0Var).containsKey(ul3Var));
            float f2 = f(ndo0Var, ul3Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(f2);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(ul3Var instanceof vq60 ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        HashMap map = this.i;
        if (map.containsKey(ul3Var)) {
            int iIntValue = ((Number) sqg0.G(ul3Var, map)).intValue();
            vq60 vq60Var = xl3.a;
            iRound = ((Number) ul3Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(ul3Var, Integer.valueOf(iRound));
    }

    public long b(ndo0 ndo0Var, long j) {
        ge50 ge50Var = ndo0Var.v1;
        if (ge50Var != null) {
            ge50 ge50Var2 = ge50Var;
            float[] fArrB = ge50Var2.b();
            if (!ge50Var2.S0) {
                j = kch0.b(j, fArrB);
            }
        }
        return dm5.X(j, ndo0Var.h1);
    }

    public Map c(ndo0 ndo0Var) {
        return ndo0Var.A0().c();
    }

    public final boolean d() {
        return this.b;
    }

    public final HashMap e() {
        return this.i;
    }

    public int f(ndo0 ndo0Var, ul3 ul3Var) {
        return ndo0Var.U(ul3Var);
    }

    public final boolean g() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean h() {
        l();
        return this.h != null;
    }

    public final boolean i() {
        return this.d;
    }

    public final void j() {
        this.b = true;
        bm3 bm3Var = this.a;
        bm3 bm3VarE = bm3Var.e();
        if (bm3VarE == null) {
            return;
        }
        if (this.c) {
            bm3VarE.T();
        } else if (this.e || this.d) {
            bm3VarE.requestLayout();
        }
        if (this.f) {
            bm3Var.T();
        }
        if (this.g) {
            bm3Var.requestLayout();
        }
        bm3VarE.c().j();
    }

    public final void k() {
        HashMap map = this.i;
        map.clear();
        j6 j6Var = new j6(this, (byte) 4);
        bm3 bm3Var = this.a;
        bm3Var.x(j6Var);
        map.putAll(c(bm3Var.r()));
        this.b = false;
    }

    public final void l() {
        am3 am3VarC;
        am3 am3VarC2;
        boolean zG = g();
        bm3 bm3Var = this.a;
        if (!zG) {
            bm3 bm3VarE = bm3Var.e();
            if (bm3VarE == null) {
                return;
            }
            bm3Var = bm3VarE.c().h;
            if (bm3Var == null || !bm3Var.c().g()) {
                bm3 bm3Var2 = this.h;
                if (bm3Var2 == null || bm3Var2.c().g()) {
                    return;
                }
                bm3 bm3VarE2 = bm3Var2.e();
                if (bm3VarE2 != null && (am3VarC2 = bm3VarE2.c()) != null) {
                    am3VarC2.l();
                }
                bm3 bm3VarE3 = bm3Var2.e();
                bm3Var = (bm3VarE3 == null || (am3VarC = bm3VarE3.c()) == null) ? null : am3VarC.h;
            }
        }
        this.h = bm3Var;
    }

    public final void m() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void n(boolean z) {
        this.e = z;
    }

    public final void o(boolean z) {
        this.g = z;
    }

    public final void p(boolean z) {
        this.f = z;
    }

    public final void q(boolean z) {
        this.d = z;
    }

    public final void r(boolean z) {
        this.c = z;
    }

    public /* synthetic */ am3(c6f0 c6f0Var) {
        this((bm3) c6f0Var);
    }
}
