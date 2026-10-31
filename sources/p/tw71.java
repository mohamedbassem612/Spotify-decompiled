package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tw71 implements uw71 {
    public final Set a;

    public tw71(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw71) && this.a.equals(((tw71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
