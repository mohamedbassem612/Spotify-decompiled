package p;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v911 implements o5s {
    public final /* synthetic */ w911 a;

    public v911(w911 w911Var) {
        this.a = w911Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final void onCreate(iac0 iac0Var) {
        Uri m231Var;
        Uri uri;
        w911 w911Var = this.a;
        Bundle bundleA = w911Var.c.p().a("navigation.referrer-accessor.saved_state_key");
        if (bundleA == null) {
            try {
                m231Var = ag0.z0(w911Var.a);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            uri = m231Var;
        } else {
            uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundleA.getParcelable("navigation.referrer-accessor.state_last_referrer", Uri.class) : bundleA.getParcelable("navigation.referrer-accessor.state_last_referrer"));
            if (uri == null) {
                m231Var = ag0.z0(w911Var.a);
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                uri = m231Var;
            }
        }
        w911Var.b = uri;
    }
}
