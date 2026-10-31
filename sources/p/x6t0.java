package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x6t0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tob1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6t0(long j, long j2, tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = j2;
        this.d = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tob1 tob1Var = this.d;
        long j = this.c;
        long j2 = this.b;
        switch (b) {
            case 0:
                DrawScope.d0((DrawScope) obj, z4p1.A(((Number) tob1Var.getValue()).floatValue(), j2, j), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1.a;
            default:
                eqc eqcVar = (eqc) obj;
                List listM = p7h.M(new u7h[]{new u7h(j2), new u7h(j), new u7h(j2)});
                return eqcVar.b(new gjd(new mic0(0, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()) - (Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f) + (Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), listM, (List) null), (byte) 5));
        }
    }
}
