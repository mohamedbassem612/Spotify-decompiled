package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pon extends xjn {
    public pon(String str, String str2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", pzm.f("androidx.credentials.BUNDLE_KEY_ID", str, "androidx.credentials.BUNDLE_KEY_PASSWORD", str2), new Bundle(), new ham(str, (String) null));
        if (str2.length() > 0) {
            return;
        }
        hhg1.n("password should not be empty");
        throw null;
    }
}
