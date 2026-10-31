package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class frw implements irw {
    public final yo50 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    public frw(yo50 yo50Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = yo50Var;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frw)) {
            return false;
        }
        frw frwVar = (frw) obj;
        return this.a.equals(frwVar.a) && this.b.equals(frwVar.b) && this.c.equals(frwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
