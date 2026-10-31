package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ete1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ete1(long j, float f, boolean z, float f2, float f3) {
        super(1);
        this.a = j;
        this.b = f;
        this.c = z;
        this.d = f2;
        this.e = f3;
    }

    public final Object invoke(Object obj) {
        float fX0;
        DrawScope drawScope = (DrawScope) obj;
        int iOrdinal = drawScope.getLayoutDirection().ordinal();
        if (iOrdinal == 0) {
            fX0 = -drawScope.X0(8.0f);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            fX0 = drawScope.X0(8.0f) + Float.intBitsToFloat((int) (drawScope.j() >> 32));
        }
        float f = fX0;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.5f;
        DrawScope.b0(drawScope, this.a, drawScope.X0(this.b) / 2.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), 0.0f, (DrawStyle) null, 120);
        if (this.c) {
            float fX1 = drawScope.X0(this.d) + fIntBitsToFloat;
            float fX2 = drawScope.X0(this.e) + Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            DrawScope.z(drawScope, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b(u7h.f, 0.5f, 0.0f, 0.0f, 0.0f, 14))}), fX1, fX2, 8), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L), drawScope.X0(1.0f), 0.0f, 496);
        }
        return rih1.a;
    }
}
