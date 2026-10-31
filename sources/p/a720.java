package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a720 {
    public final boolean a;
    public final c380 b;
    public final c380 c;

    public a720(boolean z, c380 c380Var, c380 c380Var2) {
        this.a = z;
        this.b = c380Var;
        this.c = c380Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a720)) {
            return false;
        }
        a720 a720Var = (a720) obj;
        return this.a == a720Var.a && u890.j(this.b, a720Var.b) && u890.j(this.c, a720Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
