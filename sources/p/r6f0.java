package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6f0 implements s6f0 {
    public final Map a;

    public r6f0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6f0) && this.a.equals(((r6f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
