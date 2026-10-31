package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mq extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AccountSwitcherActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq(AccountSwitcherActivity accountSwitcherActivity, byte b) {
        super(0);
        this.a = b;
        this.b = accountSwitcherActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        AccountSwitcherActivity accountSwitcherActivity = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return accountSwitcherActivity.o();
            case 1:
                return accountSwitcherActivity.O();
            default:
                jv jvVar = accountSwitcherActivity.f1;
                if (jvVar != null) {
                    return jvVar;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
