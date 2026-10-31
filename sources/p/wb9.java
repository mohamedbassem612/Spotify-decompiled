package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wb9 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb9(float f, float f2, boolean z) {
        super(1);
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        if (this.a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32)) / 2.0f;
            float fX0 = lslVar.X0(this.b) + fIntBitsToFloat;
            float fX1 = lslVar.X0(this.c) - fIntBitsToFloat;
            if (lslVar.getLayoutDirection() == flb0.b) {
                fX1 = Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX1;
            }
            DrawScope.b0(lslVar, u7h.j, fX0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fX1) << 32), 0.0f, (DrawStyle) null, 56);
        }
        return rih1.a;
    }
}
