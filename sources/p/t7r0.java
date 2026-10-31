package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t7r0 implements dbr0 {
    public final Map a;

    public t7r0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7r0) && this.a.equals(((t7r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
