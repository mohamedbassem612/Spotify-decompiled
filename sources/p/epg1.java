package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/epg1;", "Lp/uim0;", "Lp/fpg1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final /* data */ class epg1 extends uim0 {
    public final tsb0 a;

    public epg1(tsb0 tsb0Var) {
        this.a = tsb0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        fpg1 fpg1Var = new fpg1();
        fpg1Var.O0 = this.a;
        return fpg1Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((fpg1) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epg1) && u890.j(this.a, ((epg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
