package p;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qmy0 extends yf {
    public final String c;

    public qmy0(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.c = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        hhg1.n("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public final String v() {
        return this.c;
    }
}
