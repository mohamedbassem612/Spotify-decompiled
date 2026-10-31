package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zn1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(ov1 ov1Var, byte b) {
        super(2);
        this.a = b;
        this.b = ov1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ov1 ov1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ov1Var.a(70, 0, x340Var2, nim0.a);
                }
                break;
            default:
                ov1Var.e = (upo) obj;
                break;
        }
        return rih1Var;
    }
}
