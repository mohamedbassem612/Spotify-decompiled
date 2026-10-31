package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mvv0 {
    public final ayq0 a;
    public final List b;

    public mvv0(ayq0 ayq0Var, List list) {
        this.a = ayq0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvv0)) {
            return false;
        }
        mvv0 mvv0Var = (mvv0) obj;
        return this.a.equals(mvv0Var.a) && this.b.equals(mvv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
