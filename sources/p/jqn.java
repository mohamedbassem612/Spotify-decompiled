package p;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jqn extends xjn {
    public jqn(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
            ham hamVar = new ham(jSONObject.getString("name"), jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName"));
            Bundle bundleF = pzm.f("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundleF.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundleF, bundle, hamVar);
            if (str.length() != 0) {
                try {
                    new JSONObject(str);
                    return;
                } catch (Exception unused) {
                }
            }
            hhg1.n("requestJson must not be empty, and must be a valid JSON");
            throw null;
        } catch (Exception unused2) {
            hhg1.n("user.name must be defined in requestJson");
            throw null;
        }
    }
}
