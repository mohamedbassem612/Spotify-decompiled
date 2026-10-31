package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/l5q0;", "Lp/uim0;", "Lp/m5q0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class l5q0 extends uim0 {
    public final iu30 a;

    public l5q0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        m5q0 m5q0Var = new m5q0();
        m5q0Var.O0 = (byte) 64;
        m5q0Var.P0 = this.a;
        return m5q0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        m5q0 m5q0Var = (m5q0) pim0Var;
        m5q0Var.getClass();
        m5q0Var.O0 = (byte) 64;
        m5q0Var.P0 = this.a;
        bhe1 bhe1Var = m5q0Var.Q0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        m5q0Var.Q0 = grn1.t(m5q0Var, 0L, m5q0Var.O0, m5q0Var.P0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5q0) && this.a == ((l5q0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + cy30.f(Long.hashCode(0L) * 31, 64L, 31);
    }
}
