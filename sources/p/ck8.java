package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ck8 {
    public final boolean a;
    public final String b;
    public final String c;
    public final bk8 d;

    public ck8(String str, String str2, bk8 bk8Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck8)) {
            return false;
        }
        ck8 ck8Var = (ck8) obj;
        return this.a == ck8Var.a && u890.j(this.b, ck8Var.b) && this.c.equals(ck8Var.c) && this.d == ck8Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
