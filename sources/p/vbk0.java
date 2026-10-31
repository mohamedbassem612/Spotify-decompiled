package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vbk0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbk0(byte b, float f) {
        super(1);
        this.a = b;
        this.b = f;
    }

    public final Object invoke(Object obj) throws Throwable {
        long j;
        byte b = this.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(f);
                float fX1 = drawScope.X0(4.0f);
                DrawScope.b0(drawScope, u7h.b(z4p1.g(4280211239L), 0.3f, 0.0f, 0.0f, 0.0f, 14), (drawScope.X0((((jch0.U(fX0 / drawScope.h()) - 48.0f) * 18.0f) / 16.0f) + 54.0f) / 2.0f) - (fX1 / 2.0f), drawScope.g1(), 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 104);
                float fX2 = drawScope.X0(3.0f);
                DrawScope.b0(drawScope, u7h.b(z4p1.g(4280211296L), 0.3f, 0.0f, 0.0f, 0.0f, 14), (fX2 / 2.0f) + (drawScope.X0((((jch0.U(fX0 / drawScope.h()) - 48.0f) * 16.0f) / 16.0f) + 56.0f) / 2.0f), drawScope.g1(), 0.0f, new phc1(fX2, 0.0f, 0, 0, (uw4) null, 30), 104);
                return rih1Var;
            case 1:
                DrawScope drawScope2 = (DrawScope) obj;
                float fX3 = drawScope2.X0(g3p1.o(drawScope2, 60.0f, 80.0f)) / 2.0f;
                DrawScope.b0(drawScope2, z4p1.g(4279374354L), fX3, drawScope2.g1(), 0.0f, (DrawStyle) null, 120);
                float fX4 = drawScope2.X0(0.75f);
                float f2 = (fX4 / 2.0f) + fX3;
                DrawScope.b0(drawScope2, z4p1.g(4280427042L), f2, drawScope2.g1(), 1.0f, new phc1(fX4, 0.0f, 0, 0, (uw4) null, 30), 96);
                DrawScope.o(drawScope2, aac.a, f2, drawScope2.g1(), 0.6f, new phc1(fX4, 0.0f, 0, 0, (uw4) null, 30), 96);
                float fE = ktd.e(drawScope2.X0(2.0f), f, Size.e(drawScope2.j()), 2.0f);
                DrawScope.o(drawScope2, aac.b, fE, drawScope2.g1(), 0.0f, (phc1) null, 120);
                DrawScope.o(drawScope2, aac.c, fE, drawScope2.g1(), 0.2f, (phc1) null, 112);
                DrawScope.o(drawScope2, aac.d, fE, drawScope2.g1(), 0.05f, (phc1) null, 112);
                if (f > 0.0f) {
                    DrawScope.b0(drawScope2, u7h.b, fE, drawScope2.g1(), f * 0.2f, (DrawStyle) null, 112);
                    fE = fE;
                }
                float fX5 = drawScope2.X0(g3p1.o(drawScope2, 2.0f, 2.5f));
                float fE2 = Size.e(drawScope2.j());
                cab cabVarA1 = drawScope2.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(fE2, fE2, 0L);
                    DrawScope.o(drawScope2, aac.e, (fE - (fX5 / 2.0f)) / Size.e(drawScope2.j()), (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L), 0.0f, new phc1(fX5 / Size.e(drawScope2.j()), 0.0f, 0, 0, (uw4) null, 30), 104);
                    i3a.n(cabVarA1, jU);
                    float fX6 = drawScope2.X0(g3p1.o(drawScope2, 51.0f, 68.0f)) / 2.0f;
                    float fX7 = drawScope2.X0(g3p1.o(drawScope2, 3.5f, 5.0f));
                    float fX8 = drawScope2.X0(0.5f);
                    float fX9 = drawScope2.X0(g3p1.o(drawScope2, 0.75f, 1.0f));
                    DrawScope.o(drawScope2, aac.f, (fX7 / 2.0f) + fX6, drawScope2.g1(), 0.0f, new phc1(fX7, 0.0f, 0, 0, (uw4) null, 30), 104);
                    long jG1 = drawScope2.g1();
                    cab cabVarA2 = drawScope2.a1();
                    long jU2 = cabVarA2.u();
                    cabVarA2.p().q();
                    try {
                        ((dg8) cabVarA2.b).s(60.0f, jG1);
                        DrawScope.o(drawScope2, aac.g, (fX6 + fX7) - (fX8 / 2.0f), drawScope2.g1(), 0.0f, new phc1(fX8, 0.0f, 0, 0, (uw4) null, 30), 104);
                        cabVarA2.p().i();
                        cabVarA2.D(jU2);
                        long jG2 = drawScope2.g1();
                        cab cabVarA3 = drawScope2.a1();
                        long jU3 = cabVarA3.u();
                        cabVarA3.p().q();
                        try {
                            ((dg8) cabVarA3.b).s(45.0f, jG2);
                            try {
                                DrawScope.o(drawScope2, aac.h, fX6 + (fX9 / 2.0f), drawScope2.g1(), 0.0f, new phc1(fX9, 0.0f, 0, 0, (uw4) null, 30), 104);
                                i3a.n(cabVarA3, jU3);
                                return rih1Var;
                            } catch (Throwable th) {
                                th = th;
                                j = jU3;
                                i3a.n(cabVarA3, j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = jU3;
                        }
                    } catch (Throwable th3) {
                        i3a.n(cabVarA2, jU2);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    i3a.n(cabVarA1, jU);
                    throw th4;
                }
                break;
            case 2:
                kd31 kd31Var = (kd31) obj;
                float fE3 = (Size.e(kd31Var.R0) - ((kd31Var.T0.h() * 2.0f) * f)) / Size.e(kd31Var.R0);
                kd31Var.q(fE3);
                kd31Var.r(fE3);
                return rih1Var;
            case 3:
                ((kd31) obj).b(1.0f - f);
                return rih1Var;
            case 4:
                ((kd31) obj).b(1.0f - f);
                return rih1Var;
            case 5:
                ((kd31) obj).b(f);
                return rih1Var;
            case 6:
                ((kd31) obj).b(f);
                return rih1Var;
            case 7:
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.a1().getClass();
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                long j2 = ((vex) zscVar.b).a;
                DrawScope.S0(drawScope3, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.45f), new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.6f), new u7h(u7h.b(((yex) zscVar.d).a, 0.2f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14)))}, 0L, Float.intBitsToFloat((int) (drawScope3.j() >> 32)) / 2.0f, 10), 0L, 0L, this.b, (DrawStyle) null, (ColorFilter) null, 0, 118);
                return rih1Var;
            case 8:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(f);
                kd31Var2.E((1.0f - f) * kd31Var2.T0.h() * 10.0f);
                kd31Var2.i(2);
                return rih1Var;
            case 9:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                long j3 = u7h.j;
                u7h u7hVar = new u7h(j3);
                long j4 = u7h.b;
                DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{u7hVar, new u7h(j4)}), 0.0f, f, 8), 0L, Size.b(lslVar.j(), 2, f, 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{new u7h(j4), new u7h(j3)}), Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f, Float.intBitsToFloat((int) (lslVar.j() >> 32)), 8), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f)) << 32), Size.b(lslVar.j(), 2, f, 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                return rih1Var;
            case 10:
                return ((eqc) obj).b(new vbk0((byte) 9, f));
            case 11:
                ((kd31) obj).b(f);
                return rih1Var;
            case 12:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b(f);
                kd31Var3.i(2);
                return rih1Var;
            case 13:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.q(f);
                kd31Var4.r(f);
                return rih1Var;
            case 14:
                kd31 kd31Var5 = (kd31) obj;
                kd31Var5.q(f);
                kd31Var5.r(f);
                kd31Var5.A(sgc1.u(0.0f, 0.0f));
                return rih1Var;
            case 15:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, f);
                return rih1Var;
            case 16:
                DrawScope drawScope4 = (DrawScope) obj;
                jmr0.g(new ry31(f, (p3v) null, true), drawScope4, drawScope4.j(), 0.0f, (f2b) null, 6);
                return rih1Var;
            case 17:
                ((kd31) obj).b(f);
                return rih1Var;
            case 18:
                ((kd31) obj).b(f);
                return rih1Var;
            case 19:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                float fX10 = lslVar2.X0(480.0f);
                float fX11 = lslVar2.X0(494.0f);
                float f3 = -lslVar2.X0(597.0f);
                float fIntBitsToFloat = (((Float.intBitsToFloat((int) (lslVar2.j() >> 32)) + fX10) - f3) * f) + f3;
                float f4 = -lslVar2.X0(234.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fX11 / 2.0f) + f4)) & 4294967295L) | (((long) Float.floatToRawIntBits((fX10 / 2.0f) + fIntBitsToFloat)) << 32);
                cab cabVarA4 = lslVar2.a1();
                long jU4 = cabVarA4.u();
                cabVarA4.p().q();
                try {
                    ((dg8) cabVarA4.b).s(-18.73f, jFloatToRawIntBits);
                    long j5 = u7h.f;
                    DrawScope.S0(lslVar2, new mic0(0, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat + fX10)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(j5, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.24f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.41f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.63f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.78f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.86f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.89f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.86f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.78f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.63f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.41f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.24f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j5, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), (List) null), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fX10)) << 32) | (((long) Float.floatToRawIntBits(fX11)) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA4, jU4);
                }
            case 20:
                ((n161) obj).b(lgo1.b, p3v.b(f, 180.0f) > 0 ? "TEST_TAG_RELOAD_LOGO_TEXT" : "TEST_TAG_RELOAD_LOGO");
                return rih1Var;
            case 21:
                ((kd31) obj).b(f);
                return rih1Var;
            case 22:
                ((kd31) obj).b(f);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((kd31) obj).b(f);
                return rih1Var;
            case 24:
                DrawScope drawScope5 = (DrawScope) obj;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope5.j() >> 32)) / 2.0f;
                DrawScope.p0(drawScope5, u7h.f, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope5.j() & 4294967295L)))) & 4294967295L), this.b, 1, (uw4) null, 480);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.b(f);
                kd31Var6.i(2);
                return rih1Var;
            case 26:
                kd31 kd31Var7 = (kd31) obj;
                kd31Var7.b(f);
                kd31Var7.i(2);
                return rih1Var;
            case 27:
                kd31 kd31Var8 = (kd31) obj;
                kd31Var8.b(f);
                kd31Var8.i(2);
                return rih1Var;
            case 28:
                kd31 kd31Var9 = (kd31) obj;
                kd31Var9.b(f);
                kd31Var9.i(2);
                return rih1Var;
            default:
                kd31 kd31Var10 = (kd31) obj;
                kd31Var10.b(f);
                kd31Var10.i(2);
                return rih1Var;
        }
    }
}
