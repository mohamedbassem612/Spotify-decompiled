package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rlq0 {
    public final Map a;

    public rlq0(Map map) {
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlq0) && u890.j(this.a, ((rlq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
