package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xe61 implements cf61 {
    public final j4e a;
    public final String b;

    public xe61(j4e j4eVar, String str) {
        this.a = j4eVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe61)) {
            return false;
        }
        xe61 xe61Var = (xe61) obj;
        return this.a.equals(xe61Var.a) && u890.j(this.b, xe61Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
