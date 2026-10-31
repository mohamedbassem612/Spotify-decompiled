package p;

import android.os.BatteryManager;
import android.os.PowerManager;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mna extends roa implements n590 {
    public zhq0 A1;
    public final xe01 B1;
    public boolean C1;
    public llb1 D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public int I1;
    public String J1;
    public String K1;
    public long L1;
    public koe1 M1;
    public long N1;
    public long O1;
    public Long P1;
    public final oot0 p1;
    public final ubu0 q1;
    public final llm r1;
    public final np00 s1;
    public final yqg t1;
    public final BatteryManager u1;
    public final PowerManager v1;
    public final String w1;
    public ina x1;
    public int y1;
    public final String z1;

    public mna(m0u0 m0u0Var, String str, oot0 oot0Var, ubu0 ubu0Var, zwz0 zwz0Var, llm llmVar, np00 np00Var, yqg yqgVar, BatteryManager batteryManager, PowerManager powerManager) {
        super(m0u0Var, oot0Var);
        this.p1 = oot0Var;
        this.q1 = ubu0Var;
        this.r1 = llmVar;
        this.s1 = np00Var;
        this.t1 = yqgVar;
        this.u1 = batteryManager;
        this.v1 = powerManager;
        String strC = zod.C(m0u0Var);
        this.w1 = strC == null ? str : strC;
        this.x1 = new ina(jgc1.UNKNOWN, 0L, false, false, 100.0f, 1.0f, 0, 0, false, false, false, false, 0, 0, "unknown", 1, "", "");
        this.z1 = m0u0Var.a.a;
        this.B1 = d5p1.t(new lt20(zwz0Var.d(), new rf2(3, (lnm) null, (byte) 6), (byte) 0), llmVar, ey71.a, sbl.a);
        this.D1 = new llb1(null, 7);
        this.G1 = true;
        this.I1 = 6;
        this.J1 = "";
        this.K1 = "";
        this.L1 = -1L;
        this.O1 = -1L;
    }

    public static /* synthetic */ void W(mna mnaVar, long j, String str, int i) {
        if ((i & 2) != 0) {
            str = "heartbeat";
        }
        mnaVar.V(j, -1L, str);
    }

    @Override // p.roa
    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        String identifier;
        t2k1 configuration;
        this.H1 = z2;
        ina inaVar = this.x1;
        oot0 oot0Var = this.p1;
        boolean z3 = oot0Var.c;
        int width = videoSurfaceView != null ? videoSurfaceView.getWidth() : 0;
        int height = videoSurfaceView != null ? videoSurfaceView.getHeight() : 0;
        if (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null || (identifier = configuration.getIdentifier()) == null) {
            identifier = "unknown";
        }
        this.x1 = ina.a(inaVar, null, 0L, false, z3, 0.0f, f, 0, 0, z2, z, videoSurfaceView != null && videoSurfaceView.a1, false, width, height, identifier, 0, null, null, 231639);
        this.C1 = false;
        X(j, new gaa(this, (byte) 5));
        if (oot0Var.c) {
            X(j, kna.b);
        }
    }

    public final void D(float f, long j) {
        this.x1 = ina.a(this.x1, null, j, false, false, yoi1.o(f * 100.0f, 0.0f, 100.0f), 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262125);
    }

    @Override // p.roa
    public final void E(y2g1 y2g1Var) {
        if (y2g1Var != null) {
            this.L1 = y2g1Var.a;
        }
    }

    @Override // p.roa
    public final void G(float f, long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262109);
        W(this, j2, null, 6);
    }

    @Override // p.roa
    public final void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        String identifier;
        t2k1 configuration;
        ina inaVar = this.x1;
        int width = videoSurfaceView != null ? videoSurfaceView.getWidth() : 0;
        int height = videoSurfaceView != null ? videoSurfaceView.getHeight() : 0;
        if (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null || (identifier = configuration.getIdentifier()) == null) {
            identifier = "unknown";
        }
        this.x1 = ina.a(inaVar, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, videoSurfaceView != null && videoSurfaceView.a1, false, width, height, identifier, 0, null, null, 232445);
        X(j2, new gaa(new kww0(videoSurfaceView != null ? videoSurfaceView.getWidth() : 0, videoSurfaceView != null ? videoSurfaceView.getHeight() : 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, null, 3, 8188), (byte) 6));
    }

    public final void J(long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, true, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262133);
        U(j);
        X(j2, kna.b);
    }

    @Override // p.roa
    public final void K(long j, long j2) {
        int i;
        ina inaVarA = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262137);
        this.x1 = inaVarA;
        if (this.F1) {
            i = 2;
            if (this.G1) {
                i = (this.H1 || inaVarA.f27p == 2) ? 4 : 3;
            }
        } else {
            i = 1;
        }
        this.I1 = i;
        X(j2, new f13(i, (byte) 1));
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        xjz xjzVar = betamaxException.a;
        String string = xjzVar.toString();
        byte b = xjzVar.a;
        String message = betamaxException.getMessage();
        if (message == null) {
            message = "";
        }
        X(j2, new gaa(new jhz(1, string, b, message), (byte) 4));
    }

    @Override // p.roa
    public final void M(long j, long j2, koj1 koj1Var) {
        ina inaVarA = ina.a(this.x1, null, 0L, false, false, 0.0f, 0.0f, koj1Var.a, 0, false, false, false, false, 0, 0, null, 0, null, null, 262079);
        this.x1 = inaVarA;
        int i = koj1Var.a;
        int i2 = koj1Var.b;
        int i3 = koj1Var.c;
        int i4 = koj1Var.d;
        int i5 = inaVarA.m;
        int i6 = inaVarA.n;
        String str = koj1Var.f;
        if (str == null) {
            str = "";
        }
        X(j2, new gaa(new kww0(i5, i6, i3, i4, 0, 0, i, i2, null, str, (int) koj1Var.e, this.K1, this.J1, 2, 304), (byte) 6));
    }

    @Override // p.roa
    public final void N(ev7 ev7Var, long j, long j2) {
        this.x1 = ina.a(this.x1, null, 0L, false, false, 0.0f, 0.0f, 0, ev7Var.a, false, false, false, false, 0, 0, null, 0, null, null, 262015);
        int i = ev7Var.a;
        int i2 = ev7Var.b;
        String str = ev7Var.c;
        if (str == null) {
            str = "";
        }
        X(j2, new gaa(new kww0(0, 0, 0, 0, i, i2, 0, 0, str, null, 0, this.K1, this.J1, 1, 1743), (byte) 6));
    }

    @Override // p.roa
    public final void O(long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262133);
        koe1 koe1Var = this.M1;
        if (koe1Var != null) {
            this.s1.c(koe1Var);
            this.M1 = null;
        }
        this.O1 = -1L;
        X(j2, o40.e1);
    }

    @Override // p.roa
    public final void R(r4t r4tVar, int i, long j, long j2) {
        String str;
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262133);
        koe1 koe1Var = this.M1;
        if (koe1Var != null) {
            this.s1.c(koe1Var);
            this.M1 = null;
        }
        this.O1 = -1L;
        int iC = l1d.C(i);
        if (iC == 0) {
            str = "played_to_end";
        } else if (iC == 1) {
            str = "end_requested";
        } else if (iC == 2) {
            str = "error";
        } else if (iC == 3) {
            str = "error_network";
        } else if (iC == 4) {
            str = "error_other";
        } else {
            if (iC != 5) {
                eg.o();
                return;
            }
            str = "player_released";
        }
        W(this, j2, str, 4);
    }

    @Override // p.roa
    public final void S(long j, long j2) {
        this.F1 = true;
        this.x1 = ina.a(this.x1, null, j, true, true, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262129);
        U(j);
        V(j2, this.L1, "playback_started");
    }

    public final void U(long j) {
        long j2 = this.O1;
        if (j2 == -1 || Math.abs(j - j2) >= 1000) {
            koe1 koe1Var = this.M1;
            np00 np00Var = this.s1;
            if (koe1Var != null) {
                np00Var.c(koe1Var);
            }
            long[] jArrM1 = o7h.m1(z561.k0(new rlu(z561.c0(yda.T0, Long.valueOf(5000 + j)), new tla(this, (byte) 2), (byte) 2)));
            if (jArrM1.length == 0) {
                this.M1 = null;
            } else {
                this.O1 = j;
                this.M1 = np00Var.b(jArrM1, false, new ps7(this, (byte) 7));
            }
        }
    }

    public final void V(long j, long j2, String str) {
        long j3 = this.x1.b;
        Long l = this.P1;
        loj1 loj1Var = null;
        Long lValueOf = l != null ? Long.valueOf(j3 - l.longValue()) : null;
        this.P1 = Long.valueOf(j3);
        zhq0 zhq0Var = this.A1;
        if (zhq0Var != null) {
            AtomicReference atomicReference = (AtomicReference) zhq0Var.b;
            loj1Var = (loj1) atomicReference.get();
            ((wao0) zhq0Var.c).invoke(new fgs0(atomicReference, (byte) 27));
            loj1Var.getClass();
        }
        ina inaVar = this.x1;
        X(j, new jna(str, j2, lValueOf, loj1Var, inaVar.q, inaVar.r));
    }

    public final void X(long j, xu30 xu30Var) {
        char c;
        String str;
        String str2;
        String str3;
        m0u0 m0u0Var = this.a;
        i3i0 i3i0Var = new i3i0(this.z1, this.w1, zod.D(m0u0Var), m0u0Var.d, pze0.c(this.x1.f27p));
        twz0 twz0Var = (uwz0) this.B1.a.getValue();
        if (twz0Var instanceof swz0) {
            c = 1;
        } else {
            if (!(twz0Var instanceof twz0)) {
                eg.o();
                return;
            }
            w7x w7xVar = twz0Var.a;
            if (w7xVar == null) {
                w7xVar = w7x.a;
            }
            c = w7xVar.contains(a7o0.b) ? (char) 3 : (char) 2;
        }
        ina inaVar = this.x1;
        Long l = this.e1;
        long jLongValue = l != null ? l.longValue() : 0L;
        boolean z = inaVar.c && inaVar.d;
        long j2 = inaVar.b;
        hpc1 hpc1Var = this.O0;
        if (hpc1Var == null || (str = hpc1Var.h) == null) {
            str = "";
        }
        String str4 = str;
        float f = inaVar.f;
        float f2 = inaVar.l ? 0.0f : inaVar.e;
        String str5 = inaVar.a.a;
        int i = inaVar.g + inaVar.h;
        boolean z2 = inaVar.i || inaVar.f27p == 2;
        if (inaVar.j) {
            str2 = "backgrounded";
        } else {
            str2 = inaVar.k ? "fullscreen" : inaVar.o;
        }
        String str6 = str2;
        if (c == 1) {
            str3 = "no connection";
        } else if (c == 2) {
            str3 = "wifi";
        } else {
            if (c != 3) {
                throw null;
            }
            str3 = "cell";
        }
        if ((16255 & 128) != 0) {
            str3 = "unknown";
        }
        xcu0 xcu0Var = new xcu0("EXOPLAYER", jLongValue, z, j2, str4, f, f2, str3, str5, i, z2, str6, (16255 & 4096) != 0 ? -1 : 0, false);
        int i2 = this.y1;
        this.y1 = i2 + 1;
        fn31.T(this.r1, (o8n) null, 0, new df6((byte) 1, (Object) xcu0Var, (Object) this, (Object) xu30Var, (Object) i3i0Var, (Object) new n900(i2, j), (lnm) null), 3);
    }

    public final void c(String str) {
        this.x1 = ina.a(this.x1, null, 0L, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, str, null, 196607);
    }

    @Override // p.roa
    public final void d(long j, long j2, boolean z) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, z, false, false, 0, 0, null, 0, null, null, 261629);
        W(this, j2, null, 6);
    }

    public final void e(String str) {
        this.x1 = ina.a(this.x1, null, 0L, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, str, 131071);
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        xjz xjzVar = betamaxException.a;
        String string = xjzVar.toString();
        byte b = xjzVar.a;
        String message = betamaxException.getMessage();
        if (message == null) {
            message = "";
        }
        X(j2, new gaa(new jhz(2, string, b, message), (byte) 4));
    }

    @Override // p.roa
    public final void j(int i, jgc1 jgc1Var, long j) {
        this.x1 = ina.a(this.x1, jgc1Var, 0L, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, i, null, null, 229374);
    }

    @Override // p.roa
    public final void k(long j, long j2) {
        super.k(j, j2);
        this.N1 = j;
        ina inaVar = this.x1;
        if (inaVar.d) {
            U(inaVar.b);
        }
    }

    @Override // p.roa
    public final void l(long j, long j2, long j3, boolean z) {
        this.G1 = true;
        this.x1 = ina.a(this.x1, null, j2, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        this.P1 = Long.valueOf(j2);
        if (this.x1.d) {
            U(j2);
        }
        X(j3, new lna((byte) 0, j, j2));
    }

    @Override // p.roa
    public final void m(long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, true, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262137);
        if (!this.C1) {
            this.C1 = true;
            X(j2, new gaa(this.D1.a, (byte) 3));
        }
        int i = this.I1;
        llb1 llb1Var = this.D1;
        if (i != 1 || this.E1) {
            llb1Var = null;
        }
        if (llb1Var != null) {
            this.E1 = true;
        }
        X(j2, new ut1(i, llb1Var, (byte) 1));
        this.I1 = 6;
        this.G1 = true;
    }

    @Override // p.roa
    public final void n(long j, long j2, boolean z) {
        this.H1 = z;
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, z, false, false, false, 0, 0, null, 0, null, null, 261885);
        W(this, j2, null, 6);
    }

    @Override // p.roa
    public final void o(int i, long j, long j2) {
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, i != 1, 0, 0, null, 0, null, null, 260093);
        W(this, j2, null, 6);
    }

    @Override // p.roa
    public final void p(long j, long j2, long j3, boolean z) {
        this.G1 = false;
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        X(j3, new lna((byte) 1, j, j2));
    }

    @Override // p.roa
    public final void r(hpc1 hpc1Var, long j, long j2) {
        super.r(hpc1Var, j, j2);
        this.x1 = ina.a(this.x1, null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, null, 0, null, null, 262141);
        W(this, j2, null, 6);
    }

    @Override // p.roa
    public final void v(yhg0 yhg0Var, long j) {
        String strValueOf;
        String strValueOf2;
        Long l = yhg0Var.f;
        String str = "null";
        if (l == null || (strValueOf = String.valueOf(l.longValue())) == null) {
            strValueOf = "null";
        }
        this.J1 = strValueOf;
        Long l2 = yhg0Var.g;
        if (l2 != null && (strValueOf2 = String.valueOf(l2.longValue())) != null) {
            str = strValueOf2;
        }
        this.K1 = str;
        if (this.C1) {
            return;
        }
        this.C1 = true;
        X(j, new gaa(this.D1.a, (byte) 3));
    }

    @Override // p.n590
    public final void w(llb1 llb1Var) {
        this.D1 = llb1Var;
    }

    @Override // p.n590
    public final void x(zhq0 zhq0Var) {
        this.A1 = zhq0Var;
    }
}
