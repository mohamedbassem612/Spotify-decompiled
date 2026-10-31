package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aqd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public aqd0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd0)) {
            return false;
        }
        aqd0 aqd0Var = (aqd0) obj;
        return u890.j(this.a, aqd0Var.a) && u890.j(this.b, aqd0Var.b) && u890.j(this.c, aqd0Var.c) && u890.j(this.d, aqd0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
