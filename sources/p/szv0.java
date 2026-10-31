package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class szv0 {
    public final long a;
    public final String b;

    public szv0(long j, int i, String str) {
        str = (i & 2) != 0 ? null : str;
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szv0)) {
            return false;
        }
        szv0 szv0Var = (szv0) obj;
        return this.a == szv0Var.a && u890.j(this.b, szv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(false) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961);
    }
}
