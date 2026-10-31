package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zyr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uyr0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyr0(uyr0 uyr0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uyr0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        uyr0 uyr0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mmo1.o(uyr0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                mmo1.q(uyr0Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
