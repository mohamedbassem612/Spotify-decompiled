package p;

import android.content.Context;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class byh0 extends ayh0 {
    public byh0(MediaSession mediaSession) {
        super(mediaSession);
        this.e = mediaSession.getController().getSessionInfo();
    }

    @Override // p.yxh0
    public final MediaSession a(Context context, String str) {
        return i15.j(context, str);
    }
}
