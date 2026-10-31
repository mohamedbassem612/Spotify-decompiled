package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zgx0 implements ahx0 {
    public final Map a;

    public zgx0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgx0) && this.a.equals(((zgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
