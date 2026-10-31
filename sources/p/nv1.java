package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nv1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv1(ov1 ov1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ov1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ov1 ov1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ov1Var.b.a(new uwq0(uwg.e));
                return new mv1(ov1Var, (byte) 0);
            case 1:
                ov1Var.e = (upo) obj;
                return rih1.a;
            default:
                ov1Var.b.a(new uwq0(m9h.e));
                return new mv1(ov1Var, (byte) 1);
        }
    }
}
