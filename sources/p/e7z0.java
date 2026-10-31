package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e7z0 extends z8z0 {
    public final LinkedHashMap a;

    public e7z0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7z0) && this.a.equals(((e7z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
