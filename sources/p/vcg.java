package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vcg extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcg(long j, long j2, int i, int i2) {
        super(1);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fX0 = drawScope.X0(4.0f);
        phc1 phc1Var = new phc1(fX0, 0.0f, 1, 0, null, 26);
        float f = fX0 / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX0)) & 4294967295L);
        DrawScope.i1(drawScope, this.a, 0.0f, 360.0f, jFloatToRawIntBits, jFloatToRawIntBits2, phc1Var, 832);
        int i = this.b;
        if (i > 0) {
            DrawScope.i1(drawScope, this.d, -90.0f, (this.c / i) * 360.0f, jFloatToRawIntBits, jFloatToRawIntBits2, phc1Var, 832);
        }
        return rih1.a;
    }
}
