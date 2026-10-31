package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nb41 extends pb41 {
    public final boolean a;
    public final String b;
    public final float c;

    public nb41(boolean z, String str, float f) {
        this.a = z;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb41)) {
            return false;
        }
        nb41 nb41Var = (nb41) obj;
        return this.a == nb41Var.a && u890.j(this.b, nb41Var.b) && Float.compare(this.c, nb41Var.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Float.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
