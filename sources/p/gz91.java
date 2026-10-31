package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gz91 implements iz91 {
    public final fz91 a;
    public final boolean b;
    public final ez91 c;

    public gz91(fz91 fz91Var, boolean z, ez91 ez91Var) {
        this.a = fz91Var;
        this.b = z;
        this.c = ez91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz91)) {
            return false;
        }
        gz91 gz91Var = (gz91) obj;
        return this.a.equals(gz91Var.a) && this.b == gz91Var.b && this.c.equals(gz91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
