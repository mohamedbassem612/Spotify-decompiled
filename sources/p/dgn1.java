package p;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dgn1 {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, rxo1 rxo1Var) {
        Bundle bundleCall;
        String str = rxo1Var.a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (rxo1Var.c) {
            Bundle bundleG = cy30.g("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundleG);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                new StringBuilder(str.length() + 72);
                                throw new zzaf(new lal(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        "Dynamic lookup for intent failed for action: ".concat(str);
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(str).setPackage(rxo1Var.b) : intent;
    }
}
