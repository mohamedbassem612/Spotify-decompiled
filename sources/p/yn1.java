package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yn1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn1(ov1 ov1Var, byte b) {
        super(3);
        this.a = b;
        this.b = ov1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ov1 ov1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                ov1Var.b(nim0.a, null, (b0k) obj2, 518);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else if (!zBooleanValue) {
                    x340Var2.i0(-1163530064);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1163677097);
                    nyx.a(2, (wux) null, apo.r(917349280, new zn1(ov1Var, (byte) 0), x340Var2), x340Var2, 3078, 6);
                    x340Var2.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
