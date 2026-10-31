package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z71 {
    public final String a;
    public final boolean b;
    public final String c;

    public z71(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z71)) {
            return false;
        }
        z71 z71Var = (z71) obj;
        return this.a.equals(z71Var.a) && this.b == z71Var.b && u890.j(this.c, z71Var.c);
    }

    public final int hashCode() {
        int iHashCode = (wxn0.a.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
