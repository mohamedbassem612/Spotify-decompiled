package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.login.loginflowimpl.LoginActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iwe0 {
    public final kba a;

    public iwe0(kba kbaVar) {
        this.a = kbaVar;
    }

    public static Intent a(iwe0 iwe0Var, Context context, Intent intent, hwe0 hwe0Var) {
        Intent intent2 = new Intent();
        intent2.setClass(context, LoginActivity.class);
        intent2.putExtra("intent", intent);
        intent2.putExtra("previously_logged_in", false);
        intent2.putExtra("child_credentials", hwe0Var);
        intent2.setFlags(268468224);
        return intent2;
    }

    public static /* synthetic */ Intent c(iwe0 iwe0Var, Context context, Intent intent, Uri uri, int i) {
        if ((i & 8) != 0) {
            uri = null;
        }
        return iwe0Var.b(context, intent, false, uri, 268468224, (i & 32) != 0, false);
    }

    public final Intent b(Context context, Intent intent, boolean z, Uri uri, int i, boolean z2, boolean z3) {
        Uri uriZ0;
        Intent intent2 = (Intent) intent.clone();
        if (myo1.q(intent2.getData())) {
            intent2.setData(null);
        }
        Intent intent3 = new Intent();
        intent3.setClass(context, LoginActivity.class);
        intent3.putExtra("intent", intent2);
        intent3.putExtra("previously_logged_in", z);
        intent3.putExtra("is_web_login_flow_supported", z2);
        intent3.putExtra("extra_start_on_login", z3);
        intent3.setFlags(i);
        intent3.setData(uri);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (uriZ0 = ag0.z0(activity)) != null) {
            intent3.putExtra("android.intent.extra.REFERRER", uriZ0);
        }
        return intent3;
    }
}
