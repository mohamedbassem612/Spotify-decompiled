package p;

import androidx.compose.ui.graphics.Brush;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/sx9;", "Lp/uim0;", "Lp/ky9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class sx9 extends uim0 {
    public final long a;
    public final Brush b;
    public final float c;
    public final hw61 d;

    public sx9(long j, Brush brush, float f, hw61 hw61Var, int i) {
        if ((i & 1) != 0) {
            int i2 = u7h.l;
            j = nfb.p();
        }
        brush = (i & 2) != 0 ? null : brush;
        this.a = j;
        this.b = brush;
        this.c = f;
        this.d = hw61Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        ky9 ky9Var = new ky9();
        ky9Var.O0 = this.a;
        ky9Var.P0 = this.b;
        ky9Var.Q0 = this.c;
        ky9Var.R0 = this.d;
        ky9Var.S0 = 9205357640488583168L;
        return ky9Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ky9 ky9Var = (ky9) pim0Var;
        ky9Var.O0 = this.a;
        ky9Var.P0 = this.b;
        ky9Var.Q0 = this.c;
        hw61 hw61Var = ky9Var.R0;
        hw61 hw61Var2 = this.d;
        if (!u890.j(hw61Var, hw61Var2)) {
            ky9Var.R0 = hw61Var2;
            nko1.C(ky9Var);
        }
        ha71.x(ky9Var);
    }

    public final boolean equals(Object obj) {
        sx9 sx9Var = obj instanceof sx9 ? (sx9) obj : null;
        if (sx9Var == null) {
            return false;
        }
        long j = sx9Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && u890.j(this.b, sx9Var.b) && this.c == sx9Var.c && u890.j(this.d, sx9Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        int iC = z4h1.c(this.a) * 31;
        Brush brush = this.b;
        return this.d.hashCode() + x0d.f((iC + (brush != null ? brush.hashCode() : 0)) * 31, 31, this.c);
    }
}
