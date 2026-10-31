package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/o1c;", "Lp/uim0;", "Lp/p1c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class o1c extends uim0 {
    public final tl3 a;
    public final boolean b;

    public o1c(tl3 tl3Var, boolean z) {
        this.a = tl3Var;
        this.b = z;
    }

    @Override // p.uim0
    public final pim0 a() {
        p1c p1cVar = new p1c();
        p1cVar.O0 = this.a;
        p1cVar.P0 = this.b;
        return p1cVar;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        p1c p1cVar = (p1c) pim0Var;
        p1cVar.O0 = this.a;
        p1cVar.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o1c o1cVar = obj instanceof o1c ? (o1c) obj : null;
        return o1cVar != null && u890.j(this.a, o1cVar.a) && this.b == o1cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
