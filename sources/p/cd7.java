package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cd7 extends ld7 {
    public final LinkedHashMap a;

    public cd7(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd7) && this.a.equals(((cd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
