package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/a57;", "Lp/uim0;", "Lp/d57;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class a57 extends uim0 {
    public final float a;
    public final boolean b;

    public a57(float f, boolean z) {
        this.a = f;
        this.b = z;
        if (f > 0.0f) {
            return;
        }
        of80.a("aspectRatio " + f + " must be > 0");
    }

    @Override // p.uim0
    public final pim0 a() {
        d57 d57Var = new d57();
        d57Var.O0 = this.a;
        d57Var.P0 = this.b;
        return d57Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        d57 d57Var = (d57) pim0Var;
        d57Var.O0 = this.a;
        d57Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a57 a57Var = obj instanceof a57 ? (a57) obj : null;
        if (a57Var != null && this.a == a57Var.a) {
            if (this.b == ((a57) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
