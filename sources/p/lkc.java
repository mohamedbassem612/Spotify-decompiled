package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lkc extends t3k1 {
    public final Map b;

    public lkc(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkc) && u890.j(this.b, ((lkc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
