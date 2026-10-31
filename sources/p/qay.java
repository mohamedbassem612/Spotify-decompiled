package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/qay;", "Lp/uim0;", "Lp/aby;", "animation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class qay extends uim0 {
    public final bjg1 a;
    public final zgg1 b;
    public final zgg1 c;
    public final zgg1 d;
    public final bby e;
    public final ln00 f;
    public final ft71 g;
    public final Function0 h;
    public final ray i;

    public qay(bjg1 bjg1Var, zgg1 zgg1Var, zgg1 zgg1Var2, zgg1 zgg1Var3, bby bbyVar, ln00 ln00Var, ft71 ft71Var, Function0 function0, ray rayVar) {
        this.a = bjg1Var;
        this.b = zgg1Var;
        this.c = zgg1Var2;
        this.d = zgg1Var3;
        this.e = bbyVar;
        this.f = ln00Var;
        this.g = ft71Var;
        this.h = function0;
        this.i = rayVar;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new aby(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        aby abyVar = (aby) pim0Var;
        abyVar.O0 = this.a;
        abyVar.P0 = this.b;
        abyVar.Q0 = this.c;
        abyVar.R0 = this.d;
        abyVar.S0 = this.e;
        abyVar.T0 = this.f;
        abyVar.U0 = this.g;
        abyVar.V0 = this.h;
        abyVar.W0 = this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qay)) {
            return false;
        }
        qay qayVar = (qay) obj;
        return qayVar.a == this.a && u890.j(qayVar.b, this.b) && u890.j(qayVar.c, this.c) && u890.j(qayVar.d, this.d) && qayVar.e.equals(this.e) && u890.j(qayVar.f, this.f) && qayVar.g == this.g && qayVar.h == this.h && u890.j(qayVar.i, this.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zgg1 zgg1Var = this.b;
        int iHashCode2 = (iHashCode + (zgg1Var != null ? zgg1Var.hashCode() : 0)) * 31;
        zgg1 zgg1Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (zgg1Var2 != null ? zgg1Var2.hashCode() : 0)) * 31;
        zgg1 zgg1Var3 = this.d;
        return this.g.hashCode() + (this.i.hashCode() * 31) + rjx.n((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode3 + (zgg1Var3 != null ? zgg1Var3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.h);
    }
}
