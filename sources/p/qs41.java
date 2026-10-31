package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/qs41;", "Lp/uim0;", "Lp/rs41;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class qs41 extends uim0 {
    public final ct41 a;
    public final qqq0 b;
    public final boolean c;
    public final boolean d;
    public final iq20 e;
    public final idn0 f;
    public final p5c g;
    public final boolean h;
    public final hxq0 i;

    public qs41(p5c p5cVar, iq20 iq20Var, idn0 idn0Var, qqq0 qqq0Var, hxq0 hxq0Var, ct41 ct41Var, boolean z, boolean z2, boolean z3) {
        this.a = ct41Var;
        this.b = qqq0Var;
        this.c = z;
        this.d = z2;
        this.e = iq20Var;
        this.f = idn0Var;
        this.g = p5cVar;
        this.h = z3;
        this.i = hxq0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        rs41 rs41Var = new rs41();
        rs41Var.Q0 = this.a;
        rs41Var.R0 = this.b;
        rs41Var.S0 = this.c;
        rs41Var.T0 = this.d;
        rs41Var.U0 = this.e;
        rs41Var.V0 = this.f;
        rs41Var.W0 = this.g;
        rs41Var.X0 = this.h;
        rs41Var.Y0 = this.i;
        return rs41Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((rs41) pim0Var).M1(this.g, this.e, this.f, this.b, this.i, this.a, this.h, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qs41.class != obj.getClass()) {
            return false;
        }
        qs41 qs41Var = (qs41) obj;
        return this.a.equals(qs41Var.a) && this.b == qs41Var.b && this.c == qs41Var.c && this.d == qs41Var.d && u890.j(this.e, qs41Var.e) && u890.j(this.f, qs41Var.f) && u890.j(this.g, qs41Var.g) && this.h == qs41Var.h && u890.j(this.i, qs41Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        iq20 iq20Var = this.e;
        int iHashCode = (iG + (iq20Var != null ? iq20Var.hashCode() : 0)) * 31;
        idn0 idn0Var = this.f;
        int iHashCode2 = (iHashCode + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31;
        p5c p5cVar = this.g;
        int iG2 = xcg1.g((iHashCode2 + (p5cVar != null ? p5cVar.hashCode() : 0)) * 31, 31, this.h);
        hxq0 hxq0Var = this.i;
        return iG2 + (hxq0Var != null ? hxq0Var.hashCode() : 0);
    }
}
