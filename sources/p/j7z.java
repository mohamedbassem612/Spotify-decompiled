package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j7z {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final h131 e;
    public final boolean f;

    public j7z(String str, int i, String str2, int i2, h131 h131Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = h131Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7z)) {
            return false;
        }
        j7z j7zVar = (j7z) obj;
        return this.a.equals(j7zVar.a) && this.b == j7zVar.b && u890.j(this.c, j7zVar.c) && this.d == j7zVar.d && this.e.equals(j7zVar.e) && this.f == j7zVar.f;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 961, 31);
        String str = this.c;
        return gqt0.a.hashCode() + xcg1.g((this.e.hashCode() + ab80.k(this.d, (iF + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f);
    }
}
