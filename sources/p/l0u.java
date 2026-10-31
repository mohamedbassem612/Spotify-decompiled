package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l0u {
    public final Double a;
    public final String b;

    public l0u(Double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0u)) {
            return false;
        }
        l0u l0uVar = (l0u) obj;
        return u890.j(this.a, l0uVar.a) && u890.j(this.b, l0uVar.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
