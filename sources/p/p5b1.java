package p;

import android.net.Uri;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class p5b1 {
    public static final r8i0 a;
    public static final r8i0 b;

    static {
        r8i0 r8i0VarW;
        se11 se11Var = r8i0.e;
        r8i0 r8i0VarW2 = null;
        try {
            r8i0VarW = bmq0.w("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            r8i0VarW = null;
        }
        a = r8i0VarW;
        se11 se11Var2 = r8i0.e;
        try {
            r8i0VarW2 = bmq0.w("application/x-www-form-urlencoded");
        } catch (IllegalArgumentException unused2) {
        }
        b = r8i0VarW2;
    }

    public static final MediaDrmCallbackException a(Exception exc) {
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        dm5.s(uri, "The uri must be set.");
        return new MediaDrmCallbackException(new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, b7x.a, 0L, exc);
    }
}
