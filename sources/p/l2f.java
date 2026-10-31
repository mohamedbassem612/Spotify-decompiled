package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l2f implements q3f {
    public final String a;
    public final String b;
    public final long c;

    public l2f(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f)) {
            return false;
        }
        l2f l2fVar = (l2f) obj;
        return u890.j(this.a, l2fVar.a) && u890.j(this.b, l2fVar.b) && this.c == l2fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
