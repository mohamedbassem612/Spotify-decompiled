package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x421 implements a521 {
    public final Map a;

    public x421(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x421) && this.a.equals(((x421) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
