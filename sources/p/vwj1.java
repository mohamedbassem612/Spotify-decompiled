package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vwj1 implements c0u0, d0u0 {
    public final bpb1 a = gio1.b((Object) null);
    public final bpb1 b = gio1.b(Optional.empty());
    public final bpb1 c = gio1.b((Object) null);
    public y1k1 d;
    public Object e;
    public String f;
    public a7e g;

    @Override // p.c0u0
    public final synchronized void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.c.l(Optional.empty());
        this.a.m((Object) null, z6x.a);
    }

    @Override // p.c0u0
    public final synchronized void M(long j, long j2, koj1 koj1Var) {
        if (this.e != null) {
            return;
        }
        this.c.l(Optional.of(new y1k1(koj1Var.b(), koj1Var.a())));
    }

    public final synchronized void T(Object obj) {
        if (this.e != obj) {
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.c.l(Optional.empty());
        this.a.m((Object) null, z6x.a);
        this.b.m((Object) null, Optional.empty());
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        if (c2p1.t(m0u0Var)) {
            return null;
        }
        return this;
    }

    @Override // p.c0u0
    public final synchronized void v(yhg0 yhg0Var, long j) {
        try {
            if (this.e != null) {
                return;
            }
            this.a.m((Object) null, yhg0Var.b());
            y1k1 y1k1Var = this.d;
            if (y1k1Var == null || !yhg0Var.b().contains(y1k1Var)) {
                this.b.m((Object) null, Optional.empty());
            } else {
                this.b.m((Object) null, Optional.of(y1k1Var));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
