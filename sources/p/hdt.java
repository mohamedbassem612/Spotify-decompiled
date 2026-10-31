package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/hdt;", "Lp/uim0;", "Lp/idt;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hdt extends uim0 {
    public final erl1 a;
    public final t8e1 b;

    public hdt(erl1 erl1Var, t8e1 t8e1Var) {
        this.a = erl1Var;
        this.b = t8e1Var;
    }

    public final pim0 a() {
        idt idtVar = new idt();
        idtVar.Q0 = this.a;
        idtVar.R0 = this.b;
        idtVar.S0 = poo1.a;
        return idtVar;
    }

    public final void b(pim0 pim0Var) {
        idt idtVar = (idt) pim0Var;
        erl1 erl1Var = idtVar.Q0;
        erl1 erl1Var2 = this.a;
        boolean zJ = u890.j(erl1Var, erl1Var2);
        t8e1 t8e1Var = this.b;
        if (zJ && t8e1Var == idtVar.R0) {
            return;
        }
        idtVar.Q0 = erl1Var2;
        idtVar.R0 = t8e1Var;
        idtVar.S0 = new wl00(erl1Var2, ((pk80) idtVar).O0);
        dio1.y(idtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdt)) {
            return false;
        }
        hdt hdtVar = (hdt) obj;
        return u890.j(this.a, hdtVar.a) && this.b == hdtVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
