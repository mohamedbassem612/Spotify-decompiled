package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bx01 {
    public final Map a;

    public bx01(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx01) && u890.j(this.a, ((bx01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
