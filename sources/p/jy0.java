package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jy0 implements ky0 {
    public final Map a;

    public jy0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy0) && this.a.equals(((jy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
