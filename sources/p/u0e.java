package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u0e {
    public final ContextTrack a;
    public final int b;
    public final znf1 c;
    public long d;

    public u0e(ContextTrack contextTrack, int i, int i2) {
        this.a = contextTrack;
        int i3 = (i * 31) + i2;
        this.b = i3;
        String strUid = contextTrack.uid();
        this.c = new znf1((strUid == null || strUid.length() <= 0) ? null : strUid, contextTrack.uri());
        this.d = i3;
    }
}
