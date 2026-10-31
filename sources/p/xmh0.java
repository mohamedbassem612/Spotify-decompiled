package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xmh0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ smh0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmh0(smh0 smh0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = smh0Var;
        this.c = iu30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        smh0 smh0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rjo1.d(smh0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                rjo1.d(smh0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                rjo1.d(smh0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
