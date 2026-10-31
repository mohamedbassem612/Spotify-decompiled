package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class liw0 extends oiw0 {
    public final String a;
    public final String b = "";
    public final boolean c;
    public final boolean d;

    public liw0(String str, boolean z, boolean z2) {
        this.a = str;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liw0)) {
            return false;
        }
        liw0 liw0Var = (liw0) obj;
        return u890.j(this.a, liw0Var.a) && this.b.equals(liw0Var.b) && this.c == liw0Var.c && this.d == liw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
