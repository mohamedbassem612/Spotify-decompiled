package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/s291;", "Lp/uim0;", "Lp/y291;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final class s291 extends uim0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ s291(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // p.uim0
    public final pim0 a() {
        y291 y291Var = new y291();
        y291Var.O0 = this.a;
        y291Var.P0 = this.b;
        y291Var.Q0 = this.c;
        y291Var.R0 = this.d;
        y291Var.S0 = this.e;
        return y291Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        y291 y291Var = (y291) pim0Var;
        y291Var.O0 = this.a;
        y291Var.P0 = this.b;
        y291Var.Q0 = this.c;
        y291Var.R0 = this.d;
        y291Var.S0 = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s291)) {
            return false;
        }
        s291 s291Var = (s291) obj;
        return p3v.c(this.a, s291Var.a) && p3v.c(this.b, s291Var.b) && p3v.c(this.c, s291Var.c) && p3v.c(this.d, s291Var.d) && this.e == s291Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public s291(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
