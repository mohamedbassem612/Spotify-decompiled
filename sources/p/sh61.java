package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sh61 {
    public final ja61 a;
    public final op9 b;
    public final long c;
    public final float d;
    public final float e;
    public final boolean f;

    public sh61(ja61 ja61Var, op9 op9Var, long j, float f, float f2, boolean z) {
        this.a = ja61Var;
        this.b = op9Var;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh61)) {
            return false;
        }
        sh61 sh61Var = (sh61) obj;
        return u890.j(this.a, sh61Var.a) && u890.j(this.b, sh61Var.b) && this.c == sh61Var.c && Float.compare(this.d, sh61Var.d) == 0 && Float.compare(this.e, sh61Var.e) == 0 && this.f == sh61Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + x0d.f(x0d.f(cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e);
    }
}
