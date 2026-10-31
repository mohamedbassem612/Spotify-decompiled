package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqe1 {
    public final kn0 a;
    public final List b;
    public final boolean c;

    public yqe1(kn0 kn0Var, List list, boolean z) {
        this.a = kn0Var;
        this.b = list;
        this.c = z;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqe1)) {
            return false;
        }
        yqe1 yqe1Var = (yqe1) obj;
        return this.a == yqe1Var.a && u890.j(this.b, yqe1Var.b) && this.c == yqe1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}
