package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y73 {
    public final kby a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public y73(kby kbyVar, String str, String str2, boolean z, String str3) {
        this.a = kbyVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y73)) {
            return false;
        }
        y73 y73Var = (y73) obj;
        return u890.j(this.a, y73Var.a) && this.b.equals(y73Var.b) && this.c.equals(y73Var.c) && this.d == y73Var.d && u890.j(this.e, y73Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
