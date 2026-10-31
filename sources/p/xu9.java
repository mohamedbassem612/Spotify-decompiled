package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xu9 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu9(int i, long j) {
        super(1);
        this.a = i;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        int iC = l1d.C(this.a);
        if (iC == 0) {
            fIntBitsToFloat = 0.0f;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)));
        DrawScope.p0(lslVar, this.b, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (jFloatToRawIntBits2 << 32), 1.0f, 0, (uw4) null, 496);
        return rih1.a;
    }
}
