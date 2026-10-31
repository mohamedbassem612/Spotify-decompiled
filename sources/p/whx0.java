package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class whx0 {
    public final Map a;

    public whx0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whx0) && this.a.equals(((whx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
