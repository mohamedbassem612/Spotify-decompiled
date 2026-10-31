package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/fz20;", "Lp/uim0;", "Lp/jz20;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final /* data */ class fz20 extends uim0 {
    public final hz20 a;

    public fz20(hz20 hz20Var) {
        this.a = hz20Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        jz20 jz20Var = new jz20();
        jz20Var.O0 = this.a;
        return jz20Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((jz20) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz20) && this.a.equals(((fz20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ")";
    }
}
