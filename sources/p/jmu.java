package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jmu implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;

    public /* synthetic */ jmu(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float f = this.a;
        float fX0 = drawScope.X0(f);
        float fX1 = drawScope.X0(f) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
        float fX2 = drawScope.X0(f) / 2.0f;
        DrawScope.p0(drawScope, this.b, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fX2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fX0, 0, (uw4) null, 496);
        return rih1.a;
    }
}
