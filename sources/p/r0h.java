package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r0h {
    public final e1h a;
    public final ou80 b;
    public final boolean c;

    public r0h(e1h e1hVar, ou80 ou80Var, boolean z) {
        this.a = e1hVar;
        this.b = ou80Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0h)) {
            return false;
        }
        r0h r0hVar = (r0h) obj;
        return this.a.equals(r0hVar.a) && u890.j(this.b, r0hVar.b) && this.c == r0hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }
}
