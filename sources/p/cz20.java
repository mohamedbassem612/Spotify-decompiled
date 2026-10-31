package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/cz20;", "Lp/uim0;", "Lp/d030;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class cz20 extends uim0 {
    public final /* synthetic */ dz20 a;

    public cz20(dz20 dz20Var) {
        this.a = dz20Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return this.a.c;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }
}
