package p;

import com.spotify.localfiles.localfilesmonorepo.AudioMimeMatcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pq21 implements qq21 {
    public final jbh0 a;

    public pq21(AudioMimeMatcher audioMimeMatcher) {
        this.a = audioMimeMatcher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq21) && this.a.equals(((pq21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 137387607;
    }
}
