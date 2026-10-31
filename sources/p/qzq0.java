package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/qzq0;", "Lp/uim0;", "Lp/szq0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class qzq0 extends uim0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qzq0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            of80.a("Padding must be non-negative");
        }
    }

    @Override // p.uim0
    public final pim0 a() {
        szq0 szq0Var = new szq0();
        szq0Var.O0 = this.a;
        szq0Var.P0 = this.b;
        szq0Var.Q0 = this.c;
        szq0Var.R0 = this.d;
        szq0Var.S0 = true;
        return szq0Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        szq0 szq0Var = (szq0) pim0Var;
        szq0Var.O0 = this.a;
        szq0Var.P0 = this.b;
        szq0Var.Q0 = this.c;
        szq0Var.R0 = this.d;
        szq0Var.S0 = true;
    }

    public final boolean equals(Object obj) {
        qzq0 qzq0Var = obj instanceof qzq0 ? (qzq0) obj : null;
        return qzq0Var != null && p3v.c(this.a, qzq0Var.a) && p3v.c(this.b, qzq0Var.b) && p3v.c(this.c, qzq0Var.c) && p3v.c(this.d, qzq0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
