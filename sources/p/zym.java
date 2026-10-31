package p;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zym extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zym(float f, float f2, boolean z, long j, long j2) {
        super(1);
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final Object invoke(Object obj) {
        float f;
        tw4 tw4Var;
        byte b = this.a;
        boolean z = this.d;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(f3) / 2.0f;
                float fX1 = drawScope.X0(2.0f);
                if (z) {
                    float fX2 = drawScope.X0(3.0f);
                    DrawScope.b0(drawScope, u7h.b(this.e, f2 * 0.3f, 0.0f, 0.0f, 0.0f, 14), (fX1 / 2.0f) + fX0 + (fX2 / 2.0f), 0L, 0.0f, new phc1(fX2, 0.0f, 0, 0, (uw4) null, 30), 108);
                }
                DrawScope.b0(drawScope, u7h.b(this.f, this.c, 0.0f, 0.0f, 0.0f, 14), fX0, 0L, 0.0f, (DrawStyle) null, 124);
                DrawScope.b0(drawScope, u7h.b(this.e, this.c, 0.0f, 0.0f, 0.0f, 14), fX0, 0L, 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 108);
                return rih1.a;
            default:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * 20.0f;
                kiv kivVar = alg0.a;
                float fH2 = eqcVar.h() * 16.0f;
                float fH3 = eqcVar.h() * f3;
                float fH4 = eqcVar.h() * 4.0f;
                long j = eqcVar.a.j();
                float f4 = fH / 2.0f;
                int i = (int) (j >> 32);
                float fO = yoi1.o((Float.intBitsToFloat(i) / 2.0f) + fH3, f2 + f4, (Float.intBitsToFloat(i) - f2) - f4);
                float fSqrt = (float) Math.sqrt((fH2 * fH2) + (f4 * f4));
                float f5 = (fH4 * f4) / fSqrt;
                float f6 = (fH4 * fH2) / fSqrt;
                if (z) {
                    int i2 = (int) (j & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat(i2) - fH2;
                    tw4 tw4VarA = ww4.a();
                    Path path = tw4VarA.a;
                    tw4VarA.k(0.0f, f2);
                    float f7 = f2 * 2.0f;
                    RectF rectF = tw4VarA.b;
                    if (rectF == null) {
                        rectF = new RectF();
                        tw4VarA.b = rectF;
                    }
                    rectF.set(0.0f, 0.0f, f7, f7);
                    RectF rectF2 = tw4VarA.b;
                    rectF2.getClass();
                    path.arcTo(rectF2, 180.0f, 90.0f, false);
                    tw4VarA.j(Float.intBitsToFloat(i) - f2, 0.0f);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i) - f7;
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    RectF rectF3 = tw4VarA.b;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        tw4VarA.b = rectF3;
                    }
                    rectF3.set(fIntBitsToFloat2, 0.0f, fIntBitsToFloat3, f7);
                    RectF rectF4 = tw4VarA.b;
                    rectF4.getClass();
                    path.arcTo(rectF4, -90.0f, 90.0f, false);
                    tw4VarA.j(Float.intBitsToFloat(i), fIntBitsToFloat - f2);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i) - f7;
                    float f8 = fIntBitsToFloat - f7;
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    RectF rectF5 = tw4VarA.b;
                    if (rectF5 == null) {
                        rectF5 = new RectF();
                        tw4VarA.b = rectF5;
                    }
                    rectF5.set(fIntBitsToFloat4, f8, fIntBitsToFloat5, fIntBitsToFloat);
                    RectF rectF6 = tw4VarA.b;
                    rectF6.getClass();
                    path.arcTo(rectF6, 0.0f, 90.0f, false);
                    tw4VarA.j(fO + f4, fIntBitsToFloat);
                    tw4VarA.j(fO + f5, Float.intBitsToFloat(i2) - f6);
                    tw4VarA.m(fO, Float.intBitsToFloat(i2), fO - f5, Float.intBitsToFloat(i2) - f6);
                    tw4VarA.j(fO - f4, fIntBitsToFloat);
                    tw4VarA.j(f2, fIntBitsToFloat);
                    RectF rectF7 = tw4VarA.b;
                    if (rectF7 == null) {
                        rectF7 = new RectF();
                        tw4VarA.b = rectF7;
                    }
                    rectF7.set(0.0f, f8, f7, fIntBitsToFloat);
                    RectF rectF8 = tw4VarA.b;
                    rectF8.getClass();
                    path.arcTo(rectF8, 90.0f, 90.0f, false);
                    tw4VarA.j(0.0f, f2);
                    tw4VarA.g();
                    tw4Var = tw4VarA;
                    f = 0.0f;
                } else {
                    tw4 tw4VarA2 = ww4.a();
                    float f9 = fO - f5;
                    Path path2 = tw4VarA2.a;
                    tw4VarA2.k(f9, f6);
                    tw4VarA2.m(fO, 0.0f, f5 + fO, f6);
                    tw4VarA2.j(fO + f4, fH2);
                    tw4VarA2.j(Float.intBitsToFloat(i) - f2, fH2);
                    float f10 = f2 * 2.0f;
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i) - f10;
                    float fIntBitsToFloat7 = Float.intBitsToFloat(i);
                    float f11 = fH2 + f10;
                    RectF rectF9 = tw4VarA2.b;
                    if (rectF9 == null) {
                        rectF9 = new RectF();
                        tw4VarA2.b = rectF9;
                    }
                    rectF9.set(fIntBitsToFloat6, fH2, fIntBitsToFloat7, f11);
                    RectF rectF10 = tw4VarA2.b;
                    rectF10.getClass();
                    path2.arcTo(rectF10, -90.0f, 90.0f, false);
                    int i3 = (int) (j & 4294967295L);
                    tw4VarA2.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i3) - f2);
                    float fIntBitsToFloat8 = Float.intBitsToFloat(i) - f10;
                    float fIntBitsToFloat9 = Float.intBitsToFloat(i3) - f10;
                    float fIntBitsToFloat10 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat11 = Float.intBitsToFloat(i3);
                    RectF rectF11 = tw4VarA2.b;
                    if (rectF11 == null) {
                        rectF11 = new RectF();
                        tw4VarA2.b = rectF11;
                    }
                    rectF11.set(fIntBitsToFloat8, fIntBitsToFloat9, fIntBitsToFloat10, fIntBitsToFloat11);
                    RectF rectF12 = tw4VarA2.b;
                    rectF12.getClass();
                    path2.arcTo(rectF12, 0.0f, 90.0f, false);
                    tw4VarA2.j(f2, Float.intBitsToFloat(i3));
                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) - f10;
                    float fIntBitsToFloat13 = Float.intBitsToFloat(i3);
                    RectF rectF13 = tw4VarA2.b;
                    if (rectF13 == null) {
                        rectF13 = new RectF();
                        tw4VarA2.b = rectF13;
                    }
                    f = 0.0f;
                    rectF13.set(0.0f, fIntBitsToFloat12, f10, fIntBitsToFloat13);
                    RectF rectF14 = tw4VarA2.b;
                    rectF14.getClass();
                    path2.arcTo(rectF14, 90.0f, 90.0f, false);
                    tw4VarA2.j(0.0f, f2 + fH2);
                    RectF rectF15 = tw4VarA2.b;
                    if (rectF15 == null) {
                        rectF15 = new RectF();
                        tw4VarA2.b = rectF15;
                    }
                    rectF15.set(0.0f, fH2, f10, f11);
                    RectF rectF16 = tw4VarA2.b;
                    rectF16.getClass();
                    path2.arcTo(rectF16, 180.0f, 90.0f, false);
                    tw4VarA2.j(fO - f4, fH2);
                    tw4VarA2.j(f9, f6);
                    tw4VarA2.g();
                    tw4Var = tw4VarA2;
                }
                mmr0[] mmr0VarArr = {new mmr0(Float.valueOf(f), new u7h(u7h.b(this.e, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(this.e, 1.0f, 0.0f, 0.0f, 0.0f, 14)))};
                float fIntBitsToFloat14 = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f;
                return eqcVar.a(new lff(tw4Var, this.f, v9c.p(mmr0VarArr, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat14) << 32), Math.max(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L))), 8), (byte) 4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zym(float f, boolean z, long j, float f2, long j2) {
        super(1);
        this.b = f;
        this.d = z;
        this.e = j;
        this.c = f2;
        this.f = j2;
    }
}
