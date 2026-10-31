package p;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ald1 implements hw61 {
    public final float a;

    public ald1(float f) {
        this.a = f;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fX0 = watVar.X0(16.0f);
        float fX1 = watVar.X0(16.0f);
        float fX2 = watVar.X0(16.0f);
        float fX3 = watVar.X0(2.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fX4 = watVar.X0(this.a);
        float f = fX1 - fX2;
        float f2 = fX1 + fX3;
        float f3 = fX3 + f;
        float fSqrt = (float) Math.sqrt((f2 * f2) - (f3 * f3));
        float degrees = (float) Math.toDegrees(Math.atan2(fSqrt, f3));
        float f4 = fIntBitsToFloat - fX0;
        float fO = yoi1.o(fIntBitsToFloat - fX4, fX0 + fSqrt + fX3, (f4 - fSqrt) - fX3);
        tw4 tw4VarA = ww4.a();
        Path path = tw4VarA.a;
        tw4VarA.k(fX0, 0.0f);
        float f5 = fO - fSqrt;
        tw4VarA.j(f5, 0.0f);
        float f6 = f5 - fX3;
        float f7 = f5 + fX3;
        float f8 = 2.0f * fX3;
        RectF rectF = tw4VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4VarA.b = rectF;
        }
        rectF.set(f6, 0.0f, f7, f8);
        RectF rectF2 = tw4VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, degrees, false);
        float f9 = fO - fX1;
        float f10 = -f;
        float f11 = f10 - fX1;
        float f12 = fO + fX1;
        float f13 = f10 + fX1;
        float f14 = degrees + 90.0f;
        float f15 = degrees * (-2.0f);
        RectF rectF3 = tw4VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            tw4VarA.b = rectF3;
        }
        rectF3.set(f9, f11, f12, f13);
        RectF rectF4 = tw4VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, f14, f15, false);
        float f16 = fO + fSqrt;
        float f17 = f16 - fX3;
        float f18 = f16 + fX3;
        float f19 = 270.0f - degrees;
        RectF rectF5 = tw4VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            tw4VarA.b = rectF5;
        }
        rectF5.set(f17, 0.0f, f18, f8);
        RectF rectF6 = tw4VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, f19, degrees, false);
        tw4VarA.j(f4, 0.0f);
        float f20 = 2.0f * fX0;
        float f21 = fIntBitsToFloat - f20;
        RectF rectF7 = tw4VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            tw4VarA.b = rectF7;
        }
        rectF7.set(f21, 0.0f, fIntBitsToFloat, f20);
        RectF rectF8 = tw4VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, 270.0f, 90.0f, false);
        tw4VarA.j(fIntBitsToFloat, fIntBitsToFloat2 - fX0);
        float f22 = fIntBitsToFloat2 - f20;
        RectF rectF9 = tw4VarA.b;
        if (rectF9 == null) {
            rectF9 = new RectF();
            tw4VarA.b = rectF9;
        }
        rectF9.set(f21, f22, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF10 = tw4VarA.b;
        rectF10.getClass();
        path.arcTo(rectF10, 0.0f, 90.0f, false);
        tw4VarA.j(f16, fIntBitsToFloat2);
        float f23 = fIntBitsToFloat2 - f8;
        RectF rectF11 = tw4VarA.b;
        if (rectF11 == null) {
            rectF11 = new RectF();
            tw4VarA.b = rectF11;
        }
        rectF11.set(f17, f23, f18, fIntBitsToFloat2);
        RectF rectF12 = tw4VarA.b;
        rectF12.getClass();
        path.arcTo(rectF12, 90.0f, degrees, false);
        float f24 = fIntBitsToFloat2 + f;
        float f25 = f24 - fX1;
        float f26 = f24 + fX1;
        float f27 = degrees + 270.0f;
        RectF rectF13 = tw4VarA.b;
        if (rectF13 == null) {
            rectF13 = new RectF();
            tw4VarA.b = rectF13;
        }
        rectF13.set(f9, f25, f12, f26);
        RectF rectF14 = tw4VarA.b;
        rectF14.getClass();
        path.arcTo(rectF14, f27, f15, false);
        float f28 = 90.0f - degrees;
        RectF rectF15 = tw4VarA.b;
        if (rectF15 == null) {
            rectF15 = new RectF();
            tw4VarA.b = rectF15;
        }
        rectF15.set(f6, f23, f7, fIntBitsToFloat2);
        RectF rectF16 = tw4VarA.b;
        rectF16.getClass();
        path.arcTo(rectF16, f28, degrees, false);
        tw4VarA.j(fX0, fIntBitsToFloat2);
        RectF rectF17 = tw4VarA.b;
        if (rectF17 == null) {
            rectF17 = new RectF();
            tw4VarA.b = rectF17;
        }
        rectF17.set(0.0f, f22, f20, fIntBitsToFloat2);
        RectF rectF18 = tw4VarA.b;
        rectF18.getClass();
        path.arcTo(rectF18, 90.0f, 90.0f, false);
        tw4VarA.j(0.0f, fX0);
        RectF rectF19 = tw4VarA.b;
        if (rectF19 == null) {
            rectF19 = new RectF();
            tw4VarA.b = rectF19;
        }
        rectF19.set(0.0f, 0.0f, f20, f20);
        RectF rectF20 = tw4VarA.b;
        rectF20.getClass();
        path.arcTo(rectF20, 180.0f, 90.0f, false);
        tw4VarA.g();
        return new htq0(tw4VarA);
    }
}
