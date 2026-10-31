package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o39 {
    public final String a;
    public final String b;
    public final boolean c;
    public final l651 d;

    public o39(String str, String str2, boolean z, l651 l651Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = l651Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o39)) {
            return false;
        }
        o39 o39Var = (o39) obj;
        return this.a.equals(o39Var.a) && u890.j(this.b, o39Var.b) && this.c == o39Var.c && this.d == o39Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
