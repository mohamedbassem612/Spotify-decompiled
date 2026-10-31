package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cwr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dlg1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwr0(dlg1 dlg1Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = dlg1Var;
        this.c = iu30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        dlg1 dlg1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nko1.u(dlg1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                kln1.k(dlg1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
