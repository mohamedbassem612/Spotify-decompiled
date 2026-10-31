package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class om10 extends w0h1 {
    public final LinkedHashMap d;

    public om10(LinkedHashMap linkedHashMap) {
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om10) && this.d.equals(((om10) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
