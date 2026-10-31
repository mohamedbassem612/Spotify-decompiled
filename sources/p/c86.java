package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c86 implements m86 {
    public final LinkedHashMap a;

    public c86(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c86) && this.a.equals(((c86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
