package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n3f0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3f0(o95 o95Var, tob1 tob1Var, lw4 lw4Var, jm60 jm60Var, lw4 lw4Var2, mic0 mic0Var, float f, float f2, dui1 dui1Var) {
        super(1);
        this.d = o95Var;
        this.e = tob1Var;
        this.f = lw4Var;
        this.h = jm60Var;
        this.g = lw4Var2;
        this.i = mic0Var;
        this.b = f;
        this.c = f2;
        this.t = dui1Var;
    }

    public final Object invoke(Object obj) throws Throwable {
        DrawScope drawScope;
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.d;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                DrawScope drawScope2 = (lsl) obj;
                float fFloatValue = ((Number) ((o95) obj7).e()).floatValue();
                if (fFloatValue <= 0.0f) {
                    drawScope2.s1();
                    return rih1Var;
                }
                fid fidVar = (zje1) ((tob1) obj8).getValue();
                fid fidVarP = drawScope2.a1().p();
                n511 n511VarG = anm1.g(0L, drawScope2.j());
                lw4 lw4Var = (lw4) obj6;
                jm60 jm60Var = (jm60) obj4;
                float f = jm60Var.c;
                float f2 = jm60Var.b;
                float f3 = jm60Var.a;
                lw4 lw4Var2 = (lw4) obj5;
                mic0 mic0Var = (mic0) obj3;
                float f4 = this.b;
                float f5 = this.c;
                dui1 dui1Var = (dui1) obj2;
                try {
                    try {
                        fidVarP.j(n511VarG, lw4Var);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.j() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L));
                        float f6 = (f / 2.0f) + f2;
                        List list = p3f0.a;
                        float f7 = fIntBitsToFloat2 * 5.0f;
                        float f8 = ((f / 2.0f) + f3) - ((fIntBitsToFloat * 5.0f) / 2.0f);
                        float f9 = f / 2.0f;
                        float fO = yoi1.o(f6 - (((((yoi1.o(fidVar.b, -1.0f, 1.0f) + 1.0f) / 2.0f) * 0.79999995f) + 0.1f) * f7), (f6 + f9) - f7, f6 - f9);
                        ((dg8) drawScope2.a1().b).z(f8, fO);
                        try {
                            fidVar = fidVarP;
                            drawScope = drawScope2;
                            try {
                                DrawScope.S0(drawScope, mic0Var, 0L, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), fFloatValue, (DrawStyle) null, (ColorFilter) null, 0, 114);
                                ((dg8) drawScope.a1().b).z(-f8, -fO);
                                fid fidVarP2 = drawScope.a1().p();
                                try {
                                    fidVarP2.j(anm1.g(0L, drawScope.j()), lw4Var2);
                                    ((dg8) drawScope.a1().b).z(f3, f2);
                                    try {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                                        long j2 = u7h.f;
                                        try {
                                            jmr0.g(dui1Var, drawScope, jFloatToRawIntBits, 0.0f, new f2b(j2, 5), 2);
                                            ((dg8) drawScope.a1().b).z(-f3, -f2);
                                            fidVarP2.i();
                                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                                            float fO2 = yoi1.o(fidVar.a, -0.27f, 0.27f);
                                            float fO3 = yoi1.o(fidVar.b, -0.12f, 0.12f);
                                            float fSqrt = (float) Math.sqrt((fO3 * fO3) + (fO2 * fO2));
                                            if (fSqrt > 1.0f) {
                                                fSqrt = 1.0f;
                                            }
                                            float f10 = ((0.8f * fSqrt) + 0.45f) * fIntBitsToFloat3;
                                            float f11 = ((0.5f * fSqrt) + 0.65f) * fIntBitsToFloat4;
                                            float f12 = f / 2.0f;
                                            float fO4 = yoi1.o(((fO2 * f) / 2.0f) + f12 + f3, f3, f3 + f);
                                            float fO5 = yoi1.o(((fO3 * f) / 2.0f) + f12 + f2, f2, f2 + f);
                                            float f13 = f11 / f10;
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fO4)) << 32) | (((long) Float.floatToRawIntBits(fO5)) & 4294967295L);
                                            cab cabVarA1 = drawScope.a1();
                                            long jU = cabVarA1.u();
                                            cabVarA1.p().q();
                                            try {
                                                ((dg8) cabVarA1.b).t(1.0f, f13, jFloatToRawIntBits2);
                                                mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14)));
                                                Float fValueOf = Float.valueOf(0.7f);
                                                long j3 = u7h.j;
                                                qoz0 qoz0VarP = v9c.p(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(j3)), new mmr0(Float.valueOf(1.0f), new u7h(j3))}, (((long) Float.floatToRawIntBits(fO4)) << 32) | (((long) Float.floatToRawIntBits(fO5)) & 4294967295L), f10 / 2.0f, 8);
                                                long jFloatToRawIntBits3 = (Float.floatToRawIntBits(0.0f) << 32) | (((long) Float.floatToRawIntBits(fO5 - (fO5 / f13))) & 4294967295L);
                                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                                                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / f13;
                                                long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                                j = jU;
                                                try {
                                                    DrawScope.S0(drawScope, qoz0VarP, jFloatToRawIntBits3, (jFloatToRawIntBits4 << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                                                    cabVarA1.p().i();
                                                    cabVarA1.D(j);
                                                    fidVar.i();
                                                    drawScope.s1();
                                                    return rih1Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cabVarA1.p().i();
                                                    cabVarA1.D(j);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j = jU;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            drawScope = drawScope;
                                            ((dg8) drawScope.a1().b).z(-f3, -f2);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    fidVarP2.i();
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                ((dg8) drawScope.a1().b).z(-f8, -fO);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            drawScope = drawScope2;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fidVar = fidVarP;
                        fidVar.i();
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    fidVar.i();
                    throw th;
                }
                break;
            default:
                vi11 vi11Var = (vi11) obj8;
                rtb0 rtb0Var = (rtb0) obj;
                mf60 mf60Var = (mf60) obj7;
                if (mf60Var != null) {
                    rtb0.c(rtb0Var, "highlights-shelf", new j2i(-942122885, new xw91(mf60Var, vi11Var, (byte) 13), true), 2);
                }
                rtb0.c(rtb0Var, "summary-columns", new j2i(219345910, new czc1(this.b, this.c, (cvx) obj6, (x5r) obj5, (w4g) obj4, (usb1) obj3, vi11Var, (k7s0) obj2), true), 2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3f0(mf60 mf60Var, vi11 vi11Var, float f, float f2, cvx cvxVar, x5r x5rVar, w4g w4gVar, usb1 usb1Var, k7s0 k7s0Var) {
        super(1);
        this.d = mf60Var;
        this.e = vi11Var;
        this.b = f;
        this.c = f2;
        this.f = cvxVar;
        this.g = x5rVar;
        this.h = w4gVar;
        this.i = usb1Var;
        this.t = k7s0Var;
    }
}
