package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class af91 implements x3k, Iterable, ola0 {
    public final ze91 a;
    public final int b;
    public final int c;

    public af91(ze91 ze91Var, int i, int i2) {
        this.a = ze91Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof af91)) {
            return false;
        }
        af91 af91Var = (af91) obj;
        return af91Var.b == this.b && af91Var.c == this.c && af91Var.a == this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ze91 ze91Var = this.a;
        if (ze91Var.h != this.c) {
            bf91.e();
        }
        int i = this.b;
        ze91Var.l(i);
        return new lm50(ze91Var, i + 1, ze91Var.a[(i * 5) + 3] + i);
    }
}
