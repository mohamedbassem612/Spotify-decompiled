package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zkk0 {
    public final Double a;
    public final String b;

    public zkk0(Double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkk0)) {
            return false;
        }
        zkk0 zkk0Var = (zkk0) obj;
        return u890.j(this.a, zkk0Var.a) && u890.j(this.b, zkk0Var.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
