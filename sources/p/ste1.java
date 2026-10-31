package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ste1 {
    public final int a;
    public final Long b;

    public ste1(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ste1)) {
            return false;
        }
        ste1 ste1Var = (ste1) obj;
        return this.a == ste1Var.a && u890.j(this.b, ste1Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        Long l = this.b;
        return iC + (l == null ? 0 : l.hashCode());
    }
}
