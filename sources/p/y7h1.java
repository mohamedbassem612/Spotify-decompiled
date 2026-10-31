package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y7h1 {
    public final String a;
    public final String b;
    public final z6h1 c;
    public final z7h1 d;
    public final x7h1 e;

    public y7h1(String str, String str2, z6h1 z6h1Var, z7h1 z7h1Var, x7h1 x7h1Var) {
        this.a = str;
        this.b = str2;
        this.c = z6h1Var;
        this.d = z7h1Var;
        this.e = x7h1Var;
    }

    public final x7h1 a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final z7h1 c() {
        return this.d;
    }

    public final z6h1 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7h1)) {
            return false;
        }
        y7h1 y7h1Var = (y7h1) obj;
        return this.a.equals(y7h1Var.a) && this.b.equals(y7h1Var.b) && this.c.equals(y7h1Var.c) && this.d.equals(y7h1Var.d) && this.e.equals(y7h1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventIdentity(interface=" + this.a + ", actor=" + this.b + ", path=" + this.c + ", interactionType=" + this.d + ", action=" + this.e + ')';
    }
}
