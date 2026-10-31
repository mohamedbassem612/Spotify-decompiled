package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/h5c;", "Lp/uim0;", "Lp/k5c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h5c extends uim0 {
    public final j5c a;

    public h5c(j5c j5cVar) {
        this.a = j5cVar;
    }

    public final pim0 a() {
        return new k5c(this.a);
    }

    public final void b(pim0 pim0Var) {
        k5c k5cVar = (k5c) pim0Var;
        j5c j5cVar = k5cVar.O0;
        if (j5cVar != null) {
            j5cVar.a.k(k5cVar);
        }
        j5c j5cVar2 = this.a;
        if (j5cVar2 != null) {
            j5cVar2.a.b(k5cVar);
        }
        k5cVar.O0 = j5cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h5c) {
            return u890.j(this.a, ((h5c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
