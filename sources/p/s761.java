package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s761 {
    public final boolean a;
    public final String b;
    public final int c;

    public s761(String str, int i, boolean z) {
        this.a = z;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s761)) {
            return false;
        }
        s761 s761Var = (s761) obj;
        return this.a == s761Var.a && u890.j(this.b, s761Var.b) && this.c == s761Var.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
