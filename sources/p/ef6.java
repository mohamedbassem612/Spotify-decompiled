package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ef6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef6(float f, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = obj;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope;
        byte b = this.a;
        float width = 1.0f;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        float f = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                tob1 tob1Var = ((ve6) obj2).b;
                kd31Var.b(((Number) tob1Var.getValue()).floatValue());
                kd31Var.i(2);
                kd31Var.C(kd31Var.T0.h() * f * (1.0f - ((Number) tob1Var.getValue()).floatValue()));
                break;
            case 1:
                lsl lslVar = (lsl) obj;
                DrawScope.S0(lslVar, (Brush) obj2, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f)) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 122);
                break;
            case 2:
                li7 li7Var = (li7) obj;
                if (f <= 0.0f) {
                    oq70 oq70Var = li7Var.b.a;
                    drr0 drr0Var = (drr0) obj2;
                    if (oq70Var.getWidth() > 0 && oq70Var.getHeight() > 0) {
                        width = oq70Var.getWidth() / oq70Var.getHeight();
                    }
                    drr0Var.t(width);
                }
                break;
            case 3:
                DrawScope drawScope2 = (lsl) obj;
                if (u890.j((hw61) obj2, er31.a)) {
                    drawScope = drawScope2;
                    DrawScope.b0(drawScope, u7h.b, (Size.e(drawScope2.j()) * 0.5f) + f, 0L, 0.0f, (DrawStyle) null, 60);
                } else {
                    drawScope = drawScope2;
                    long j = u7h.b;
                    float f2 = -f;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                    float f3 = 2.0f * f;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) + f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) + f3)) & 4294967295L);
                    float fX0 = drawScope.X0(4.0f) + f;
                    DrawScope.g0(drawScope2, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 112);
                }
                drawScope.s1();
                break;
            case 4:
                DrawScope drawScope3 = (DrawScope) obj;
                djl djlVar = ((ufh0) obj2).a;
                float fS = djlVar.s() * f;
                float fM = djlVar.m() * f;
                float f4 = (Size.f(drawScope3.j()) - fS) / 2.0f;
                float fD = (Size.d(drawScope3.j()) - fM) / 2.0f;
                long j2 = u7h.f;
                float f5 = f4 + fS;
                DrawScope.p0(drawScope3, j2, hm5.g(f4, fD), hm5.g(f5, fD), 0.0f, 0, (uw4) null, 504);
                float f6 = fD + fM;
                DrawScope.p0(drawScope3, j2, hm5.g(f5, fD), hm5.g(f5, f6), 0.0f, 0, (uw4) null, 504);
                DrawScope.p0(drawScope3, j2, hm5.g(f5, f6), hm5.g(f4, f6), 0.0f, 0, (uw4) null, 504);
                DrawScope.p0(drawScope3, j2, hm5.g(f4, f6), hm5.g(f4, fD), 0.0f, 0, (uw4) null, 504);
                float f7 = f4 + 1.0f;
                float f8 = fD + 1.0f;
                long j3 = u7h.b;
                float f9 = fS + f7;
                DrawScope.p0(drawScope3, j3, hm5.g(f7, f8), hm5.g(f9, f8), 0.0f, 0, (uw4) null, 504);
                float f10 = fM + f8;
                DrawScope.p0(drawScope3, j3, hm5.g(f9, f8), hm5.g(f9, f10), 0.0f, 0, (uw4) null, 504);
                DrawScope.p0(drawScope3, j3, hm5.g(f9, f10), hm5.g(f7, f10), 0.0f, 0, (uw4) null, 504);
                DrawScope.p0(drawScope3, j3, hm5.g(f7, f10), hm5.g(f7, f8), 0.0f, 0, (uw4) null, 504);
                break;
            case 5:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - lslVar2.X0(f);
                float f11 = rck.b;
                float fX1 = lslVar2.X0(1.0f) + lslVar2.X0(16.0f);
                DrawScope.p0(lslVar2, ((hdk) obj2).l, (((long) Float.floatToRawIntBits(fX1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) - fX1)) & 4294967295L), lslVar2.X0(1.0f), 0, (uw4) null, 496);
                break;
            case 6:
                ssd1 ssd1Var = (ssd1) obj2;
                ((kd31) obj).b((ssd1Var != null ? ssd1Var.g : null) != null ? 1.0f - f : 1.0f);
                break;
            case 7:
                yy31 yy31Var = (yy31) obj2;
                rtb0.b((rtb0) obj, yy31Var.a, new qwc1(yy31Var, (byte) 24), new j2i(-89475179, new qoe1(f, yy31Var), true), 4);
                break;
            default:
                elb0 elb0Var = (elb0) obj;
                float fB = (int) (elb0Var.b() & 4294967295L);
                float f12 = (f * fB) / 100.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L));
                float f13 = fB + fIntBitsToFloat2;
                elb0 elb0VarJ = elb0Var.J();
                if (elb0VarJ != null) {
                    n511 n511VarM = nho1.v(elb0VarJ).M(elb0VarJ, true);
                    ((iu30) obj2).invoke(Boolean.valueOf(n511VarM.d - fIntBitsToFloat2 > f12 && n511VarM.b < f13 - f12));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef6(Object obj, float f, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef6(p3v p3vVar, long j, Brush brush, float f) {
        super(1);
        this.a = (byte) 1;
        this.c = brush;
        this.b = f;
    }
}
