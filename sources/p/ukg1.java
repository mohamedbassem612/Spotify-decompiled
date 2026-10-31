package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ukg1 {
    public final List a;
    public final ajg1 b;

    public ukg1(List list, ajg1 ajg1Var) {
        this.a = list;
        this.b = ajg1Var;
    }

    public final List a() {
        return this.a;
    }

    public final ajg1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukg1)) {
            return false;
        }
        ukg1 ukg1Var = (ukg1) obj;
        return this.a.equals(ukg1Var.a) && this.b.equals(ukg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
