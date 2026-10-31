package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v5c1 implements w5c1 {
    public final RiveAnimation a;

    public v5c1(RiveAnimation riveAnimation) {
        this.a = riveAnimation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5c1) && u890.j(this.a, ((v5c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
