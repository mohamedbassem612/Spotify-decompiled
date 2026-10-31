package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p.n3r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MediaDrmCallbackException extends IOException {
    public final n3r a;
    public final Uri b;
    public final Map c;
    public final long d;

    public MediaDrmCallbackException(n3r n3rVar, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = n3rVar;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
