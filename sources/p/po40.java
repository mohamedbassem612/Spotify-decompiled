package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class po40 {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final boolean d;
    public final Set e;

    public po40(String str) {
        Bundle bundleF = pzm.f("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundleF.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundleF, bundle, false, true, w7x.a, 100);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        hhg1.n("requestJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public po40() {
        Bundle bundle = new Bundle();
        w7x w7xVar = w7x.a;
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>((Collection) w7xVar));
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>((Collection) w7xVar));
        this("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, false, w7xVar, 1000);
    }

    public po40(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = z;
        this.e = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }
}
