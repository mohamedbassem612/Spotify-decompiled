package p;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class tt50 {
    public static final String a = b8o.class.getSimpleName();
    public static final MessageDigest b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            Log.isLoggable(a, 3);
            messageDigest = null;
        }
        b = messageDigest;
    }
}
