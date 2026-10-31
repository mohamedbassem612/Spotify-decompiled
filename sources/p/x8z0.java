package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8z0 extends z8z0 {
    public final LinkedHashMap a;

    public x8z0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8z0) && this.a.equals(((x8z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
