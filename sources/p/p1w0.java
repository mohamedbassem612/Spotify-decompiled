package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p1w0 extends h2w0 {
    public final Map a;

    public p1w0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1w0) && this.a.equals(((p1w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
