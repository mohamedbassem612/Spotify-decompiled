package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pvn implements awn {
    public final Map a;

    public pvn(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvn) && this.a.equals(((pvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
