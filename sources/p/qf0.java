package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(float f, long j, byte b) {
        super(1);
        this.a = b;
        this.c = f;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        float f = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(2.0f);
                DrawScope.b0(drawScope, this.b, (fX0 / 2.0f) + drawScope.X0(2.0f) + (drawScope.X0(f) / 2.0f), 0L, 0.0f, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 108);
                return rih1Var;
            case 1:
                DrawScope drawScope2 = (DrawScope) obj;
                DrawScope.b0(drawScope2, this.b, drawScope2.X0(f) / 2.0f, 0L, 0.0f, (DrawStyle) null, 124);
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float f2 = this.c;
                if (f2 > 0.0f) {
                    DrawScope.d0(lslVar, u7h.b(this.b, f2, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                }
                return rih1Var;
            case 3:
                DrawScope drawScope3 = (DrawScope) obj;
                tw4 tw4VarA = ww4.a();
                float f3 = f / 2.0f;
                tw4VarA.k(Float.intBitsToFloat((int) (drawScope3.g1() >> 32)) - f3, 0.0f);
                tw4VarA.j(Float.intBitsToFloat((int) (drawScope3.g1() >> 32)) + f3, 0.0f);
                tw4VarA.j(Float.intBitsToFloat((int) (drawScope3.g1() >> 32)), f);
                tw4VarA.g();
                DrawScope.w0(drawScope3, tw4VarA, this.b, (DrawStyle) null, 60);
                return rih1Var;
            case 4:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                u7h u7hVar = new u7h(j);
                long j2 = u7h.j;
                DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{u7hVar, new u7h(j2)}), 0.0f, lslVar2.X0(f), 8), 0L, Size.b(lslVar2.j(), 2, lslVar2.X0(f), 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 122);
                DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{new u7h(j2), new u7h(j)}), Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - lslVar2.X0(f), Float.intBitsToFloat((int) (lslVar2.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - lslVar2.X0(f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Size.b(lslVar2.j(), 2, lslVar2.X0(f), 0.0f), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
                return rih1Var;
            case 5:
                DrawScope drawScope4 = (DrawScope) obj;
                float fX1 = drawScope4.X0(f);
                float fX2 = drawScope4.X0(8.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope4.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & drawScope4.j()));
                Paint paint = new Paint();
                paint.setColor(z4p1.G(j));
                paint.setMaskFilter(new BlurMaskFilter(1.5f * fX1, BlurMaskFilter.Blur.NORMAL));
                u84 u84VarP = drawScope4.a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.save();
                u84 u84Var = u84VarP;
                u84Var.a.translate(0.0f, fX1 * 0.5f);
                u84Var.a.drawRoundRect(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, fX2, fX2, paint);
                u84Var.a.restore();
                return rih1Var;
            case 6:
                DrawScope drawScope5 = (DrawScope) obj;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope5.j() >> 32)) / 2.0f;
                DrawScope.p0(drawScope5, this.b, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope5.j() & 4294967295L)))) & 4294967295L), this.c, 1, (uw4) null, 480);
                return rih1Var;
            case 7:
                eqc eqcVar = (eqc) obj;
                float f4 = this.c;
                float f5 = 1.15f * f4 * 0.5f;
                float f6 = f5 > 0.5f ? 0.5f : f5;
                float f7 = f6 - 0.075f;
                return eqcVar.b(new ndf1(f7 < 0.0f ? 0.0f : f7, f6, this.b, u7h.b(this.b, f4, 0.0f, 0.0f, 0.0f, 14)));
            case 8:
                eqc eqcVar2 = (eqc) obj;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) * 0.4f;
                float fIntBitsToFloat5 = (((fIntBitsToFloat4 * 2.0f) + Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32))) * f) + (-fIntBitsToFloat4);
                long j3 = u7h.j;
                float f8 = fIntBitsToFloat4 / 2.0f;
                return eqcVar2.b(new gjd(new mic0(0, (((long) Float.floatToRawIntBits(fIntBitsToFloat5 - f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat5 + f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), p7h.M(new u7h[]{new u7h(j3), new u7h(j), new u7h(j3)}), (List) null), (byte) 6));
            default:
                DrawScope drawScope6 = (DrawScope) obj;
                tw4 tw4VarA2 = ww4.a();
                float f9 = f / 2.0f;
                tw4VarA2.k(Float.intBitsToFloat((int) (drawScope6.g1() >> 32)) - f9, 0.0f);
                tw4VarA2.j(Float.intBitsToFloat((int) (drawScope6.g1() >> 32)) + f9, 0.0f);
                tw4VarA2.j(Float.intBitsToFloat((int) (drawScope6.g1() >> 32)), f);
                tw4VarA2.g();
                DrawScope.w0(drawScope6, tw4VarA2, this.b, (DrawStyle) null, 60);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(long j, float f, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = f;
    }
}
