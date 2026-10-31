package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q5l extends r5l {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public q5l(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5l)) {
            return false;
        }
        q5l q5lVar = (q5l) obj;
        return u890.j(this.a, q5lVar.a) && u890.j(this.b, q5lVar.b) && this.c == q5lVar.c && this.d == q5lVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
