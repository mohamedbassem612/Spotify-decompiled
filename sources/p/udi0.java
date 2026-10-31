package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class udi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udi0(wdi0 wdi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wdi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wdi0 wdi0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return upo1.H((ndi0) obj, null, wdi0Var.f);
            default:
                ((qtr) obj).b(new k1(wdi0Var, null, (byte) 18));
                return rih1.a;
        }
    }
}
