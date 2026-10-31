package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oyn0 implements ryn0 {
    public final Map a;

    public oyn0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyn0) && u890.j(this.a, ((oyn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
