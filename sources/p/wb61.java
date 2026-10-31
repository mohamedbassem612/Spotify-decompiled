package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wb61 {
    public final Map a;

    public wb61(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb61) && u890.j(this.a, ((wb61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
