package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class lq implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AccountSwitcherActivity b;

    public /* synthetic */ lq(AccountSwitcherActivity accountSwitcherActivity, byte b) {
        this.a = b;
        this.b = accountSwitcherActivity;
    }

    public final void b(Object obj) {
        byte b = this.a;
        AccountSwitcherActivity accountSwitcherActivity = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i = AccountSwitcherActivity.i1;
                accountSwitcherActivity.o0((kv) obj);
                break;
            default:
                int i2 = AccountSwitcherActivity.i1;
                accountSwitcherActivity.o0((kv) obj);
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
        }
        return new tv30(1, this.b, AccountSwitcherActivity.class, "handleViewEffect", "handleViewEffect(Lcom/spotify/accountswitching/switcheruiimpl/mobius/logic/AccountSwitcherViewEffect;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
