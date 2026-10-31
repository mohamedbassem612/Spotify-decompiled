package p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class i0n0 extends MusicAppLock {
    public i0n0(String str) {
        super(str.concat(" worker"), false, null);
    }
}
