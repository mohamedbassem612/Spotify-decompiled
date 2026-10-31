package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/sk80;", "Lp/uim0;", "Lp/uk80;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class sk80 extends uim0 {
    public final erl1 a;

    public sk80(erl1 erl1Var) {
        this.a = erl1Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new uk80(this.a);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        uk80 uk80Var = (uk80) pim0Var;
        erl1 erl1Var = uk80Var.Q0;
        erl1 erl1Var2 = this.a;
        if (u890.j(erl1Var2, erl1Var)) {
            return;
        }
        uk80Var.Q0 = erl1Var2;
        uk80Var.I1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sk80) {
            return u890.j(((sk80) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
