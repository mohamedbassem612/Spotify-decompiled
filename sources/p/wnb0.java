package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/wnb0;", "Lp/uim0;", "Lp/xnb0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class wnb0 extends uim0 {
    public final float a;
    public final boolean b;

    public wnb0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // p.uim0
    public final pim0 a() {
        xnb0 xnb0Var = new xnb0();
        xnb0Var.O0 = this.a;
        xnb0Var.P0 = this.b;
        return xnb0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        xnb0 xnb0Var = (xnb0) pim0Var;
        xnb0Var.O0 = this.a;
        xnb0Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wnb0 wnb0Var = obj instanceof wnb0 ? (wnb0) obj : null;
        return wnb0Var != null && this.a == wnb0Var.a && this.b == wnb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
