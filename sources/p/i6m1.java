package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lp/i6m1;", "Lp/uim0;", "Lp/j6m1;", "p/bpo1", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class i6m1 extends uim0 {
    public final int a;
    public final boolean b;
    public final vu30 c;
    public final Object d;

    public i6m1(int i, boolean z, vu30 vu30Var, Object obj) {
        this.a = i;
        this.b = z;
        this.c = vu30Var;
        this.d = obj;
    }

    @Override // p.uim0
    public final pim0 a() {
        j6m1 j6m1Var = new j6m1();
        j6m1Var.O0 = this.a;
        j6m1Var.P0 = this.b;
        j6m1Var.Q0 = this.c;
        return j6m1Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        j6m1 j6m1Var = (j6m1) pim0Var;
        j6m1Var.O0 = this.a;
        j6m1Var.P0 = this.b;
        j6m1Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i6m1.class != obj.getClass()) {
            return false;
        }
        i6m1 i6m1Var = (i6m1) obj;
        return this.a == i6m1Var.a && this.b == i6m1Var.b && u890.j(this.d, i6m1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
