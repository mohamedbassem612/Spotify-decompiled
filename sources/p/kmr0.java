package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/kmr0;", "Lp/uim0;", "Lp/lmr0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final /* data */ class kmr0 extends uim0 {
    public final jmr0 a;
    public final boolean b;
    public final tl3 c;
    public final j6m d;
    public final float e;
    public final ColorFilter f;

    public kmr0(jmr0 jmr0Var, boolean z, tl3 tl3Var, j6m j6mVar, float f, ColorFilter colorFilter) {
        this.a = jmr0Var;
        this.b = z;
        this.c = tl3Var;
        this.d = j6mVar;
        this.e = f;
        this.f = colorFilter;
    }

    @Override // p.uim0
    public final pim0 a() {
        lmr0 lmr0Var = new lmr0();
        lmr0Var.O0 = this.a;
        lmr0Var.P0 = this.b;
        lmr0Var.Q0 = this.c;
        lmr0Var.R0 = this.d;
        lmr0Var.S0 = this.e;
        lmr0Var.T0 = this.f;
        return lmr0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        lmr0 lmr0Var = (lmr0) pim0Var;
        boolean z = lmr0Var.P0;
        jmr0 jmr0Var = this.a;
        boolean z2 = this.b;
        boolean z3 = z != z2 || (z2 && !Size.c(lmr0Var.O0.i(), jmr0Var.i()));
        lmr0Var.O0 = jmr0Var;
        lmr0Var.P0 = z2;
        lmr0Var.Q0 = this.c;
        lmr0Var.R0 = this.d;
        lmr0Var.S0 = this.e;
        lmr0Var.T0 = this.f;
        if (z3) {
            dio1.y(lmr0Var);
        }
        ha71.x(lmr0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmr0)) {
            return false;
        }
        kmr0 kmr0Var = (kmr0) obj;
        return u890.j(this.a, kmr0Var.a) && this.b == kmr0Var.b && u890.j(this.c, kmr0Var.c) && u890.j(this.d, kmr0Var.d) && Float.compare(this.e, kmr0Var.e) == 0 && u890.j(this.f, kmr0Var.f);
    }

    public final int hashCode() {
        int iF = x0d.f((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        ColorFilter colorFilter = this.f;
        return iF + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ")";
    }
}
