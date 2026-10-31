package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ivb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mic0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ivb(mic0 mic0Var, float f, byte b) {
        super(1);
        this.a = b;
        this.b = mic0Var;
        this.c = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.S0(lslVar, this.b, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - f))) | (Float.floatToRawIntBits(0.0f) << 32), Size.b(lslVar.j(), 1, 0.0f, f), 0.0f, (DrawStyle) null, (ColorFilter) null, 8, 56);
                break;
            case 1:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.S0(lslVar2, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) - f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
                break;
            default:
                DrawScope.c0((DrawScope) obj, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, (DrawStyle) null, 246);
                break;
        }
        return rih1Var;
    }
}
