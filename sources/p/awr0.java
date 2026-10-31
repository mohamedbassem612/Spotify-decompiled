package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class awr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmg1 b;
    public final /* synthetic */ dlg1 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awr0(bmg1 bmg1Var, dlg1 dlg1Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bmg1Var;
        this.c = dlg1Var;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nko1.r(czo1.p(i | 1), (b0k) obj, this.d, this.e, this.c, this.b);
                break;
            case 1:
                ((Number) obj2).intValue();
                kln1.p(czo1.p(i | 1), (b0k) obj, this.d, this.e, this.c, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                kln1.q(czo1.p(i | 1), (b0k) obj, this.d, this.e, this.c, this.b);
                break;
        }
        return rih1Var;
    }
}
