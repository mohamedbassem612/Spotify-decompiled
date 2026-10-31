package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class os3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ps3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os3(ps3 ps3Var) {
        super(2);
        this.a = (byte) 2;
        this.b = ps3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ps3 ps3Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ps3Var.c((b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ps3Var.c((b0k) obj, czo1.p(1));
                break;
            case 2:
                ps3Var.l.c(new z5o0((h0r0) obj, (c7r0) obj2));
                break;
            default:
                ((Number) obj2).intValue();
                ps3Var.c((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os3(ps3 ps3Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ps3Var;
    }
}
