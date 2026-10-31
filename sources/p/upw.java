package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class upw extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upw(long j, tob1 tob1Var, float f, float f2, tob1 tob1Var2, float f3, ie5 ie5Var) {
        super(1);
        this.b = j;
        this.c = tob1Var;
        this.d = f;
        this.e = f2;
        this.g = tob1Var2;
        this.f = f3;
        this.h = ie5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        tob1 tob1Var = this.c;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                if (((u8s0) obj3) != null) {
                    zje1 zje1Var = (zje1) tob1Var.getValue();
                    float f4 = zje1Var.a;
                    float f5 = zje1Var.b;
                    float fO = yoi1.o((float) Math.sqrt((f5 * f5) + (f4 * f4)), 0.0f, 1.0f);
                    float fO2 = yoi1.o(f3 - (Float.intBitsToFloat((int) (lslVar.j() >> 32)) * (zje1Var.a * 0.5f)), 0.0f, Float.intBitsToFloat((int) (lslVar.j() >> 32)));
                    float fO3 = yoi1.o(f2 - (Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) * (f5 * 0.5f)), 0.0f, Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)));
                    Float fValueOf = Float.valueOf(0.0f);
                    long j2 = u7h.f;
                    qoz0 qoz0VarP = v9c.p(new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(j2, d1o1.h(0.3f * fO, u7h.c(j)), 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.5f), new u7h(u7h.b(j2, d1o1.h(fO * 0.04f, u7h.c(j)), 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, (((long) Float.floatToRawIntBits(fO2)) << 32) | (((long) Float.floatToRawIntBits(fO3)) & 4294967295L), f, 8);
                    u8s0 u8s0Var = (u8s0) obj3;
                    long j3 = this.b;
                    phc1 phc1Var = (phc1) obj2;
                    cab cabVarA1 = lslVar.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        ((dg8) cabVarA1.b).i(u8s0Var, 1);
                        DrawScope.w0(lslVar, u8s0Var, j3, phc1Var, 52);
                        DrawScope.j1(lslVar, u8s0Var, qoz0VarP, 0.0f, phc1Var, 52);
                    } finally {
                        i3a.n(cabVarA1, jU);
                    }
                }
                return rih1Var;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                kch0.f((float[]) obj3, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 1916);
                l9d1 l9d1Var = (l9d1) obj2;
                float[] fArr = (float[]) obj3;
                ((zv61) l9d1Var).c = fArr;
                ffe1 ffe1Var = ((zv61) l9d1Var).a;
                if (ffe1Var != null) {
                    ffe1Var.s(fArr);
                }
                float f6 = -f3;
                DrawScope.c0(drawScope, l9d1Var, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) + f2)) << 32), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, new phc1(this.e, 0.0f, 0, 0, (uw4) null, 30), 208);
                return rih1Var;
            default:
                kd31 kd31Var = (kd31) obj;
                a2t0 a2t0VarS = pwo1.s(((Number) tob1Var.getValue()).floatValue(), this.d, this.e, ((Number) ((tob1) obj3).getValue()).floatValue(), this.b);
                Offset offset = a2t0VarS != null ? new Offset(a2t0VarS.a) : null;
                if (offset == null) {
                    kd31Var.b(0.0f);
                } else {
                    long j4 = offset.a;
                    kd31Var.b(pwo1.q(offset, Float.intBitsToFloat((int) (kd31Var.R0 >> 32)), Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)), f3, f2) ? 1.0f : 0.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (kd31Var.R0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)) / 2.0f;
                    kd31Var.C((float) Math.rint(Float.intBitsToFloat((int) (j4 >> 32)) - fIntBitsToFloat));
                    kd31Var.E((float) Math.rint((Float.intBitsToFloat((int) (j4 & 4294967295L)) - fIntBitsToFloat2) - (((Number) ((tob1) obj2).getValue()).floatValue() * f)));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upw(u8s0 u8s0Var, tob1 tob1Var, float f, float f2, long j, float f3, phc1 phc1Var) {
        super(1);
        this.g = u8s0Var;
        this.c = tob1Var;
        this.d = f;
        this.e = f2;
        this.b = j;
        this.f = f3;
        this.h = phc1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upw(float[] fArr, long j, tob1 tob1Var, l9d1 l9d1Var, float f, float f2, float f3) {
        super(1);
        this.g = fArr;
        this.b = j;
        this.c = tob1Var;
        this.h = l9d1Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }
}
