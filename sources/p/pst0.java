package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class pst0 {
    public static boolean a(Bundle bundle) {
        return bundle.containsKey("com.spotify.music.extra.SHUFFLE") && bundle.getBoolean("com.spotify.music.extra.SHUFFLE");
    }
}
