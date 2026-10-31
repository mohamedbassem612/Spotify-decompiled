package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v3l {
    public final z3l a;
    public final boolean b;
    public final boolean c;

    public v3l(z3l z3lVar, boolean z, boolean z2) {
        this.a = z3lVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3l)) {
            return false;
        }
        v3l v3lVar = (v3l) obj;
        return u890.j(this.a, v3lVar.a) && this.b == v3lVar.b && this.c == v3lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
