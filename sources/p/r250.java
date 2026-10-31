package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r250 extends xpo {
    public final String c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    public r250(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        Bundle bundleF = pzm.f("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundleF.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundleF.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundleF.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundleF.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundleF.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundleF);
        this.c = str2;
        this.d = str3;
        if (str.length() <= 0) {
            hhg1.n("id should not be empty");
            throw null;
        }
        if (str2.length() > 0) {
            return;
        }
        hhg1.n("idToken should not be empty");
        throw null;
    }
}
