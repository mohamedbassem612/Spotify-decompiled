package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/dhg;", "Lp/uim0;", "Lp/ihg;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class dhg extends uim0 {
    public final idn0 a;
    public final ga80 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final pm31 f;
    public final Function0 g;

    public dhg(idn0 idn0Var, ga80 ga80Var, boolean z, boolean z2, String str, pm31 pm31Var, Function0 function0) {
        this.a = idn0Var;
        this.b = ga80Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = pm31Var;
        this.g = function0;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new ihg(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((ihg) pim0Var).X1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dhg.class != obj.getClass()) {
            return false;
        }
        dhg dhgVar = (dhg) obj;
        return u890.j(this.a, dhgVar.a) && u890.j(this.b, dhgVar.b) && this.c == dhgVar.c && this.d == dhgVar.d && u890.j(this.e, dhgVar.e) && u890.j(this.f, dhgVar.f) && this.g == dhgVar.g;
    }

    public final int hashCode() {
        idn0 idn0Var = this.a;
        int iHashCode = (idn0Var != null ? idn0Var.hashCode() : 0) * 31;
        ga80 ga80Var = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (ga80Var != null ? ga80Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iG + (str != null ? str.hashCode() : 0)) * 31;
        pm31 pm31Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (pm31Var != null ? Integer.hashCode(pm31Var.a) : 0)) * 31);
    }
}
