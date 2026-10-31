package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s5c {
    public final boolean a;
    public final l0l b;
    public final boolean c;
    public final boolean d;

    public s5c(boolean z, l0l l0lVar, boolean z2, boolean z3) {
        this.a = z;
        this.b = l0lVar;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5c)) {
            return false;
        }
        s5c s5cVar = (s5c) obj;
        return this.a == s5cVar.a && u890.j(this.b, s5cVar.b) && this.c == s5cVar.c && this.d == s5cVar.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        l0l l0lVar = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (l0lVar == null ? 0 : l0lVar.hashCode())) * 31, 31, this.c);
    }
}
