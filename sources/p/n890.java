package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/n890;", "Lp/uim0;", "Lp/o890;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class n890 extends uim0 {
    public final int a;
    public final boolean b;

    public n890(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // p.uim0
    public final pim0 a() {
        o890 o890Var = new o890();
        o890Var.O0 = this.a;
        o890Var.P0 = this.b;
        return o890Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        o890 o890Var = (o890) pim0Var;
        o890Var.O0 = this.a;
        o890Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n890 n890Var = obj instanceof n890 ? (n890) obj : null;
        return n890Var != null && this.a == n890Var.a && this.b == n890Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
