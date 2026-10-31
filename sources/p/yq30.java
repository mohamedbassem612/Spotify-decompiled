package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yq30 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public yq30(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq30)) {
            return false;
        }
        yq30 yq30Var = (yq30) obj;
        return u890.j(this.a, yq30Var.a) && u890.j(this.b, yq30Var.b) && this.c == yq30Var.c && this.d.equals(yq30Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
