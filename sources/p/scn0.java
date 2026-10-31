package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class scn0 {
    public final LinkedHashMap a;

    public scn0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final void a(x60 x60Var, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.get(x60Var);
        if (obj == null) {
            linkedHashMap.remove(x60Var);
        } else {
            linkedHashMap.put(x60Var, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof scn0) {
            return this.a.equals(((scn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
