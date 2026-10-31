package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lkc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu30 b;
    public final /* synthetic */ lhc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lkc1(zu30 zu30Var, lhc0 lhc0Var, byte b) {
        super(2);
        this.a = b;
        this.b = zu30Var;
        this.c = lhc0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lhc0 lhc0Var = this.c;
        zu30 zu30Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Offset offset = (Offset) obj2;
                long j = offset.a;
                zu30Var.J(lhc0Var.g, Integer.valueOf(iIntValue), offset, new u7h(lhc0Var.c));
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                Offset offset2 = (Offset) obj2;
                long j2 = offset2.a;
                zu30Var.J(lhc0Var.g, Integer.valueOf(iIntValue2), offset2, new u7h(lhc0Var.c));
                break;
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                Offset offset3 = (Offset) obj2;
                long j3 = offset3.a;
                zu30Var.J(lhc0Var.g, Integer.valueOf(iIntValue3), offset3, new u7h(lhc0Var.c));
                break;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                Offset offset4 = (Offset) obj2;
                long j4 = offset4.a;
                zu30Var.J(lhc0Var.g, Integer.valueOf(iIntValue4), offset4, new u7h(lhc0Var.c));
                break;
        }
        return rih1Var;
    }
}
