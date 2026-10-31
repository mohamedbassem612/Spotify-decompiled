package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kod extends b7 implements wod {
    public final oma0 b;
    public final lod c;
    public final boolean d;

    public kod(oma0 oma0Var, lod lodVar, boolean z) {
        super(jod.a);
        this.b = oma0Var;
        this.c = lodVar;
        this.d = z;
    }

    public final b7 A(boolean z) {
        return z == this.d ? this : new kod(this.b, this.c, z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kod)) {
            return false;
        }
        kod kodVar = (kod) obj;
        return u890.j(this.b, kodVar.b) && this.c == kodVar.c && this.d == kodVar.d;
    }

    public final List getAnnotations() {
        return z6x.a;
    }

    public final int hashCode() {
        oma0 oma0Var = this.b;
        int iHashCode = oma0Var != null ? oma0Var.hashCode() : 0;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (iHashCode * 31)) * 31);
    }

    public final boolean i() {
        return this.d;
    }

    public final jla0 k() {
        return null;
    }

    public final String toString() {
        return this.c.toString();
    }

    public final List v() {
        return z6x.a;
    }
}
