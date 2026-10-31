package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ug7 {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;
    public final String f;

    public ug7(int i, long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = z;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug7)) {
            return false;
        }
        ug7 ug7Var = (ug7) obj;
        return this.a.equals(ug7Var.a) && this.b == ug7Var.b && this.c == ug7Var.c && this.d == ug7Var.d && this.e == ug7Var.e && this.f.equals(ug7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(kaa0.f(this.d, cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31, this.e);
    }
}
