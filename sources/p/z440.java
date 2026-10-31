package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z440 implements a540 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public z440(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z440)) {
            return false;
        }
        z440 z440Var = (z440) obj;
        return u890.j(this.a, z440Var.a) && u890.j(this.b, z440Var.b) && u890.j(this.c, z440Var.c) && u890.j(this.d, z440Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
