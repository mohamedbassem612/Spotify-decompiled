package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rzn extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohm0 b;
    public final /* synthetic */ af10 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzn(ohm0 ohm0Var, af10 af10Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ohm0Var;
        this.c = af10Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        af10 af10Var = this.c;
        ohm0 ohm0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bro1.e(ohm0Var, af10Var, qim0Var, b0kVar, czo1.p(385));
                break;
            default:
                bro1.e(ohm0Var, af10Var, qim0Var, b0kVar, czo1.p(385));
                break;
        }
        return rih1Var;
    }
}
