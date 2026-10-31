package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o5o0 {
    public final String a;
    public final String b;
    public final n5o0 c;

    public o5o0(String str, String str2, n5o0 n5o0Var) {
        this.a = str;
        this.b = str2;
        this.c = n5o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5o0)) {
            return false;
        }
        o5o0 o5o0Var = (o5o0) obj;
        return u890.j(this.a, o5o0Var.a) && u890.j(this.b, o5o0Var.b) && this.c == o5o0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n5o0 n5o0Var = this.c;
        return iHashCode2 + (n5o0Var != null ? n5o0Var.hashCode() : 0);
    }
}
