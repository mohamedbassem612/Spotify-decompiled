package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class u160 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fai0 b;

    public /* synthetic */ u160(fai0 fai0Var, byte b) {
        this.a = b;
        this.b = fai0Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        fai0 fai0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fai0Var.m((hy50) obj);
                break;
            case 1:
                fai0Var.m(obj);
                break;
            default:
                fai0Var.m(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
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
        return new tv30(1, this.b, fai0.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
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
