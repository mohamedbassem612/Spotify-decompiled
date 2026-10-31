package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r7z0 extends z8z0 {
    public final LinkedHashMap a;

    public r7z0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7z0) && this.a.equals(((r7z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
