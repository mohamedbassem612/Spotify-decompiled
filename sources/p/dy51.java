package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dy51 {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public dy51(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy51)) {
            return false;
        }
        dy51 dy51Var = (dy51) obj;
        return this.a.equals(dy51Var.a) && this.b == dy51Var.b && this.c == dy51Var.c && this.d.equals(dy51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
