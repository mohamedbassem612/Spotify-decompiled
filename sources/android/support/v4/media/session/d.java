package android.support.v4.media.session;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d {
    public int b;
    public long c;
    public float d;
    public long e;
    public long f;
    public final ArrayList a = new ArrayList();
    public final long g = -1;

    public final PlaybackStateCompat a() {
        return new PlaybackStateCompat(this.b, this.c, 0L, this.d, this.e, 0, (CharSequence) null, this.f, this.a, this.g, (Bundle) null);
    }
}
