package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class unq0 extends hoq0 {
    public final c560 a;
    public final dam b;
    public final String c;

    public unq0(c560 c560Var, dam damVar, String str) {
        this.a = c560Var;
        this.b = damVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unq0)) {
            return false;
        }
        unq0 unq0Var = (unq0) obj;
        return this.a.equals(unq0Var.a) && this.b.equals(unq0Var.b) && this.c.equals(unq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
