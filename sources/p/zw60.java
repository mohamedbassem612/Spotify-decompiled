package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zw60 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw60(int i, nhc nhcVar, long j, long j2) {
        super(1);
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        int i = this.a;
        int iC = l1d.C(i);
        long j = this.b;
        if (iC == 0) {
            nhc.s(drawScope, j, false);
        } else if (iC == 1) {
            float f = -Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            DrawScope.v(drawScope, this.b, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 120);
        } else if (iC == 2) {
            nhc.s(drawScope, j, true);
        } else if (iC == 3) {
            nhc.t(drawScope, j, false);
        } else if (iC != 5) {
            if (i == 7) {
                j = this.c;
            }
            DrawScope.b0(drawScope, j, 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
        } else {
            nhc.t(drawScope, j, true);
        }
        return rih1.a;
    }
}
