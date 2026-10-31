package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ovn implements awn {
    public final Map a;

    public ovn(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovn) && this.a.equals(((ovn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
