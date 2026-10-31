package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pqx0 extends frx0 {
    public final long a;
    public final String b;
    public final boolean c;

    public pqx0(long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqx0)) {
            return false;
        }
        pqx0 pqx0Var = (pqx0) obj;
        return this.a == pqx0Var.a && u890.j(this.b, pqx0Var.b) && this.c == pqx0Var.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
