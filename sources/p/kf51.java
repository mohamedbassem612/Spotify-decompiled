package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kf51 extends zf51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public kf51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf51)) {
            return false;
        }
        kf51 kf51Var = (kf51) obj;
        return u890.j(this.a, kf51Var.a) && u890.j(this.b, kf51Var.b) && u890.j(this.c, kf51Var.c) && u890.j(this.d, kf51Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
