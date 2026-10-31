package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kd31 implements wat {
    public long N0;
    public hw61 O0;
    public boolean P0;
    public int Q0;
    public long R0;
    public rkb0 S0;
    public wat T0;
    public flb0 U0;
    public vc21 V0;
    public ColorFilter W0;
    public float X;
    public int X0;
    public float Y;
    public z1a1 Y0;
    public float Z;
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float t;

    public kd31() {
        long j = he50.a;
        this.h = j;
        this.i = j;
        this.Z = 8.0f;
        int i = ofg1.c;
        this.N0 = wpb1.v();
        this.O0 = d4o1.a;
        this.Q0 = 0;
        this.R0 = 9205357640488583168L;
        rkb0 rkb0Var = rkb0.a;
        this.S0 = fho1.q();
        this.T0 = j2h1.c(1.0f);
        this.U0 = flb0.a;
        this.X0 = 3;
    }

    public final void A(long j) {
        if (ofg1.a(this.N0, j)) {
            return;
        }
        this.a |= 4096;
        this.N0 = j;
    }

    public final void C(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void E(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // p.wat
    public final float U0() {
        return this.T0.U0();
    }

    public final void a() {
        q(1.0f);
        r(1.0f);
        b(1.0f);
        C(0.0f);
        E(0.0f);
        u(0.0f);
        long j = he50.a;
        c(j);
        x(j);
        l(0.0f);
        n(0.0f);
        p(0.0f);
        e(8.0f);
        int i = ofg1.c;
        A(wpb1.v());
        w(d4o1.a);
        f(false);
        k(null);
        g(null);
        d(3);
        i(0);
        rkb0 rkb0Var = rkb0.a;
        rkb0 rkb0VarQ = fho1.q();
        if (!u890.j(this.S0, rkb0VarQ)) {
            this.a |= 1048576;
            this.S0 = rkb0VarQ;
        }
        this.R0 = 9205357640488583168L;
        this.Y0 = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void c(long j) {
        long j2 = this.h;
        int i = u7h.l;
        if (z4h1.b(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void d(int i) {
        if (jm5.j(this.X0, i)) {
            return;
        }
        this.a |= 524288;
        this.X0 = i;
    }

    public final void e(float f) {
        if (this.Z == f) {
            return;
        }
        this.a |= 2048;
        this.Z = f;
    }

    public final void f(boolean z) {
        if (this.P0 != z) {
            this.a |= 16384;
            this.P0 = z;
        }
    }

    public final void g(ColorFilter colorFilter) {
        if (u890.j(this.W0, colorFilter)) {
            return;
        }
        this.a |= 262144;
        this.W0 = colorFilter;
    }

    @Override // p.wat
    public final float h() {
        return this.T0.h();
    }

    public final void i(int i) {
        if (t0c.h(this.Q0, i)) {
            return;
        }
        this.a |= 32768;
        this.Q0 = i;
    }

    public final void k(vc21 vc21Var) {
        if (u890.j(this.V0, vc21Var)) {
            return;
        }
        this.a |= 131072;
        this.V0 = vc21Var;
    }

    public final void l(float f) {
        if (this.t == f) {
            return;
        }
        this.a |= 256;
        this.t = f;
    }

    public final void n(float f) {
        if (this.X == f) {
            return;
        }
        this.a |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        this.X = f;
    }

    public final void p(float f) {
        if (this.Y == f) {
            return;
        }
        this.a |= 1024;
        this.Y = f;
    }

    public final void q(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void r(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void u(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void w(hw61 hw61Var) {
        if (u890.j(this.O0, hw61Var)) {
            return;
        }
        this.a |= 8192;
        this.O0 = hw61Var;
    }

    public final void x(long j) {
        long j2 = this.i;
        int i = u7h.l;
        if (z4h1.b(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }
}
