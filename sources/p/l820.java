package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l820 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public l820(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l820)) {
            return false;
        }
        l820 l820Var = (l820) obj;
        return this.a.equals(l820Var.a) && this.b.equals(l820Var.b) && this.c == l820Var.c && this.d == l820Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
