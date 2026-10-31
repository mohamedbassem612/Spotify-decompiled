package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nzm extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ pmg1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ uw4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzm(long j, pmg1 pmg1Var, float f, float f2, boolean z, long j2, float f3, uw4 uw4Var) {
        super(1);
        this.a = j;
        this.b = pmg1Var;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = j2;
        this.g = f3;
        this.h = uw4Var;
    }

    public final Object invoke(Object obj) {
        float f;
        DrawScope drawScope = (DrawScope) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
        float fX0 = drawScope.X0(this.c);
        float fX1 = drawScope.X0(this.d);
        pmg1 pmg1Var = this.b;
        float f2 = pmg1Var.i;
        long j = this.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float f3 = pmg1Var.g;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fIntBitsToFloat2 * f3) + f2)) << 32) | (((long) Float.floatToRawIntBits(((1.0f - Float.intBitsToFloat((int) (j & 4294967295L))) * fX1) + fX0)) & 4294967295L);
        float fO = yoi1.o(f2, 0.0f, fIntBitsToFloat);
        float fO2 = yoi1.o(f2 + f3, 0.0f, fIntBitsToFloat);
        if (!this.e || fO >= fO2) {
            f = 0.0f;
        } else {
            int i = (int) (jFloatToRawIntBits & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fO)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i))) & 4294967295L);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fO2);
            long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L;
            f = 0.0f;
            DrawScope.p0(drawScope, this.f, jFloatToRawIntBits2, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32), this.g, 0, this.h, 448);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
        int i2 = (int) (jFloatToRawIntBits >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i2);
        if (f <= fIntBitsToFloat5 && fIntBitsToFloat5 <= fIntBitsToFloat4) {
            long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            long jFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat6);
            long jFloatToRawIntBits7 = ((long) Float.floatToRawIntBits(fIntBitsToFloat7)) & 4294967295L;
            DrawScope.p0(drawScope, this.f, jFloatToRawIntBits5, jFloatToRawIntBits7 | (jFloatToRawIntBits6 << 32), this.g, 0, this.h, 448);
        }
        return rih1.a;
    }
}
