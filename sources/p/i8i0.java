package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i8i0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8i0(long j, float f, long j2, float f2, drr0 drr0Var) {
        super(1);
        this.a = (byte) 0;
        this.d = j;
        this.b = f;
        this.e = j2;
        this.c = f2;
        this.f = drr0Var;
    }

    public final Object invoke(Object obj) throws Throwable {
        wat watVar;
        float f;
        long jA;
        wat watVar2;
        float f2;
        long j;
        long jA2;
        byte b = this.a;
        float f3 = 4.0f;
        rih1 rih1Var = rih1.a;
        long j2 = this.e;
        long j3 = this.d;
        Object obj2 = this.f;
        float f4 = this.c;
        float f5 = this.b;
        switch (b) {
            case 0:
                ((drr0) obj2).t(yoi1.o(f4 + ((((((Number) obj).longValue() - j3) / 1000000.0f) * f5) / j2), 0.0f, 1.0f));
                return rih1Var;
            case 1:
                wat watVar3 = (DrawScope) obj;
                float fX0 = watVar3.X0(f5);
                float fX1 = watVar3.X0(6.0f);
                float fX2 = watVar3.X0(f4);
                kes kesVar = (kes) obj2;
                int iMin = Math.min(kesVar.l(), 4);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (watVar3.j() >> 32)) - (((iMin - 1) * fX2) + ((iMin * fX1) + fX0))) / 2.0f;
                float f6 = (-((Number) w0o1.m(kesVar).a).floatValue()) * fX1;
                float fFloatValue = (((Number) w0o1.m(kesVar).a).floatValue() - 1.0f) * fX2;
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                float f7 = (f6 - fFloatValue) + fIntBitsToFloat;
                ((dg8) watVar3.a1().b).z(f7, 0.0f);
                float f8 = fX1 / 2.0f;
                try {
                    int iL = kesVar.l();
                    float f9 = 0.0f;
                    int i = 0;
                    while (i < iL) {
                        int iL2 = (int) w0o1.l(kesVar);
                        int i2 = iL2 + 1;
                        float fL = (fX0 - fX1) * (w0o1.l(kesVar) % 1.0f);
                        if (i == iL2) {
                            f = fX0 - fL;
                        } else {
                            f = i == i2 ? fX1 + fL : fX1;
                        }
                        float fQ = w0o1.q(watVar3.X0(4.0f), f, i, kesVar);
                        float fQ2 = w0o1.q(watVar3.X0(4.0f), fX1, i, kesVar);
                        try {
                            int iL3 = (int) w0o1.l(kesVar);
                            float f10 = fX0;
                            int i3 = iL3 + 1;
                            if (i == iL3) {
                                jA = z4p1.A(w0o1.l(kesVar) % 1.0f, j3, j2);
                            } else {
                                jA = i == i3 ? z4p1.A(w0o1.l(kesVar) % 1.0f, j2, j3) : j2;
                            }
                            float f11 = fQ2 / 2.0f;
                            wat watVar4 = watVar3;
                            try {
                                vq31 vq31VarG = ila0.g(f9, f8 - f11, f9 + fQ, f8 + f11, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
                                int i4 = iL;
                                tw4 tw4VarA = ww4.a();
                                tw4VarA.e(vq31VarG, 1);
                                int i5 = i;
                                watVar = watVar4;
                                float f12 = f;
                                try {
                                    DrawScope.w0(watVar, tw4VarA, jA, (DrawStyle) null, 60);
                                    f9 = f12 + fX2 + f9;
                                    iL = i4;
                                    watVar3 = watVar;
                                    i = i5 + 1;
                                    fX0 = f10;
                                } catch (Throwable th) {
                                    th = th;
                                    ((dg8) watVar.a1().b).z(-f7, -0.0f);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                watVar = watVar4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            watVar = watVar3;
                            ((dg8) watVar.a1().b).z(-f7, -0.0f);
                            throw th;
                        }
                    }
                    ((dg8) watVar3.a1().b).z(-f7, -0.0f);
                    return rih1Var;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                wat watVar5 = (DrawScope) obj;
                float fX3 = watVar5.X0(f5);
                float fX4 = watVar5.X0(6.0f);
                float fX5 = watVar5.X0(f4);
                jkr0 jkr0Var = (jkr0) obj2;
                float f13 = fX4 + fX5;
                float fIntBitsToFloat2 = (f13 * (-((Number) z0o1.o(jkr0Var).a).floatValue())) + ((Float.intBitsToFloat((int) (watVar5.j() >> 32)) - (((Math.min(jkr0Var.l(), 4) - 1) * f13) + fX3)) / 2.0f);
                ((dg8) watVar5.a1().b).z(fIntBitsToFloat2, 0.0f);
                float f14 = fX4 / 2.0f;
                try {
                    int iL4 = jkr0Var.l();
                    float f15 = 0.0f;
                    int i6 = 0;
                    while (i6 < iL4) {
                        int iN = (int) z0o1.n(jkr0Var);
                        int i7 = iN + 1;
                        float fN = (fX3 - fX4) * (z0o1.n(jkr0Var) % 1.0f);
                        if (i6 == iN) {
                            f2 = fX3 - fN;
                        } else {
                            f2 = i6 == i7 ? fX4 + fN : fX4;
                        }
                        float fT = z0o1.t(jkr0Var, i6, watVar5.X0(f3), f2);
                        float f16 = fX3;
                        float fT2 = z0o1.t(jkr0Var, i6, watVar5.X0(f3), fX4);
                        try {
                            int iN2 = (int) z0o1.n(jkr0Var);
                            int i8 = iN2 + 1;
                            try {
                                try {
                                    if (i6 == iN2) {
                                        jA2 = z4p1.A(z0o1.n(jkr0Var) % 1.0f, j3, j2);
                                    } else {
                                        if (i6 == i8) {
                                            jA2 = z4p1.A(z0o1.n(jkr0Var) % 1.0f, j2, j3);
                                        } else {
                                            j = j2;
                                        }
                                        float f17 = fT2 / 2.0f;
                                        watVar2 = watVar5;
                                        vq31 vq31VarG2 = ila0.g(f15, f14 - f17, f15 + fT, f14 + f17, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L));
                                        float f18 = f15;
                                        tw4 tw4VarA2 = ww4.a();
                                        tw4VarA2.e(vq31VarG2, 1);
                                        DrawScope.w0(watVar2, tw4VarA2, j, (DrawStyle) null, 60);
                                        f15 = f2 + fX5 + f18;
                                        i6++;
                                        fX3 = f16;
                                        watVar5 = watVar2;
                                        f3 = 4.0f;
                                    }
                                    DrawScope.w0(watVar2, tw4VarA2, j, (DrawStyle) null, 60);
                                    f15 = f2 + fX5 + f18;
                                    i6++;
                                    fX3 = f16;
                                    watVar5 = watVar2;
                                    f3 = 4.0f;
                                } catch (Throwable th5) {
                                    th = th5;
                                    watVar2 = watVar2;
                                    ((dg8) watVar2.a1().b).z(-fIntBitsToFloat2, -0.0f);
                                    throw th;
                                }
                                vq31 vq31VarG3 = ila0.g(f15, f14 - f17, f15 + fT, f14 + f17, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L));
                                float f19 = f15;
                                tw4 tw4VarA3 = ww4.a();
                                tw4VarA3.e(vq31VarG3, 1);
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            j = jA2;
                            float f110 = fT2 / 2.0f;
                            watVar2 = watVar5;
                        } catch (Throwable th7) {
                            th = th7;
                            watVar2 = watVar5;
                            ((dg8) watVar2.a1().b).z(-fIntBitsToFloat2, -0.0f);
                            throw th;
                        }
                    }
                    ((dg8) watVar5.a1().b).z(-fIntBitsToFloat2, -0.0f);
                    return rih1Var;
                } catch (Throwable th8) {
                    th = th8;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8i0(float f, float f2, jkr0 jkr0Var, long j, long j2, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.f = jkr0Var;
        this.d = j;
        this.e = j2;
    }
}
