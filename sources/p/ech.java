package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ech;", "Lp/uim0;", "Lp/ich;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class ech extends uim0 {
    public final idn0 a;
    public final ga80 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final pm31 f;
    public final Function0 g;
    public final String h;
    public final Function0 i;
    public final Function0 t;

    public ech(String str, String str2, Function0 function0, Function0 function1, Function0 function2, ga80 ga80Var, idn0 idn0Var, pm31 pm31Var, boolean z, boolean z2) {
        this.a = idn0Var;
        this.b = ga80Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = pm31Var;
        this.g = function0;
        this.h = str2;
        this.i = function1;
        this.t = function2;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new ich(this.h, this.e, this.g, this.i, this.t, this.b, this.a, this.f, this.c, this.d);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        boolean z;
        ich ichVar = (ich) pim0Var;
        ichVar.n1 = true;
        String str = ichVar.k1;
        String str2 = this.h;
        if (!u890.j(str, str2)) {
            ichVar.k1 = str2;
            nko1.C(ichVar);
        }
        boolean z2 = ichVar.l1 == null;
        Function0 function0 = this.i;
        if (z2 != (function0 == null)) {
            ichVar.L1();
            nko1.C(ichVar);
            z = true;
        } else {
            z = false;
        }
        ichVar.l1 = function0;
        boolean z3 = ichVar.m1 == null;
        Function0 function1 = this.t;
        if (z3 != (function1 == null)) {
            z = true;
        }
        ichVar.m1 = function1;
        boolean z4 = ichVar.V0;
        boolean z5 = this.d;
        boolean z6 = z4 != z5 ? true : z;
        ichVar.X1(this.a, this.b, this.c, z5, this.e, this.f, this.g);
        if (z6) {
            ichVar.Y1(false);
            ichVar.Y1(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ech.class != obj.getClass()) {
            return false;
        }
        ech echVar = (ech) obj;
        return u890.j(this.a, echVar.a) && u890.j(this.b, echVar.b) && this.c == echVar.c && this.d == echVar.d && u890.j(this.e, echVar.e) && u890.j(this.f, echVar.f) && this.g == echVar.g && u890.j(this.h, echVar.h) && this.i == echVar.i && this.t == echVar.t;
    }

    public final int hashCode() {
        idn0 idn0Var = this.a;
        int iHashCode = (idn0Var != null ? idn0Var.hashCode() : 0) * 31;
        ga80 ga80Var = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (ga80Var != null ? ga80Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iG + (str != null ? str.hashCode() : 0)) * 31;
        pm31 pm31Var = this.f;
        int iN = rjx.n((iHashCode2 + (pm31Var != null ? Integer.hashCode(pm31Var.a) : 0)) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode3 = (iN + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.i;
        int iHashCode4 = (iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0 function1 = this.t;
        return Boolean.hashCode(true) + ((iHashCode4 + (function1 != null ? function1.hashCode() : 0)) * 31);
    }
}
