package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xad0 {
    public final LinkedHashMap a;

    public xad0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xad0) && this.a.equals(((xad0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
