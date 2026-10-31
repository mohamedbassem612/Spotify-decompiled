package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/wd4;", "Lp/uim0;", "Lp/d4v;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class wd4 extends uim0 {
    public final /* synthetic */ xd4 a;

    public wd4(xd4 xd4Var) {
        this.a = xd4Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return this.a.a;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
