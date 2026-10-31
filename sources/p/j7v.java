package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/j7v;", "Lp/uim0;", "Lp/i7v;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class j7v extends uim0 {
    public final iu30 a;

    public j7v(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        i7v i7vVar = new i7v();
        i7vVar.O0 = this.a;
        return i7vVar;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((i7v) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j7v) {
            return this.a == ((j7v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
