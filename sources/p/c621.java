package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c621 {
    public final String a;
    public final iyr0 b;
    public final boolean c;

    public c621(String str, iyr0 iyr0Var, boolean z) {
        this.a = str;
        this.b = iyr0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c621)) {
            return false;
        }
        c621 c621Var = (c621) obj;
        return u890.j(this.a, c621Var.a) && this.b == c621Var.b && this.c == c621Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
