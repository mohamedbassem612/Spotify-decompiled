package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/orb0;", "Lp/uim0;", "Lp/rrb0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class orb0 extends uim0 {
    public final srb0 a;
    public final laz b;
    public final boolean c;
    public final qqq0 d;

    public orb0(srb0 srb0Var, laz lazVar, boolean z, qqq0 qqq0Var) {
        this.a = srb0Var;
        this.b = lazVar;
        this.c = z;
        this.d = qqq0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        rrb0 rrb0Var = new rrb0();
        rrb0Var.O0 = this.a;
        rrb0Var.P0 = this.b;
        rrb0Var.Q0 = this.c;
        rrb0Var.R0 = this.d;
        return rrb0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        rrb0 rrb0Var = (rrb0) pim0Var;
        rrb0Var.O0 = this.a;
        rrb0Var.P0 = this.b;
        rrb0Var.Q0 = this.c;
        rrb0Var.R0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orb0)) {
            return false;
        }
        orb0 orb0Var = (orb0) obj;
        return u890.j(this.a, orb0Var.a) && u890.j(this.b, orb0Var.b) && this.c == orb0Var.c && this.d == orb0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
