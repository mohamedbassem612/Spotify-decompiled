package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i671 {
    public final String a;
    public final String b;
    public final h671 c;
    public final String d;
    public final String e;

    public i671(String str, String str2, h671 h671Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = h671Var;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i671)) {
            return false;
        }
        i671 i671Var = (i671) obj;
        return u890.j(this.a, i671Var.a) && u890.j(this.b, i671Var.b) && this.c.equals(i671Var.c) && u890.j(this.d, i671Var.d) && u890.j(this.e, i671Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 961;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(true) + xcg1.g((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, true);
    }
}
