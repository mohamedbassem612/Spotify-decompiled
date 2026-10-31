package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/hz71;", "Lp/uim0;", "Lp/iz71;", "src_main_java_com_spotify_encore_shimmer-shimmer"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final /* data */ class hz71 extends uim0 {
    public final long a;
    public final hw61 b;
    public final int c;
    public final int d;

    public hz71(long j, hw61 hw61Var, int i, int i2) {
        this.a = j;
        this.b = hw61Var;
        this.c = i;
        this.d = i2;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new iz71(this.a, this.b, this.c, this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        boolean z;
        iz71 iz71Var = (iz71) pim0Var;
        hw61 hw61Var = iz71Var.R0;
        long j = this.a;
        hw61 hw61Var2 = this.b;
        if (hw61Var == hw61Var2) {
            long j2 = iz71Var.Q0;
            int i = u7h.l;
            if (z4h1.b(j2, j)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (iz71Var.R0 != hw61Var2) {
            iz71Var.R0 = hw61Var2;
        }
        long j3 = iz71Var.Q0;
        int i2 = u7h.l;
        if (!z4h1.b(j3, j)) {
            iz71Var.Q0 = j;
        }
        int i3 = iz71Var.S0;
        int i4 = this.c;
        if (i3 != i4) {
            iz71Var.S0 = i4;
        }
        int i5 = iz71Var.T0;
        int i6 = this.d;
        if (!jm5.j(i5, i6)) {
            iz71Var.T0 = i6;
        }
        if (z) {
            iz71Var.W0.H1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz71)) {
            return false;
        }
        hz71 hz71Var = (hz71) obj;
        long j = hz71Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b.equals(hz71Var.b) && this.c == hz71Var.c && jm5.j(this.d, hz71Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return jm5.l(this.d) + ab80.k(this.c, (this.b.hashCode() + (z4h1.c(this.a) * 31)) * 31, 31);
    }
}
