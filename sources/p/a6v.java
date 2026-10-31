package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lp/a6v;", "T", "Lp/uim0;", "Lp/c6v;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a6v<T> extends uim0 {
    public final s24 a;
    public final vu30 b;

    public a6v(s24 s24Var, vu30 vu30Var) {
        this.a = s24Var;
        this.b = vu30Var;
    }

    public final pim0 a() {
        c6v c6vVar = new c6v();
        c6vVar.O0 = this.a;
        c6vVar.P0 = this.b;
        c6vVar.Q0 = qqq0.a;
        return c6vVar;
    }

    public final void b(pim0 pim0Var) {
        c6v c6vVar = (c6v) pim0Var;
        c6vVar.O0 = this.a;
        c6vVar.P0 = this.b;
        c6vVar.Q0 = qqq0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6v)) {
            return false;
        }
        a6v a6vVar = (a6v) obj;
        return u890.j(this.a, a6vVar.a) && this.b == a6vVar.b;
    }

    public final int hashCode() {
        return qqq0.a.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b);
    }
}
