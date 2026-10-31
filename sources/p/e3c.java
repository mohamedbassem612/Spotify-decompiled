package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e3c extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ yae1 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3c(int i, int i2, int i3, float f, float f2, long j, long j2, long j3, yae1 yae1Var, drr0 drr0Var) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = yae1Var;
        this.t = drr0Var;
    }

    public final Object invoke(Object obj) {
        long j;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        long jB;
        DrawScope drawScope = (DrawScope) obj;
        float fS = this.t.s();
        lee1 lee1Var = g3c.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
        float fX0 = drawScope.X0(8.0f);
        float fX1 = drawScope.X0(28.0f);
        float fX2 = drawScope.X0(16.0f);
        float fX3 = drawScope.X0(1.5f);
        float fX4 = drawScope.X0(4.0f) + fX0;
        float fX5 = drawScope.X0(4.0f) + fX4 + fX1;
        int i4 = this.b;
        int i5 = this.c;
        long j2 = this.f;
        if (i4 <= i5) {
            int i6 = i4;
            while (true) {
                int i7 = i6 - i4;
                float f3 = this.d;
                float f4 = (((i7 * f3) - fS) * this.e) + fIntBitsToFloat;
                if (f4 >= (-f3)) {
                    DrawScope drawScope2 = drawScope;
                    int i8 = i4;
                    if (f4 > Float.intBitsToFloat((int) (drawScope.j() >> 32)) + f3) {
                        i3 = i5;
                        j = j2;
                        drawScope = drawScope2;
                        i = i8;
                        f = fIntBitsToFloat;
                        f2 = fX0;
                        i2 = i6;
                    } else {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.j() >> 32));
                        float fAbs = Math.abs(f4 - fIntBitsToFloat);
                        float f5 = 0.3f * fIntBitsToFloat2;
                        float f6 = fIntBitsToFloat2 * 0.5f;
                        float fO = 1.0f;
                        if (fAbs >= f5) {
                            fO = yoi1.o((f6 - fAbs) / (f6 - f5), 0.0f, 1.0f);
                        }
                        float f7 = fO;
                        boolean z = i6 % 5 == 0;
                        boolean z2 = i7 == this.a;
                        float f8 = z ? fX1 : fX2;
                        if (z2) {
                            long j3 = j2;
                            jB = u7h.b(j3, f7, 0.0f, 0.0f, 0.0f, 14);
                            j = j3;
                        } else {
                            j = j2;
                            jB = u7h.b(this.g, f7, 0.0f, 0.0f, 0.0f, 14);
                        }
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fX4 + f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32);
                        int i9 = i5;
                        drawScope = drawScope2;
                        i = i8;
                        i2 = i6;
                        DrawScope.p0(drawScope, jB, jFloatToRawIntBits, jFloatToRawIntBits2, fX3, 0, (uw4) null, 496);
                        if (z) {
                            f2 = fX0;
                            f = fIntBitsToFloat;
                            y9e1 y9e1VarA = yae1.a(this.i, String.valueOf(i2), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020);
                            w5p1.i(drawScope, y9e1VarA, u7h.b(this.h, f7, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f4 - (((int) (y9e1VarA.c >> 32)) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(fX5)) & 4294967295L), 0.0f, 248);
                        } else {
                            f = fIntBitsToFloat;
                            f2 = fX0;
                        }
                        i3 = i9;
                    }
                } else {
                    i = i4;
                    j = j2;
                    f = fIntBitsToFloat;
                    f2 = fX0;
                    i2 = i6;
                    i3 = i5;
                }
                if (i2 == i3) {
                    break;
                }
                i6 = i2 + 1;
                fS = fS;
                i5 = i3;
                fX3 = fX3;
                fIntBitsToFloat = f;
                fX0 = f2;
                j2 = j;
                i4 = i;
            }
        } else {
            j = j2;
            f = fIntBitsToFloat;
            f2 = fX0;
        }
        DrawScope drawScope3 = drawScope;
        tw4 tw4VarA = ww4.a();
        float f9 = (f2 * 1.2f) / 2.0f;
        tw4VarA.k(f - f9, 0.0f);
        tw4VarA.j(f + f9, 0.0f);
        tw4VarA.j(f, f2);
        tw4VarA.g();
        DrawScope.w0(drawScope3, tw4VarA, j, (DrawStyle) null, 60);
        return rih1.a;
    }
}
