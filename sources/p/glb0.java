package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/glb0;", "Lp/uim0;", "Lp/ylb0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class glb0 extends uim0 {
    public final xu30 a;

    public glb0(xu30 xu30Var) {
        this.a = xu30Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        ylb0 ylb0Var = new ylb0();
        ylb0Var.O0 = this.a;
        return ylb0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((ylb0) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof glb0) {
            return this.a == ((glb0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
