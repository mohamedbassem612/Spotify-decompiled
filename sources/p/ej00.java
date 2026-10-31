package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ej00 extends xfo1 {
    public final LinkedHashSet b;
    public final Set c;

    public ej00(LinkedHashSet linkedHashSet, Set set) {
        this.b = linkedHashSet;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej00)) {
            return false;
        }
        ej00 ej00Var = (ej00) obj;
        return this.b.equals(ej00Var.b) && this.c.equals(ej00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
