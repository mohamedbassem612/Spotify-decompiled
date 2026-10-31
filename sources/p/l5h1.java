package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l5h1 implements m5h1 {
    public final String a;
    public final Long b;

    public l5h1(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5h1)) {
            return false;
        }
        l5h1 l5h1Var = (l5h1) obj;
        return u890.j(this.a, l5h1Var.a) && u890.j(this.b, l5h1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
