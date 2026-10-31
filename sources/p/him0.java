package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class him0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zyi0 b;
    public final /* synthetic */ bzi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ him0(zyi0 zyi0Var, bzi0 bzi0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zyi0Var;
        this.c = bzi0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bzi0 bzi0Var = this.c;
        zyi0 zyi0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d1u.w(zyi0Var, bzi0Var, b0kVar, czo1.p(1));
                break;
            default:
                i6p1.e(zyi0Var, bzi0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
