package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j9o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9o(umf0 umf0Var, byte b) {
        super(1);
        this.a = b;
        this.b = umf0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        umf0 umf0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new lu(umf0Var, (lnm) null, (byte) 22));
                qtrVar.d(new qrk(1, (byte) 6), new sqk(2, (byte) 13));
                break;
            default:
                qtr qtrVar2 = (qtr) obj;
                qtrVar2.b(new wm0(umf0Var, (lnm) null, (byte) 1));
                qtrVar2.d(new qrk(1, (byte) 7), new sqk(2, (byte) 14));
                break;
        }
        return rih1Var;
    }
}
