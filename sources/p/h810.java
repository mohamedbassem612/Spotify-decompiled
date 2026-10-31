package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h810 {
    public final boolean a;
    public final o571 b;
    public final String c;
    public final boolean d;

    public h810(boolean z, o571 o571Var, String str, boolean z2) {
        this.a = z;
        this.b = o571Var;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h810)) {
            return false;
        }
        h810 h810Var = (h810) obj;
        return this.a == h810Var.a && u890.j(this.b, h810Var.b) && u890.j(this.c, h810Var.c) && this.d == h810Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        o571 o571Var = this.b;
        int iHashCode2 = (iHashCode + (o571Var == null ? 0 : o571Var.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
