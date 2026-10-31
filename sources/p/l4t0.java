package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l4t0 implements n4t0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public l4t0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4t0)) {
            return false;
        }
        l4t0 l4t0Var = (l4t0) obj;
        return this.a.equals(l4t0Var.a) && this.b.equals(l4t0Var.b) && this.c.equals(l4t0Var.c) && this.d.equals(l4t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
