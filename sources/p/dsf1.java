package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dsf1 {
    public final String a;
    public final List b;
    public final boolean c;

    public dsf1(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsf1)) {
            return false;
        }
        dsf1 dsf1Var = (dsf1) obj;
        return this.a.equals(dsf1Var.a) && this.b.equals(dsf1Var.b) && this.c == dsf1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
