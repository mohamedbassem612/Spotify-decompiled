package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ctb0;", "Lp/uim0;", "Lp/ftb0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class ctb0 extends uim0 {
    public final Function0 a;
    public final ysb0 b;
    public final qqq0 c;
    public final boolean d;
    public final boolean e;

    public ctb0(Function0 function0, ysb0 ysb0Var, qqq0 qqq0Var, boolean z, boolean z2) {
        this.a = function0;
        this.b = ysb0Var;
        this.c = qqq0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new ftb0(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ftb0 ftb0Var = (ftb0) pim0Var;
        ftb0Var.O0 = this.a;
        ftb0Var.P0 = this.b;
        qqq0 qqq0Var = ftb0Var.Q0;
        qqq0 qqq0Var2 = this.c;
        if (qqq0Var != qqq0Var2) {
            ftb0Var.Q0 = qqq0Var2;
            nko1.C(ftb0Var);
        }
        boolean z = ftb0Var.R0;
        boolean z2 = this.d;
        boolean z3 = this.e;
        if (z == z2 && ftb0Var.S0 == z3) {
            return;
        }
        ftb0Var.R0 = z2;
        ftb0Var.S0 = z3;
        ftb0Var.H1();
        nko1.C(ftb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctb0)) {
            return false;
        }
        ctb0 ctb0Var = (ctb0) obj;
        return this.a == ctb0Var.a && u890.j(this.b, ctb0Var.b) && this.c == ctb0Var.c && this.d == ctb0Var.d && this.e == ctb0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
