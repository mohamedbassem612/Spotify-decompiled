package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iev0 {
    public final String a;
    public final Integer b;

    public iev0(Integer num, String str) {
        this.a = str;
        this.b = num;
        if (num == null || num.intValue() > 0) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iev0)) {
            return false;
        }
        iev0 iev0Var = (iev0) obj;
        return u890.j(this.a, iev0Var.a) && u890.j(this.b, iev0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
