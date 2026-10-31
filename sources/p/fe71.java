package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fe71 {
    public final LinkedHashSet a;

    public fe71(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe71) && this.a.equals(((fe71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
