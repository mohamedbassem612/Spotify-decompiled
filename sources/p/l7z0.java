package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l7z0 extends z8z0 {
    public final Map a;

    public l7z0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7z0) && this.a.equals(((l7z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
