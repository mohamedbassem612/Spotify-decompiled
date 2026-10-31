package p;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b6o implements x5o {
    public final CredentialManager a;

    public b6o(Context context) {
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    public final void b(Context context, xjn xjnVar, CancellationSignal cancellationSignal, l5o l5oVar, i6b i6bVar) {
        int i;
        j3m j3mVar = new j3m(i6bVar, (byte) 29);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            j3mVar.invoke();
            return;
        }
        y5o y5oVar = new y5o(i6bVar, xjnVar, this);
        credentialManager.getClass();
        String str = (String) xjnVar.a;
        Bundle bundle = (Bundle) xjnVar.b;
        ham hamVar = (ham) xjnVar.d;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) hamVar.b);
        CharSequence charSequence = (CharSequence) hamVar.c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        if (xjnVar instanceof pon) {
            i = 2131233374;
        } else {
            i = xjnVar instanceof jqn ? 2131233373 : 2131233372;
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        credentialManager.createCredential(context, new CreateCredentialRequest.Builder(str, bundle, (Bundle) xjnVar.c).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true).build(), cancellationSignal, l5oVar, y5oVar);
    }

    public final void c(Context context, fjs0 fjs0Var, CancellationSignal cancellationSignal, l5o l5oVar, rjn rjnVar) {
        z5o z5oVar = new z5o(rjnVar, (byte) 0);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            z5oVar.invoke();
            return;
        }
        a6o a6oVar = new a6o(rjnVar, this);
        credentialManager.getClass();
        Bundle bundleG = pzm.g("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundleG.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", fjs0Var.a);
        bundleG.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundleG);
        for (po40 po40Var : (List) fjs0Var.b) {
            builder.addCredentialOption(new CredentialOption.Builder(po40Var.a, po40Var.b, po40Var.c).setIsSystemProviderRequired(po40Var.d).setAllowedProviders(po40Var.e).build());
        }
        credentialManager.getCredential(context, builder.build(), cancellationSignal, (Executor) l5oVar, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) a6oVar);
    }
}
