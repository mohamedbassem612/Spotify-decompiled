package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bx1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx1(xj0 xj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xj0 xj0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xj0Var.invoke(new js1((String) obj));
                break;
            case 1:
                xj0Var.invoke(new ks1(((Number) obj).longValue()));
                break;
            case 2:
                xj0Var.invoke(new os1((fo1) obj));
                break;
            default:
                xj0Var.invoke(new us1(((Boolean) obj).booleanValue()));
                break;
        }
        return rih1Var;
    }
}
