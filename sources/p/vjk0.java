package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vjk0 {
    public final LinkedHashMap a;
    public final Map b;

    public vjk0(LinkedHashMap linkedHashMap, Map map) {
        this.a = linkedHashMap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjk0)) {
            return false;
        }
        vjk0 vjk0Var = (vjk0) obj;
        return this.a.equals(vjk0Var.a) && this.b.equals(vjk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
