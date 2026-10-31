package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class idl1 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pmg1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ tob1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idl1(float f, boolean z, pmg1 pmg1Var, long j, boolean z2, long j2, tob1 tob1Var) {
        super(1);
        this.a = f;
        this.b = z;
        this.c = pmg1Var;
        this.d = j;
        this.e = z2;
        this.f = j2;
        this.g = tob1Var;
    }

    public final Object invoke(Object obj) {
        int i;
        int i2;
        DrawScope drawScope = (DrawScope) obj;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.534f);
        Float fValueOf3 = Float.valueOf(0.0f);
        float fX0 = drawScope.X0(this.a);
        boolean z = this.b;
        pmg1 pmg1Var = this.c;
        if (z) {
            float fFloatValue = ((Number) this.g.getValue()).floatValue();
            int i3 = qmg1.b;
            float f = pmg1Var.g;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L);
            float f2 = pmg1Var.i;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            float fX1 = drawScope.X0(12.0f);
            float fX2 = drawScope.X0(12.0f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fX1);
            DrawScope.g0(drawScope, this.d, jFloatToRawIntBits2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fX2)) & 4294967295L) | (jFloatToRawIntBits3 << 32), (DrawStyle) null, 0.0f, 0, 240);
            mic0 mic0VarL = v9c.l(new mmr0[]{new mmr0(fValueOf3, new u7h(z4p1.e(1301911961))), new mmr0(fValueOf2, new u7h(z4p1.g(4288256409L))), new mmr0(fValueOf, new u7h(z4p1.e(1301911961)))}, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 0);
            int iX = f4p1.x(pmg1Var.d, jch0.U(fFloatValue));
            float f3 = fX0 / 2.0f;
            float f4 = f / fFloatValue;
            int iU = jch0.U(fFloatValue);
            int i4 = 1;
            while (i4 < iU) {
                float f5 = ((i4 * f4) + f2) - f3;
                if (f5 >= Float.intBitsToFloat((int) (drawScope.j() >> 32)) || f5 + fX0 <= 0.0f) {
                    i2 = i4;
                } else {
                    i2 = i4;
                    DrawScope.c0(drawScope, mic0VarL, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), 0L, 0.2f, (DrawStyle) null, 232);
                }
                i4 = i2 + 1;
            }
            if (iX >= 2) {
                int iU2 = jch0.U(fFloatValue);
                int i5 = 0;
                while (i5 < iU2) {
                    float f6 = (i5 * f4) + f2;
                    int i6 = 1;
                    while (i6 < iX) {
                        float f7 = ((i6 * f4) / iX) + f6;
                        float f8 = 0.5f * fX0;
                        if (f7 >= Float.intBitsToFloat((int) (drawScope.j() >> 32)) || f7 + f8 <= 0.0f) {
                            i = i5;
                        } else {
                            i = i5;
                            DrawScope.c0(drawScope, mic0VarL, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), 0L, 0.14f, (DrawStyle) null, 232);
                        }
                        i6++;
                        i5 = i;
                    }
                    i5++;
                }
            }
            if (this.e) {
                float f9 = pmg1Var.i;
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f9 - f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L);
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long j = this.f;
                DrawScope.g0(drawScope, j, jFloatToRawIntBits4, jFloatToRawIntBits5, jFloatToRawIntBits6, (DrawStyle) null, 0.0f, 0, 240);
                DrawScope.g0(drawScope, j, (((long) Float.floatToRawIntBits((f9 + pmg1Var.b) - f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
            }
        } else {
            int i7 = qmg1.b;
            mic0 mic0VarL2 = v9c.l(new mmr0[]{new mmr0(fValueOf3, new u7h(z4p1.e(1301911961))), new mmr0(fValueOf2, new u7h(z4p1.g(4288256409L))), new mmr0(fValueOf, new u7h(z4p1.e(1301911961)))}, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 0);
            float f10 = fX0 / 2.0f;
            DrawScope.c0(drawScope, mic0VarL2, (((long) Float.floatToRawIntBits(((pmg1Var.b / 2.0f) + pmg1Var.i) - f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), 0.2f, (DrawStyle) null, 224);
        }
        return rih1.a;
    }
}
