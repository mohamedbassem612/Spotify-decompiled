package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c2o0 {
    public final int a;
    public final String b;
    public final c380 c;
    public final String d;

    public c2o0(int i, String str, String str2, c380 c380Var) {
        this.a = i;
        this.b = str;
        this.c = c380Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2o0)) {
            return false;
        }
        c2o0 c2o0Var = (c2o0) obj;
        return this.a == c2o0Var.a && u890.j(this.b, c2o0Var.b) && u890.j(this.c, c2o0Var.c) && u890.j(this.d, c2o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
