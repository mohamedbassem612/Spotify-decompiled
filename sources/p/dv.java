package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dv {
    public static Intent a(dv dvVar, Context context, String str, String str2, String str3) {
        dvVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("account_switch_action", (Parcelable) new av(str, str2, str3));
        intent.setClass(context, AccountSwitcherActivity.class);
        intent.setFlags(268468224);
        return intent;
    }

    public static Intent b(dv dvVar, Activity activity, String str) {
        dvVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("account_switch_action", (Parcelable) new bv(str));
        intent.setClass(activity, AccountSwitcherActivity.class);
        intent.setFlags(268468224);
        return intent;
    }
}
