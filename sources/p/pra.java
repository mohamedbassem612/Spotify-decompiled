package p;

import android.content.Context;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pra {
    public volatile twa a;
    public final Context b;
    public volatile s141 c;
    public volatile boolean d;

    public final boolean a() {
        try {
            Context context = this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), SemanticState.Focused).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            vsn1.i("BillingClient");
            return false;
        }
    }
}
