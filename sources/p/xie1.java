package p;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xie1 implements hw61 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xie1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fX0 = watVar.X0(this.a);
        float fX1 = watVar.X0(this.b);
        float fX2 = watVar.X0(this.c);
        float fX3 = watVar.X0(2.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = fX1 - fX2;
        float f2 = this.d * fIntBitsToFloat2;
        float f3 = fX1 + fX3;
        float f4 = fX3 + f;
        float fSqrt = (float) Math.sqrt((f3 * f3) - (f4 * f4));
        float degrees = (float) Math.toDegrees(Math.atan2(fSqrt, f4));
        tw4 tw4VarA = ww4.a();
        Path path = tw4VarA.a;
        tw4VarA.k(fX0, 0.0f);
        tw4VarA.j(fIntBitsToFloat - fX0, 0.0f);
        float f5 = 2.0f * fX0;
        float f6 = fIntBitsToFloat - f5;
        RectF rectF = tw4VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4VarA.b = rectF;
        }
        rectF.set(f6, 0.0f, fIntBitsToFloat, f5);
        RectF rectF2 = tw4VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, 90.0f, false);
        float f7 = f2 - fSqrt;
        tw4VarA.j(fIntBitsToFloat, f7);
        float f8 = 2.0f * fX3;
        float f9 = fIntBitsToFloat - f8;
        float f10 = f7 - fX3;
        float f11 = f7 + fX3;
        RectF rectF3 = tw4VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            tw4VarA.b = rectF3;
        }
        rectF3.set(f9, f10, fIntBitsToFloat, f11);
        RectF rectF4 = tw4VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, degrees, false);
        float f12 = fIntBitsToFloat + f;
        float f13 = f12 - fX1;
        float f14 = f2 - fX1;
        float f15 = f12 + fX1;
        float f16 = f2 + fX1;
        float f17 = degrees + 180.0f;
        float f18 = degrees * (-2.0f);
        RectF rectF5 = tw4VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            tw4VarA.b = rectF5;
        }
        rectF5.set(f13, f14, f15, f16);
        RectF rectF6 = tw4VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, f17, f18, false);
        float f19 = f2 + fSqrt;
        float f20 = f19 - fX3;
        float f21 = f19 + fX3;
        float f22 = 360.0f - degrees;
        RectF rectF7 = tw4VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            tw4VarA.b = rectF7;
        }
        rectF7.set(f9, f20, fIntBitsToFloat, f21);
        RectF rectF8 = tw4VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, f22, degrees, false);
        tw4VarA.j(fIntBitsToFloat, fIntBitsToFloat2 - fX0);
        float f23 = fIntBitsToFloat2 - f5;
        RectF rectF9 = tw4VarA.b;
        if (rectF9 == null) {
            rectF9 = new RectF();
            tw4VarA.b = rectF9;
        }
        rectF9.set(f6, f23, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF10 = tw4VarA.b;
        rectF10.getClass();
        path.arcTo(rectF10, 0.0f, 90.0f, false);
        tw4VarA.j(fX0, fIntBitsToFloat2);
        RectF rectF11 = tw4VarA.b;
        if (rectF11 == null) {
            rectF11 = new RectF();
            tw4VarA.b = rectF11;
        }
        rectF11.set(0.0f, f23, f5, fIntBitsToFloat2);
        RectF rectF12 = tw4VarA.b;
        rectF12.getClass();
        path.arcTo(rectF12, 90.0f, 90.0f, false);
        tw4VarA.j(0.0f, f19);
        RectF rectF13 = tw4VarA.b;
        if (rectF13 == null) {
            rectF13 = new RectF();
            tw4VarA.b = rectF13;
        }
        rectF13.set(0.0f, f20, f8, f21);
        RectF rectF14 = tw4VarA.b;
        rectF14.getClass();
        path.arcTo(rectF14, 180.0f, degrees, false);
        float f24 = -f;
        float f25 = f24 - fX1;
        float f26 = f24 + fX1;
        RectF rectF15 = tw4VarA.b;
        if (rectF15 == null) {
            rectF15 = new RectF();
            tw4VarA.b = rectF15;
        }
        rectF15.set(f25, f14, f26, f16);
        RectF rectF16 = tw4VarA.b;
        rectF16.getClass();
        path.arcTo(rectF16, degrees, f18, false);
        float f27 = 180.0f - degrees;
        RectF rectF17 = tw4VarA.b;
        if (rectF17 == null) {
            rectF17 = new RectF();
            tw4VarA.b = rectF17;
        }
        rectF17.set(0.0f, f10, f8, f11);
        RectF rectF18 = tw4VarA.b;
        rectF18.getClass();
        path.arcTo(rectF18, f27, degrees, false);
        tw4VarA.j(0.0f, fX0);
        RectF rectF19 = tw4VarA.b;
        if (rectF19 == null) {
            rectF19 = new RectF();
            tw4VarA.b = rectF19;
        }
        rectF19.set(0.0f, 0.0f, f5, f5);
        RectF rectF20 = tw4VarA.b;
        rectF20.getClass();
        path.arcTo(rectF20, 180.0f, 90.0f, false);
        tw4VarA.g();
        return new htq0(tw4VarA);
    }
}
