package p;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c820 implements d820 {
    public final List a;
    public final LinkedHashSet b;

    public c820(List list, LinkedHashSet linkedHashSet) {
        this.a = list;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c820)) {
            return false;
        }
        c820 c820Var = (c820) obj;
        return u890.j(this.a, c820Var.a) && this.b.equals(c820Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
