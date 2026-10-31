package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e110 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e110(m811 m811Var, byte b) {
        super(2);
        this.a = b;
        this.b = m811Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m811 m811Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj2).a;
                ((hav0) obj).a();
                m811Var.a = Float.intBitsToFloat((int) (j & 4294967295L)) + m811Var.a;
                break;
            case 1:
                float fFloatValue = ((Number) obj2).floatValue();
                ((hav0) obj).a();
                m811Var.a = fFloatValue;
                break;
            default:
                m811Var.a += ((Number) obj2).floatValue();
                break;
        }
        return rih1Var;
    }
}
