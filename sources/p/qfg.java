package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lp/qfg;", "Lp/uim0;", "Lp/y5n;", "Lp/r161;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class qfg extends uim0 implements r161 {
    public final iu30 a;

    public qfg(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new y5n(false, true, this.a);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        ((y5n) pim0Var).Q0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfg) {
            return this.a == ((qfg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.r161
    public final o161 r1() {
        o161 o161Var = new o161();
        o161Var.c = false;
        o161Var.d = true;
        this.a.invoke(o161Var);
        return o161Var;
    }
}
