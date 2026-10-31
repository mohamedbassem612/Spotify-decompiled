package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.messages.BetamaxPlaybackErrorDevice;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class foa implements c0u0 {
    public final m0u0 a;
    public final t2j0 b;
    public final String c;
    public ev7 d;
    public koj1 e;
    public boolean f;
    public boolean g;
    public float h = -1.0f;
    public boolean i;

    public foa(m0u0 m0u0Var, t2j0 t2j0Var, String str) {
        this.a = m0u0Var;
        this.b = t2j0Var;
        this.c = str;
        String strC = zod.C(m0u0Var);
        this.c = strC != null ? strC : str;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.g = z;
        this.i = z2;
        this.h = f;
    }

    public final void G(float f, long j, long j2) {
        this.h = f;
    }

    public final void K(long j, long j2) {
        this.f = true;
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        a(betamaxException, j);
    }

    public final void M(long j, long j2, koj1 koj1Var) {
        this.e = koj1Var;
    }

    public final void N(ev7 ev7Var, long j, long j2) {
        this.d = ev7Var;
    }

    public final void a(BetamaxException betamaxException, long j) {
        byte b = betamaxException.a.a;
        m0u0 m0u0Var = this.a;
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDeviceI = x9p1.i(m0u0Var, this.c, b, betamaxException);
        ev7 ev7Var = this.d;
        int i = ev7Var != null ? ev7Var.a : 0;
        koj1 koj1Var = this.e;
        int i2 = i + (koj1Var != null ? koj1Var.a : 0);
        if (i2 == 0) {
            i2 = -1;
        }
        eoa builder = betamaxPlaybackErrorDeviceI.toBuilder();
        builder.z(j);
        builder.n(this.g);
        builder.D(this.i);
        builder.r(this.f);
        builder.q(i2);
        builder.B(this.h);
        byte[] bArrA = raa.b.a(zod.D(m0u0Var).toUpperCase(Locale.US));
        builder.A(phc.e(0, bArrA, bArrA.length));
        this.b.a(builder.build());
    }

    public final void d(long j, long j2, boolean z) {
        this.g = z;
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        a(betamaxException, j);
    }

    public final void m(long j, long j2) {
        this.f = false;
    }

    public final void n(long j, long j2, boolean z) {
        this.i = z;
    }
}
