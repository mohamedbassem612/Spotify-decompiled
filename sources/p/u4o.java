package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u4o {
    public final Map a;

    public u4o(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4o) && this.a.equals(((u4o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
