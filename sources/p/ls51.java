package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls51 implements ns51 {
    public final String a;
    public final List b;

    public ls51(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls51)) {
            return false;
        }
        ls51 ls51Var = (ls51) obj;
        return this.a.equals(ls51Var.a) && this.b.equals(ls51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
