package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wkl implements all {
    public final Map a;

    public wkl(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkl) && u890.j(this.a, ((wkl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
