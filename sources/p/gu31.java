package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gu31 {
    public final ki90 a;
    public final int b;
    public final String c;

    public gu31(ki90 ki90Var, int i, String str) {
        this.a = ki90Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu31)) {
            return false;
        }
        gu31 gu31Var = (gu31) obj;
        return u890.j(this.a, gu31Var.a) && this.b == gu31Var.b && u890.j(this.c, gu31Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
