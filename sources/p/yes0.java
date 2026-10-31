package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yes0 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yes0(float f, long j, int i) {
        super(1);
        this.a = f;
        this.b = i;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        float f = 1.0f - this.a;
        if (f > 0.0f) {
            float f2 = this.b;
            float f3 = 0.5f * f2;
            float f4 = f2 - f3;
            DrawScope.S0(lslVar, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(this.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(this.c, f * 0.9f, 0.0f, 0.0f, 0.0f, 14))}), f4, f2, 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
        }
        return rih1.a;
    }
}
