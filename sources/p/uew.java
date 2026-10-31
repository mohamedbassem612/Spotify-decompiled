package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uew implements liw {
    public final Map a;

    public uew(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uew) && this.a.equals(((uew) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
