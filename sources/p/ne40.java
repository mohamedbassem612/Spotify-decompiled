package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ne40 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ne40(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne40)) {
            return false;
        }
        ne40 ne40Var = (ne40) obj;
        return this.a.equals(ne40Var.a) && u890.j(this.b, ne40Var.b) && this.c == ne40Var.c && this.d == ne40Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
