package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pl5 extends BroadcastReceiver {
    static {
        new ol5(null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zO = nhc1.O("com.microsoft.crossdevice.appcontextrequest", intent.getAction());
        cte0 cte0Var = cte0.a;
        if (!zO) {
            cte0Var.w("AppContextBroadcastReceiver", u890.A(intent.getAction(), "Ignoring broadcast for action: "));
            return;
        }
        cte0Var.i("AppContextBroadcastReceiver", u890.A(intent.getAction(), "Context request broadcast received with intent action "));
        if (intent.getIntExtra("connectionState", 0) == 1) {
            xnm appContextEventHandler$continuity_release = sl5.a.getAppContextEventHandler$continuity_release();
            if (appContextEventHandler$continuity_release == null) {
                return;
            }
            appContextEventHandler$continuity_release.a.h = false;
            return;
        }
        String stringExtra = intent.getStringExtra("contentProviderUri");
        rih1 rih1Var = null;
        if (TextUtils.isEmpty(stringExtra)) {
            InvalidParameterException invalidParameterException = new InvalidParameterException("contentProviderUri:missing");
            xnm appContextEventHandler$continuity_release2 = sl5.a.getAppContextEventHandler$continuity_release();
            if (appContextEventHandler$continuity_release2 != null) {
                appContextEventHandler$continuity_release2.a.c.F("InvalidContextRequest", invalidParameterException);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                String message = invalidParameterException.getMessage();
                message.getClass();
                cte0Var.e("AppContextBroadcastReceiver", message);
                return;
            }
            return;
        }
        Uri uri = Uri.parse(stringExtra);
        vl5 vl5VarValidateContentProviderAuthority = ul5.a.validateContentProviderAuthority(context, uri);
        cte0Var.i("AppContextBroadcastReceiver", "Content provider URI: " + uri + " [" + vl5VarValidateContentProviderAuthority.name() + ']');
        vl5 vl5Var = vl5.a;
        if (vl5VarValidateContentProviderAuthority != vl5Var) {
            cte0Var.w("AppContextBroadcastReceiver", "Invalid intent extras " + uri + ':' + vl5VarValidateContentProviderAuthority.name());
        }
        if (vl5VarValidateContentProviderAuthority != vl5Var) {
            return;
        }
        boolean zHasExtra = intent.hasExtra("uriTypes");
        int iIntValue = Integer.valueOf(intent.getIntExtra("requestedContextType", 2)).intValue();
        context.getSharedPreferences("app_context_pref", 0).edit().putString(String.valueOf(iIntValue), stringExtra).putInt("requestedContextType", iIntValue).putBoolean("using_legacy_mode", zHasExtra).apply();
        xnm appContextEventHandler$continuity_release3 = sl5.a.getAppContextEventHandler$continuity_release();
        if (appContextEventHandler$continuity_release3 == null) {
            return;
        }
        glm glmVar = new glm();
        glmVar.setType$continuity_release(iIntValue);
        glmVar.getType();
        znm znmVar = appContextEventHandler$continuity_release3.a;
        znmVar.c.E();
        znmVar.h = true;
        x1c x1cVar = znmVar.i;
        if (x1cVar != null) {
            long jB = x1cVar.b(znmVar.b);
            if (jB > 0) {
                znmVar.b(jB);
            }
        }
        znmVar.i = null;
    }
}
