package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ozt {
    public final Map a;

    public ozt(Map map) {
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozt) && u890.j(this.a, ((ozt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
