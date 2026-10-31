package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fzl1 {
    public static gzl1 a(LinkedHashMap linkedHashMap) {
        wwx0 wwx0Var = (wwx0) linkedHashMap.get("workout_type");
        if (wwx0Var != null) {
            return b(wwx0Var.b);
        }
        return null;
    }

    public static gzl1 b(String str) {
        Object next;
        d7 d7Var = new d7(gzl1.f, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            if (((gzl1) next).a.equals(str)) {
                return (gzl1) next;
            }
        }
        next = null;
        return (gzl1) next;
    }

    public final nma0 serializer() {
        return (nma0) gzl1.b.getValue();
    }
}
