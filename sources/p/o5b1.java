package p;

import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface o5b1 {
    void c(String str);

    void g(String str);

    void stopSelf();

    default void e(MediaSessionCompat.Token token) {
    }
}
