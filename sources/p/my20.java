package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class my20 extends pim0 implements m7v, j4k {
    public final idn0 O0;
    public final iu30 P0;
    public final hw61 Q0;
    public final p3v R0;
    public ArrayList S0;

    public my20(idn0 idn0Var, iu30 iu30Var, hw61 hw61Var, p3v p3vVar) {
        this.O0 = idn0Var;
        this.P0 = iu30Var;
        this.Q0 = hw61Var;
        this.R0 = p3vVar;
    }

    @Override // p.pim0
    public final void B1() {
        boolean zH1 = H1();
        ArrayList arrayList = this.S0;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (zH1) {
            ha71.x(this);
        }
    }

    public final boolean H1() {
        ArrayList arrayList = this.S0;
        return arrayList != null && (arrayList.isEmpty() ^ true);
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        float f;
        long j;
        char c;
        long j2;
        z1a1 jtq0Var;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        lslVar.s1();
        if (!H1()) {
            return;
        }
        long j3 = ((u7h) this.P0.invoke(this)).a;
        float fX0 = lslVar.X0(2.0f);
        p3v p3vVar = this.R0;
        float fX1 = (fX0 / 2.0f) + (p3vVar != null ? lslVar.X0(p3vVar.a) : fX0 / 2.0f);
        float f2 = fX1 * 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) + f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f2)) & 4294967295L);
        z1a1 z1a1VarA = this.Q0.a(jFloatToRawIntBits, lslVar.getLayoutDirection(), lslVar);
        try {
            if (z1a1VarA instanceof jtq0) {
                vq31 vq31Var = ((jtq0) z1a1VarA).c;
                long j4 = vq31Var.g;
                j = j3;
                long j5 = vq31Var.h;
                f = 2.0f;
                long j6 = vq31Var.f;
                j2 = 4294967295L;
                long j7 = vq31Var.e;
                c = ' ';
                long j8 = j7 & 9223372034707292159L;
                if (((j8 - 4294967297L) & (~j8) & (-9223372034707292160L)) != 0) {
                    long j9 = j6 & 9223372034707292159L;
                    if (((j9 - 4294967297L) & (~j9) & (-9223372034707292160L)) != 0) {
                        long j10 = j5 & 9223372034707292159L;
                        if (((j10 - 4294967297L) & (~j10) & (-9223372034707292160L)) != 0) {
                            long j11 = j4 & 9223372034707292159L;
                            if (((j11 - 4294967297L) & (~j11) & (-9223372034707292160L)) != 0) {
                            }
                            fIntBitsToFloat = (Float.intBitsToFloat((int) (lslVar.j() >> c)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> c))) / f;
                            fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() & j2)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & j2))) / f;
                            lslVar.a1().v().z(fIntBitsToFloat, fIntBitsToFloat2);
                            vpb1.w(lslVar, jtq0Var, j, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 52);
                            return;
                        }
                    }
                }
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fX1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fX1)) << 32);
                jtq0Var = new jtq0(new vq31(vq31Var.a, vq31Var.b, vq31Var.c, vq31Var.d, iko1.w(j7, jFloatToRawIntBits2), iko1.w(j6, jFloatToRawIntBits2), iko1.w(j4, jFloatToRawIntBits2), iko1.w(j5, jFloatToRawIntBits2)));
                fIntBitsToFloat = (Float.intBitsToFloat((int) (lslVar.j() >> c)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> c))) / f;
                fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() & j2)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & j2))) / f;
                lslVar.a1().v().z(fIntBitsToFloat, fIntBitsToFloat2);
                vpb1.w(lslVar, jtq0Var, j, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 52);
                return;
            }
            f = 2.0f;
            j = j3;
            c = ' ';
            j2 = 4294967295L;
            vpb1.w(lslVar, jtq0Var, j, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 52);
            return;
        } finally {
            lslVar.a1().v().z(-fIntBitsToFloat, -fIntBitsToFloat2);
        }
        jtq0Var = z1a1VarA;
        fIntBitsToFloat = (Float.intBitsToFloat((int) (lslVar.j() >> c)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> c))) / f;
        fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() & j2)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & j2))) / f;
        lslVar.a1().v().z(fIntBitsToFloat, fIntBitsToFloat2);
    }

    @Override // p.pim0
    public final void z1() {
        c921.y(v1(), (o8n) null, 0, new mx(this, null, (byte) 23), 3);
    }
}
