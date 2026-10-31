package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/yjl;", "Lp/uim0;", "Lp/zjl;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yjl extends uim0 {
    public final iu30 a;

    public yjl(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        zjl zjlVar = new zjl();
        zjlVar.Q0 = this.a;
        return zjlVar;
    }

    public final void b(pim0 pim0Var) {
        zjl zjlVar = (zjl) pim0Var;
        iu30 iu30Var = zjlVar.Q0;
        iu30 iu30Var2 = this.a;
        if (iu30Var2 != iu30Var) {
            zjlVar.Q0 = iu30Var2;
            zjlVar.I1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjl) && ((yjl) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
