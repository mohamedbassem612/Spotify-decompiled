package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lp/d620;", "Lp/uim0;", "Lp/e620;", "p/rwq0", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class d620 extends uim0 {
    public final int a;
    public final float b;

    public d620(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // p.uim0
    public final pim0 a() {
        e620 e620Var = new e620();
        e620Var.O0 = this.a;
        e620Var.P0 = this.b;
        return e620Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        e620 e620Var = (e620) pim0Var;
        e620Var.O0 = this.a;
        e620Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d620)) {
            return false;
        }
        d620 d620Var = (d620) obj;
        return this.a == d620Var.a && this.b == d620Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
