package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l0g0 {
    public final siq a;
    public final Flowable b;
    public final m7p0 c;
    public final boolean d;

    public l0g0(siq siqVar, Flowable flowable, m7p0 m7p0Var, boolean z) {
        this.a = siqVar;
        this.b = flowable;
        this.c = m7p0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0g0)) {
            return false;
        }
        l0g0 l0g0Var = (l0g0) obj;
        return u890.j(this.a, l0g0Var.a) && u890.j(this.b, l0g0Var.b) && u890.j(this.c, l0g0Var.c) && this.d == l0g0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
