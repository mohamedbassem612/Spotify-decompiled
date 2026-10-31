package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lp/za5;", "S", "Lp/uim0;", "Lp/cb5;", "animation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class za5<S> extends uim0 {
    public final zgg1 a;
    public final ven0 b;
    public final eb5 c;

    public za5(zgg1 zgg1Var, ven0 ven0Var, eb5 eb5Var) {
        this.a = zgg1Var;
        this.b = ven0Var;
        this.c = eb5Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new cb5(this.a, this.b, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        cb5 cb5Var = (cb5) pim0Var;
        cb5Var.O0 = this.a;
        cb5Var.P0 = this.b;
        cb5Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof za5)) {
            return false;
        }
        za5 za5Var = (za5) obj;
        return u890.j(za5Var.a, this.a) && za5Var.b.equals(this.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        zgg1 zgg1Var = this.a;
        return this.b.hashCode() + ((iHashCode + (zgg1Var != null ? zgg1Var.hashCode() : 0)) * 31);
    }
}
