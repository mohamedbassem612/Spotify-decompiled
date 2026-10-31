package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h5k0 implements m5k0 {
    public final Map a;

    public h5k0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5k0) && this.a.equals(((h5k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
