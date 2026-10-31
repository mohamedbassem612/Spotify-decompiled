package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kao0 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ lee1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kao0(float f, float f2, long j, long j2, String str, long j3, lee1 lee1Var) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = j3;
        this.g = lee1Var;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.h();
        float fX0 = lslVar.X0(13.0f);
        lslVar.h();
        float fX1 = lslVar.X0(13.0f);
        lslVar.h();
        float fX2 = lslVar.X0(4.0f);
        lslVar.h();
        float fX3 = lslVar.X0(2.0f);
        lslVar.h();
        float fX4 = lslVar.X0(16.0f);
        float fMax = Math.max(this.a * 0.9f, fX0);
        float fMax2 = Math.max((fX2 * 2.0f) + this.b, fX1);
        if (fMax2 < fMax) {
            fMax2 = fMax;
        }
        lslVar.s1();
        float fIntBitsToFloat = lslVar.getLayoutDirection() == flb0.b ? fX1 / 2.0f : Float.intBitsToFloat((int) (lslVar.j() >> 32)) - (fX1 / 2.0f);
        float f = fMax / 2.0f;
        float f2 = fMax2 / 2.0f;
        float f3 = fIntBitsToFloat - f2;
        float f4 = f3 - fX3;
        float f5 = f - f;
        float f6 = f5 - fX3;
        float f7 = fIntBitsToFloat + f2;
        float f8 = f + f;
        float f9 = fX4 + fX3;
        DrawScope.g0(lslVar, this.c, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits((f8 + fX3) - f6)) & 4294967295L) | (((long) Float.floatToRawIntBits((f7 + fX3) - f4)) << 32), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
        n511 n511Var = new n511(f3, f5, f7, f8);
        DrawScope.g0(lslVar, this.d, n511Var.h(), n511Var.g(), (((long) Float.floatToRawIntBits(fX4)) << 32) | (((long) Float.floatToRawIntBits(fX4)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
        u84 u84VarP = lslVar.a1().p();
        Canvas canvas = v84.a;
        Canvas canvas2 = u84VarP.a;
        Paint paint = new Paint();
        paint.setColor(z4p1.G(this.f));
        paint.setTextSize(lslVar.q0(this.g.a.b));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setFakeBoldText(true);
        paint.setAntiAlias(true);
        canvas2.drawText(this.e, Float.intBitsToFloat((int) (n511Var.f() >> 32)), Float.intBitsToFloat((int) (n511Var.f() & 4294967295L)) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        return rih1.a;
    }
}
