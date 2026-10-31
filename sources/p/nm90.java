package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nm90 implements om90 {
    public final LinkedHashSet a;

    public nm90(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm90) && this.a.equals(((nm90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
