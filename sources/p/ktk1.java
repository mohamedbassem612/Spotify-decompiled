package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ktk1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ktk1(drr0 drr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = drr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        drr0 drr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qr80(((long) jch0.U(drr0Var.s())) << 32);
            default:
                drr0Var.t(((Number) ((o95) obj).e()).floatValue());
                return rih1.a;
        }
    }
}
