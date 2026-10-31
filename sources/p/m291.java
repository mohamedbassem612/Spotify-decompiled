package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/m291;", "Lp/uim0;", "Lp/p291;", "animation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class m291 extends uim0 {
    public final ni20 a;
    public final gra b;

    public m291(ni20 ni20Var, gra graVar) {
        this.a = ni20Var;
        this.b = graVar;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new p291(this.a, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        p291 p291Var = (p291) pim0Var;
        p291Var.O0 = this.a;
        p291Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m291)) {
            return false;
        }
        m291 m291Var = (m291) obj;
        return u890.j(m291Var.a, this.a) && m291Var.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
