package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gx6 {
    public final String a;
    public final String b;
    public final boolean c;

    public gx6(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx6)) {
            return false;
        }
        gx6 gx6Var = (gx6) obj;
        return u890.j(this.a, gx6Var.a) && u890.j(this.b, gx6Var.b) && this.c == gx6Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
