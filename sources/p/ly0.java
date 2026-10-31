package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ly0 implements ny0 {
    public final Map a;

    public ly0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly0) && this.a.equals(((ly0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
