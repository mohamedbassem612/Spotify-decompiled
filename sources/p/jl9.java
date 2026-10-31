package p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jl9 {
    public final List a;
    public final jp9 b;
    public final String c;
    public final boolean d;

    public jl9(List list, jp9 jp9Var, String str, boolean z) {
        this.a = list;
        this.b = jp9Var;
        this.c = str;
        this.d = z;
    }

    public final int a(long j) {
        jp9 jp9Var = this.b;
        if (jp9Var != null) {
            long jA = jp9Var.a(j);
            List list = this.a;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (((yq9) listIterator.previous()).b <= jA) {
                    return listIterator.nextIndex();
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl9)) {
            return false;
        }
        jl9 jl9Var = (jl9) obj;
        return u890.j(this.a, jl9Var.a) && u890.j(this.b, jl9Var.b) && u890.j(this.c, jl9Var.c) && this.d == jl9Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jp9 jp9Var = this.b;
        int iHashCode2 = (iHashCode + (jp9Var == null ? 0 : jp9Var.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public /* synthetic */ jl9() {
        this(z6x.a, null, null, false);
    }
}
