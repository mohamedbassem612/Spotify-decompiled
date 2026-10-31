package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e00 implements l10 {
    public final eln0 a;
    public final List b;
    public final boolean c;

    public e00(List list, eln0 eln0Var, boolean z) {
        this.a = eln0Var;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        return this.a.equals(e00Var.a) && this.b.equals(e00Var.b) && this.c == e00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
