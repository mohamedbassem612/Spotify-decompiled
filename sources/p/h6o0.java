package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/h6o0;", "Lp/uim0;", "Lp/l6o0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class h6o0 extends uim0 {
    public final d6o0 a;
    public final g6o0 b;

    public h6o0(d6o0 d6o0Var, g6o0 g6o0Var) {
        this.a = d6o0Var;
        this.b = g6o0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new l6o0(this.a, this.b);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        l6o0 l6o0Var = (l6o0) pim0Var;
        l6o0Var.O0 = this.a;
        g6o0 g6o0Var = l6o0Var.P0;
        if (g6o0Var.a == l6o0Var) {
            g6o0Var.a = null;
            g6o0Var.d = null;
            g6o0Var.c = oqn1.a;
        }
        g6o0 g6o0Var2 = this.b;
        if (g6o0Var2 == null) {
            g6o0Var = new g6o0();
            l6o0Var.P0 = g6o0Var;
        } else if (g6o0Var2 != g6o0Var) {
            l6o0Var.P0 = g6o0Var2;
            g6o0Var = g6o0Var2;
        }
        if (l6o0Var.N0) {
            g6o0Var.a = l6o0Var;
            g6o0Var.b = null;
            l6o0Var.Q0 = null;
            g6o0Var.c = new g030(l6o0Var, (byte) 21);
            g6o0Var.d = l6o0Var.v1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h6o0)) {
            return false;
        }
        h6o0 h6o0Var = (h6o0) obj;
        return u890.j(h6o0Var.a, this.a) && u890.j(h6o0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g6o0 g6o0Var = this.b;
        return iHashCode + (g6o0Var != null ? g6o0Var.hashCode() : 0);
    }
}
