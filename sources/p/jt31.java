package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jt31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt31(c380 c380Var, vu30 vu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tm80.t(c380Var, vu30Var, b0kVar, czo1.p(1));
                break;
            case 1:
                c921.k(c380Var, vu30Var, b0kVar, czo1.p(1));
                break;
            default:
                c921.l(c380Var, vu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
