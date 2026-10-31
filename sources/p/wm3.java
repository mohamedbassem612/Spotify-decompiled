package p;

import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wm3 extends ym3 {
    public final EntryPoint a;

    public wm3(EntryPoint entryPoint) {
        this.a = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm3) && this.a == ((wm3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
