package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rxx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ max b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxx(max maxVar, byte b) {
        super(1);
        this.a = b;
        this.b = maxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hax haxVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e261 e261Var = (e261) obj;
                if (haxVar instanceof hax) {
                    b261.A(e261Var, haxVar.a);
                    b261.a(e261Var);
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                if (haxVar instanceof hax) {
                    b261.A(e261Var2, haxVar.a);
                    b261.a(e261Var2);
                }
                break;
        }
        return rih1Var;
    }
}
