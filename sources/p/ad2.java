package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ad2 {
    public final Map a;

    public ad2(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad2) && u890.j(this.a, ((ad2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ ad2() {
        this(b7x.a);
    }
}
