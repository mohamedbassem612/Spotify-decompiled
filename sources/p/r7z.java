package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7z {
    public final cot0 a;
    public final tb2 b;

    public r7z(cot0 cot0Var, tb2 tb2Var) {
        this.a = cot0Var;
        this.b = tb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7z)) {
            return false;
        }
        r7z r7zVar = (r7z) obj;
        return u890.j(this.a, r7zVar.a) && u890.j(this.b, r7zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
