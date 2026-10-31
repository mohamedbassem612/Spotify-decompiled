package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lso0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uwy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lso0(uwy0 uwy0Var, byte b) {
        super(2);
        this.a = b;
        this.b = uwy0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uwy0 uwy0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    q9e1.c(uwy0Var.a, (qim0) null, 0L, 0L, (FontWeight) null, (FontFamily) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var2, 0, 0, 262142);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    q9e1.c(uwy0Var.b, (qim0) null, 0L, 0L, (FontWeight) null, (FontFamily) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var4, 0, 0, 262142);
                }
                break;
        }
        return rih1Var;
    }
}
