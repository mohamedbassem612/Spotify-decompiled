package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uck0 {
    public final Map a;

    public uck0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uck0) && this.a.equals(((uck0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
