package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yas {
    public final LinkedHashMap a;
    public final h290 b;

    public yas(LinkedHashMap linkedHashMap, h290 h290Var) {
        this.a = linkedHashMap;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yas)) {
            return false;
        }
        yas yasVar = (yas) obj;
        return this.a.equals(yasVar.a) && this.b.equals(yasVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
