package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r7f implements u7f {
    public final h290 a;
    public final String b;
    public final int c;

    public r7f(int i, String str, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7f)) {
            return false;
        }
        r7f r7fVar = (r7f) obj;
        return this.a.equals(r7fVar.a) && this.b.equals(r7fVar.b) && this.c == r7fVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
