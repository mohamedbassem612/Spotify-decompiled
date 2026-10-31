package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class vu0 implements vr20, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ vu0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        vr20 vr20Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                Object objEmit = vr20Var.emit(bool, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 1:
                Object objEmit2 = vr20Var.emit((rih1) obj, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                Object objEmit3 = vr20Var.emit(bool2, lnmVar);
                return objEmit3 == d9nVar ? objEmit3 : rih1Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return new tv30(2, this.b, vr20.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
