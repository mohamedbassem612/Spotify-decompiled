package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wqf0 implements xqf0 {
    public final Map a;

    public wqf0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqf0) && this.a.equals(((wqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
