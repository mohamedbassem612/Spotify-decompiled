package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9o {
    public final uqo a;
    public final int b;
    public final lax c;

    public g9o(uqo uqoVar) {
        this(uqoVar, 0, new gax(2131961690, (String) null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9o)) {
            return false;
        }
        g9o g9oVar = (g9o) obj;
        return u890.j(this.a, g9oVar.a) && this.b == g9oVar.b && u890.j(this.c, g9oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public g9o(uqo uqoVar, int i, lax laxVar) {
        this.a = uqoVar;
        this.b = i;
        this.c = laxVar;
    }

    public g9o(uqo uqoVar, f9o f9oVar) {
        this(uqoVar, f9oVar.a, f9oVar.b);
    }
}
