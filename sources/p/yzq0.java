package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/yzq0;", "Lp/uim0;", "Lp/c0r0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class yzq0 extends uim0 {
    public final vzq0 a;

    public yzq0(vzq0 vzq0Var) {
        this.a = vzq0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        c0r0 c0r0Var = new c0r0();
        c0r0Var.O0 = this.a;
        return c0r0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((c0r0) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        yzq0 yzq0Var = obj instanceof yzq0 ? (yzq0) obj : null;
        if (yzq0Var == null) {
            return false;
        }
        return u890.j(this.a, yzq0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
