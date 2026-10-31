package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ge71 implements ez00 {
    public final LinkedHashSet a;

    public ge71(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge71) && this.a.equals(((ge71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
