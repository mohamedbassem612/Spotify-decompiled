package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nfl implements xpx0 {
    public final LinkedHashMap a;

    public nfl(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfl) && this.a.equals(((nfl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
