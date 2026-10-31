package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class elv0 {
    public final Map a;

    public elv0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elv0) && this.a.equals(((elv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
