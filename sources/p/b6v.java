package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lp/b6v;", "T", "Lp/uim0;", "Lp/d6v;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b6v<T> extends uim0 {
    public final t24 a;
    public final vu30 b;

    public b6v(t24 t24Var, vu30 vu30Var) {
        this.a = t24Var;
        this.b = vu30Var;
    }

    public final pim0 a() {
        d6v d6vVar = new d6v();
        d6vVar.O0 = this.a;
        d6vVar.P0 = this.b;
        d6vVar.Q0 = qqq0.b;
        return d6vVar;
    }

    public final void b(pim0 pim0Var) {
        d6v d6vVar = (d6v) pim0Var;
        d6vVar.O0 = this.a;
        d6vVar.P0 = this.b;
        d6vVar.Q0 = qqq0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6v) {
            b6v b6vVar = (b6v) obj;
            if (this.a == b6vVar.a && this.b == b6vVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return qqq0.b.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b);
    }
}
