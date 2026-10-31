package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ska1 implements x3k, Iterable, ola0 {
    public final ze91 a;
    public final int b;
    public final go11 c;

    public ska1(ze91 ze91Var, int i, z340 z340Var, go11 go11Var) {
        this.a = ze91Var;
        this.b = i;
        this.c = go11Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ska1)) {
            return false;
        }
        ska1 ska1Var = (ska1) obj;
        return ska1Var.b == this.b && ska1Var.a == this.a && ska1Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rka1(this.a, this.b, null, this.c);
    }
}
