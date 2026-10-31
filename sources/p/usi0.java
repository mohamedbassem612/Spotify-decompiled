package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class usi0 extends fuo1 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public usi0(String str, boolean z, String str2, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usi0)) {
            return false;
        }
        usi0 usi0Var = (usi0) obj;
        return u890.j(this.b, usi0Var.b) && this.c == usi0Var.c && this.d == usi0Var.d && u890.j(this.e, usi0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }
}
