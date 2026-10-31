package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/g3n1;", "Lp/uim0;", "Lp/j3n1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final /* data */ class g3n1 extends uim0 {
    public final float a;

    public g3n1(float f) {
        this.a = f;
    }

    @Override // p.uim0
    public final pim0 a() {
        j3n1 j3n1Var = new j3n1();
        j3n1Var.O0 = this.a;
        return j3n1Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((j3n1) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3n1) && Float.compare(this.a, ((g3n1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("ZIndexElement(zIndex=", this.a, ")");
    }
}
