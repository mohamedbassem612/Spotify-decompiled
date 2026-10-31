package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o4o {
    public final String a;
    public final String b;
    public final tr80 c;
    public final boolean d;

    public o4o(String str, String str2, tr80 tr80Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = tr80Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4o)) {
            return false;
        }
        o4o o4oVar = (o4o) obj;
        return u890.j(this.a, o4oVar.a) && u890.j(this.b, o4oVar.b) && u890.j(this.c, o4oVar.c) && this.d == o4oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + lf51.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
