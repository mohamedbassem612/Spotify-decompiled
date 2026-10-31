package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yk01 {
    public final int a;
    public final c380 b;
    public final boolean c;
    public final String d;
    public final String e;

    public yk01(int i, String str, String str2, c380 c380Var, boolean z) {
        this.a = i;
        this.b = c380Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk01)) {
            return false;
        }
        yk01 yk01Var = (yk01) obj;
        return this.a == yk01Var.a && u890.j(this.b, yk01Var.b) && this.c == yk01Var.c && u890.j(this.d, yk01Var.d) && this.e.equals(yk01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g(kk0.f(this.b, l1d.C(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
