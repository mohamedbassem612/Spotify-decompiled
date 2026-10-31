package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kw11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;
    public final /* synthetic */ hw11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw11(maa maaVar, hw11 hw11Var, byte b) {
        super(3);
        this.a = b;
        this.b = maaVar;
        this.c = hw11Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                otw.c(this.b, this.c, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
            default:
                ((Number) obj3).intValue();
                otw.c(this.b, this.c, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
