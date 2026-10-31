package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ltf0 implements mtf0 {
    public final Map a;

    public ltf0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltf0) && this.a.equals(((ltf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
