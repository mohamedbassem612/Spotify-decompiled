package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wb11 extends qb11 implements m7a0 {
    public final kf30 a;

    public wb11(kf30 kf30Var) {
        this.a = kf30Var;
    }

    @Override // p.m7a0
    public final cb11 a(kf30 kf30Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb11) {
            return u890.j(this.a, ((wb11) obj).a);
        }
        return false;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return z6x.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wb11.class.getName() + ": " + this.a;
    }
}
