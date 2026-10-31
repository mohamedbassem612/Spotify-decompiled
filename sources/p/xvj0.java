package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvj0 {
    public final Map a;

    public xvj0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvj0) && this.a.equals(((xvj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
