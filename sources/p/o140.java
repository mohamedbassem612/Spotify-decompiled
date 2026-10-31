package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o140 implements q140 {
    public final r140 a;
    public final r140 b;
    public final boolean c;
    public final String d;

    public o140(r140 r140Var, r140 r140Var2, boolean z, String str) {
        this.a = r140Var;
        this.b = r140Var2;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o140)) {
            return false;
        }
        o140 o140Var = (o140) obj;
        return this.a.equals(o140Var.a) && this.b.equals(o140Var.b) && this.c == o140Var.c && this.d.equals(o140Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
