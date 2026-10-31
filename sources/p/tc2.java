package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tc2 extends wc2 {
    public final Map a;

    public tc2(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc2) && this.a.equals(((tc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
