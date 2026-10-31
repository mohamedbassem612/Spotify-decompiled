package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nv51 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xcv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv51(xcv xcvVar, byte b) {
        super(3);
        this.a = b;
        this.b = xcvVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xcv xcvVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                oho1.s(xcvVar.e, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                cjc0 cjc0Var = new cjc0(2);
                uwo1.e(xcvVar.b, null, null, 0L, null, null, 0, false, cjc0Var, 0, null, (b0k) obj2, 0, 0, 1790);
                break;
        }
        return rih1Var;
    }
}
