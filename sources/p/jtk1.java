package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jtk1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ drr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtk1(long j, long j2, tob1 tob1Var, tob1 tob1Var2, drr0 drr0Var) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = tob1Var;
        this.d = tob1Var2;
        this.e = drr0Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fX0 = drawScope.X0(((p3v) this.c.getValue()).a);
        DrawScope.g0(drawScope, this.a, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) & 4294967295L) | (Float.floatToRawIntBits(fX0) << 32), (DrawStyle) null, 0.0f, 0, 240);
        float fX1 = drawScope.X0(((p3v) this.d.getValue()).a) + fX0;
        float fS = this.e.s() / 100.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * fS;
        DrawScope.g0(drawScope, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * fS)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) & 4294967295L) | (Float.floatToRawIntBits(fX0) << 32), (DrawStyle) null, 0.0f, 0, 240);
        if (fIntBitsToFloat > fX1) {
            DrawScope.d0(drawScope, this.b, (((long) Float.floatToRawIntBits(fIntBitsToFloat - fX0)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
        }
        return rih1.a;
    }
}
