package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/gpa0;", "Lp/uim0;", "Lp/ipa0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class gpa0 extends uim0 {
    public final iu30 a;
    public final iu30 b;

    public gpa0(iu30 iu30Var, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = iu30Var2;
    }

    @Override // p.uim0
    public final pim0 a() {
        ipa0 ipa0Var = new ipa0();
        ipa0Var.O0 = this.a;
        ipa0Var.P0 = this.b;
        return ipa0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ipa0 ipa0Var = (ipa0) pim0Var;
        ipa0Var.O0 = this.a;
        ipa0Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpa0)) {
            return false;
        }
        gpa0 gpa0Var = (gpa0) obj;
        return this.a == gpa0Var.a && this.b == gpa0Var.b;
    }

    public final int hashCode() {
        iu30 iu30Var = this.a;
        int iHashCode = (iu30Var != null ? iu30Var.hashCode() : 0) * 31;
        iu30 iu30Var2 = this.b;
        return iHashCode + (iu30Var2 != null ? iu30Var2.hashCode() : 0);
    }
}
