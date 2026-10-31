package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kan1 {
    public static final que0 a = new que0("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.b("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        lan1.d(context).e();
        Set set = j8n1.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((j8n1) it.next()).getClass();
            k220.c();
            return;
        }
        synchronized (pz40.R0) {
            try {
                pz40 pz40Var = pz40.S0;
                if (pz40Var != null) {
                    pz40Var.i.incrementAndGet();
                    jim0 jim0Var = pz40Var.N0;
                    jim0Var.sendMessageAtFrontOfQueue(jim0Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
