package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ath0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bth0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ath0(bth0 bth0Var, byte b) {
        super(2);
        this.a = b;
        this.b = bth0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bth0 bth0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                pt ptVar = bth0Var.c;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zsh0 zsh0Var = bth0Var.b;
                    hsh0 hsh0Var = new hsh0(zsh0Var.a, zsh0Var.b);
                    otw.c(ptVar, hsh0Var, (qim0) null, wpb1.C("MediaPickerContentElement", ptVar, hsh0Var, x340Var2, 6, 8), x340Var2, 0, 4);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!((Boolean) bth0Var.d.b.getValue()).booleanValue()) {
                    x340Var4.i0(2113769910);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(2113692069);
                    boolean zI = x340Var4.i(bth0Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new tzf0(bth0Var, (byte) 25);
                        x340Var4.s0(objT);
                    }
                    nko1.t((Function0) objT, x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
