package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ch10 extends pim0 implements m7v {
    public es41 O0;
    public float P0;
    public long Q0;

    public final void t0(lsl lslVar) {
        err0 err0Var;
        float f;
        long j;
        char c;
        Float fValueOf = Float.valueOf(0.83f);
        Float fValueOf2 = Float.valueOf(0.55f);
        Float fValueOf3 = Float.valueOf(0.45f);
        Float fValueOf4 = Float.valueOf(0.17f);
        Float fValueOf5 = Float.valueOf(0.0f);
        Float fValueOf6 = Float.valueOf(1.0f);
        lslVar.s1();
        long jB = Size.b(lslVar.j(), 2, lslVar.X0(this.P0), 0.0f);
        int iOrdinal = lslVar.getLayoutDirection().ordinal();
        if (iOrdinal == 0) {
            es41 es41Var = this.O0;
            long j2 = this.Q0;
            boolean zD = es41Var.d();
            err0 err0Var2 = es41Var.a;
            if (zD) {
                int i = (int) (jB >> 32);
                float fIntBitsToFloat = ((Float.intBitsToFloat((int) (lslVar.j() >> 32)) - es41Var.f.s()) - Float.intBitsToFloat(i)) + err0Var2.s();
                err0Var = err0Var2;
                DrawScope.S0(lslVar, v9c.k(new mmr0[]{new mmr0(fValueOf5, new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf2, new u7h(u7h.b(j2, 0.9f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf, new u7h(j2)), new mmr0(fValueOf6, new u7h(j2))}, fIntBitsToFloat, Float.intBitsToFloat(i) + fIntBitsToFloat, 8), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jB, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
            } else {
                err0Var = err0Var2;
            }
            if (es41Var.c()) {
                float fS = err0Var.s();
                DrawScope.S0(lslVar, v9c.k(new mmr0[]{new mmr0(fValueOf5, new u7h(j2)), new mmr0(fValueOf4, new u7h(j2)), new mmr0(fValueOf3, new u7h(u7h.b(j2, 0.9f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf6, new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, fS, Float.intBitsToFloat((int) (jB >> 32)) + fS, 8), (((long) Float.floatToRawIntBits(fS)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jB, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            eg.o();
            return;
        }
        es41 es41Var2 = this.O0;
        long j3 = this.Q0;
        boolean zD2 = es41Var2.d();
        err0 err0Var3 = es41Var2.a;
        if (zD2) {
            f = 0.0f;
            float fS2 = es41Var2.f.s() - err0Var3.s();
            c = ' ';
            j = j3;
            DrawScope.S0(lslVar, v9c.k(new mmr0[]{new mmr0(fValueOf5, new u7h(j3)), new mmr0(fValueOf4, new u7h(j3)), new mmr0(fValueOf3, new u7h(u7h.b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf6, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, fS2, Float.intBitsToFloat((int) (jB >> 32)) + fS2, 8), (((long) Float.floatToRawIntBits(fS2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jB, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
        } else {
            f = 0.0f;
            j = j3;
            c = ' ';
        }
        if (es41Var2.c()) {
            int i2 = (int) (jB >> c);
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (lslVar.j() >> c)) - err0Var3.s()) - Float.intBitsToFloat(i2);
            long j4 = j;
            DrawScope.S0(lslVar, v9c.k(new mmr0[]{new mmr0(fValueOf5, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf2, new u7h(u7h.b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(fValueOf, new u7h(j4)), new mmr0(fValueOf6, new u7h(j4))}, fIntBitsToFloat2, Float.intBitsToFloat(i2) + fIntBitsToFloat2, 8), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), jB, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
        }
    }
}
