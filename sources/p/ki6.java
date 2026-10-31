package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ki6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki6(o811 o811Var, byte b) {
        super(2);
        this.a = b;
        this.b = o811Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o811 o811Var = this.b;
        switch (b) {
            case 0:
                hav0 hav0Var = (hav0) obj;
                long j = ((Offset) obj2).a;
                int i = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i) <= 0.0f || Math.abs(Float.intBitsToFloat(i)) <= Math.abs(Float.intBitsToFloat((int) (j >> 32)))) {
                    hav0Var.a();
                    o811Var.a = j;
                }
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    o811Var.a = cbx.a(x340Var2).b.a;
                }
                break;
        }
        return rih1Var;
    }
}
