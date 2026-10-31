package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z79 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public z79(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z79)) {
            return false;
        }
        z79 z79Var = (z79) obj;
        return u890.j(this.a, z79Var.a) && this.b == z79Var.b && this.c == z79Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ z79(String str) {
        this(str, false, true);
    }
}
