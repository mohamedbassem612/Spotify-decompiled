package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/e5c;", "Lp/uim0;", "Lp/g5c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class e5c extends uim0 {
    public final f75 a;

    public e5c(f75 f75Var) {
        this.a = f75Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new g5c(this.a);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        g5c g5cVar = (g5c) pim0Var;
        f75 f75Var = this.a;
        g5cVar.O0 = f75Var;
        if (g5cVar.N0) {
            f75Var.invoke(g5cVar.P0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e5c) {
            return this.a == ((e5c) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
