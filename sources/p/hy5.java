package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lp/hy5;", "Lp/uim0;", "Lp/y5n;", "Lp/r161;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class hy5 extends uim0 implements r161 {
    public final boolean a;
    public final iu30 b;

    public hy5(iu30 iu30Var, boolean z) {
        this.a = z;
        this.b = iu30Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new y5n(this.a, false, this.b);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        y5n y5nVar = (y5n) pim0Var;
        y5nVar.O0 = this.a;
        y5nVar.Q0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy5)) {
            return false;
        }
        hy5 hy5Var = (hy5) obj;
        return this.a == hy5Var.a && this.b == hy5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // p.r161
    public final o161 r1() {
        o161 o161Var = new o161();
        o161Var.c = this.a;
        this.b.invoke(o161Var);
        return o161Var;
    }
}
