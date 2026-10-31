package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l4h {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final cuu0 e;

    public l4h(String str, String str2, String str3, int i, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = cuu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4h)) {
            return false;
        }
        l4h l4hVar = (l4h) obj;
        return this.a.equals(l4hVar.a) && u890.j(this.b, l4hVar.b) && this.c.equals(l4hVar.c) && this.d == l4hVar.d && this.e.equals(l4hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
