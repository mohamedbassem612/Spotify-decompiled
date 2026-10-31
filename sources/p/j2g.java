package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/j2g;", "Lp/uim0;", "Lp/i2g;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j2g extends uim0 {
    public final u1c a;

    public j2g(u1c u1cVar) {
        this.a = u1cVar;
    }

    public final pim0 a() {
        i2g i2gVar = new i2g();
        i2gVar.O0 = this.a;
        return i2gVar;
    }

    public final void b(pim0 pim0Var) {
        i2g i2gVar = (i2g) pim0Var;
        i2gVar.O0 = this.a;
        nko1.C(i2gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j2g) {
            return this.a == ((j2g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
