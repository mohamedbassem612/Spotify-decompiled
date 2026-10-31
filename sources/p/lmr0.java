package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lmr0 extends pim0 implements zlb0, m7v {
    public jmr0 O0;
    public boolean P0;
    public tl3 Q0;
    public j6m R0;
    public float S0;
    public ColorFilter T0;

    public static boolean I1(long j) {
        return !Size.c(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean J1(long j) {
        return !Size.c(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean H1() {
        return this.P0 && this.O0.i() != 9205357640488583168L;
    }

    public final long K1(long j) {
        boolean z = false;
        boolean z2 = hjl.e(j) && hjl.d(j);
        if (hjl.g(j) && hjl.f(j)) {
            z = true;
        }
        if ((!H1() && z2) || z) {
            return hjl.b(j, hjl.i(j), 0, hjl.h(j), 0, 10);
        }
        long jI = this.O0.i();
        int iRound = J1(jI) ? Math.round(Float.intBitsToFloat((int) (jI >> 32))) : hjl.k(j);
        int iRound2 = I1(jI) ? Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) : hjl.j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(jjl.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(jjl.g(iRound, j))) << 32);
        if (H1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!J1(this.O0.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.O0.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!I1(this.O0.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.O0.i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : t3k1.O(jFloatToRawIntBits2, this.R0.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return hjl.b(j, jjl.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, jjl.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // p.zlb0
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!H1()) {
            return afh0Var.w(i);
        }
        long jK1 = K1(jjl.b(0, 0, 0, i, 7));
        return Math.max(hjl.k(jK1), afh0Var.w(i));
    }

    @Override // p.zlb0
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!H1()) {
            return afh0Var.C(i);
        }
        long jK1 = K1(jjl.b(0, 0, 0, i, 7));
        return Math.max(hjl.k(jK1), afh0Var.C(i));
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(K1(j));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 12));
    }

    @Override // p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!H1()) {
            return afh0Var.n(i);
        }
        long jK1 = K1(jjl.b(0, i, 0, 0, 13));
        return Math.max(hjl.j(jK1), afh0Var.n(i));
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        long jI = this.O0.i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(J1(jI) ? Float.intBitsToFloat((int) (jI >> 32)) : Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(I1(jI) ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L);
        long jO = (Float.intBitsToFloat((int) (lslVar.j() >> 32)) == 0.0f || Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) == 0.0f) ? 0L : t3k1.O(jFloatToRawIntBits, this.R0.a(jFloatToRawIntBits, lslVar.j()));
        long jA = this.Q0.a((((long) Math.round(Float.intBitsToFloat((int) (jO >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jO & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L), lslVar.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        lslVar.a1().v().z(f, f2);
        try {
            this.O0.e(lslVar, jO, this.S0, this.T0);
            lslVar.a1().v().z(-f, -f2);
            lslVar.s1();
        } catch (Throwable th) {
            lslVar.a1().v().z(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.O0 + ", sizeToIntrinsics=" + this.P0 + ", alignment=" + this.Q0 + ", alpha=" + this.S0 + ", colorFilter=" + this.T0 + ")";
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        if (!H1()) {
            return afh0Var.d(i);
        }
        long jK1 = K1(jjl.b(0, i, 0, 0, 13));
        return Math.max(hjl.j(jK1), afh0Var.d(i));
    }
}
