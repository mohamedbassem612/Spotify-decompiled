package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j9v0 {
    public final Map a;

    public j9v0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9v0) && u890.j(this.a, ((j9v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ j9v0() {
        this(b7x.a);
    }
}
