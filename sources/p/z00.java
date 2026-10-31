package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z00 implements l10 {
    public final boolean a;
    public final eln0 b;
    public final List c;

    public z00(List list, eln0 eln0Var, boolean z) {
        this.a = z;
        this.b = eln0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return this.a == z00Var.a && this.b.equals(z00Var.b) && u890.j(this.c, z00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
