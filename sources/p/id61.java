package p;

import android.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class id61 {
    public static final String a;
    public static final String b;

    static {
        String strEncodeToString = Base64.encodeToString(gg.s().getBytes(nne.a), 10);
        a = f4i1.f("firebase_session_", strEncodeToString, "_data");
        b = f4i1.f("firebase_session_", strEncodeToString, "_settings");
    }
}
