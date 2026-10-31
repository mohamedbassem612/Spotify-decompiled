package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r3u0 implements c0u0 {
    public kj41 a;
    public nif1 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final LinkedHashSet f;
    public final String g;
    public final String h;

    public r3u0(String str, oot0 oot0Var, m0u0 m0u0Var) {
        hhp0 hhp0Var = hhp0.a;
        this.d = oot0Var.c;
        this.f = new LinkedHashSet();
        String strC = zod.C(m0u0Var);
        this.g = strC != null ? strC : str;
        this.h = zod.D(m0u0Var);
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        if (z) {
            return;
        }
        Set set = t3u0.a;
        String str = this.g;
        if (set.contains(str)) {
            hhp0 hhp0Var = hhp0.a;
            kj41 kj41VarU = hhp0Var.u("ux.playback.session");
            this.a = kj41VarU;
            if (kj41VarU != null) {
                kj41VarU.setAttribute("feature_identifier", str);
            }
            kj41 kj41Var = this.a;
            if (kj41Var != null) {
                kj41Var.setAttribute("playback.id", this.h);
            }
            this.b = ihp0.l(hhp0Var, "ux.playback.session", Integer.valueOf(hashCode()), 4);
            q("ux.playback.session");
        }
    }

    public final void C(int i, long j) {
        a("encryption_key_loading");
    }

    public final void F(long j) {
        q("encryption_key_loading");
    }

    public final void J(long j, long j2) {
        this.d = true;
    }

    public final void K(long j, long j2) {
        q(this.e ? "rebuffering" : "initial_buffering");
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        this.c = true;
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        String str;
        kj41 kj41Var = this.a;
        if (kj41Var != null) {
            switch (i) {
                case 1:
                    str = "PLAYED_TO_END";
                    break;
                case 2:
                    str = "END_REQUESTED";
                    break;
                case 3:
                    str = "FATAL_ERROR";
                    break;
                case 4:
                    str = "RECOVERABLE_ERROR_NETWORK";
                    break;
                case 5:
                    str = "RECOVERABLE_ERROR_OTHER";
                    break;
                case 6:
                    str = "PLAYER_RELEASED";
                    break;
                default:
                    throw null;
            }
            kj41Var.c(sqg0.J(new mmr0[]{new mmr0("reason_end", str), new mmr0("did_error", String.valueOf(this.c)), new mmr0("did_attempt_to_play", String.valueOf(this.d))}));
        }
        LinkedHashSet<String> linkedHashSet = this.f;
        for (String str2 : linkedHashSet) {
            nif1 nif1Var = this.b;
            if (nif1Var != null) {
                nif1Var.e(str2);
            }
        }
        linkedHashSet.clear();
        nif1 nif1Var2 = this.b;
        if (nif1Var2 != null) {
            nif1Var2.stop();
        }
        this.b = null;
        kj41 kj41Var2 = this.a;
        if (kj41Var2 != null) {
            kj41Var2.stop();
        }
        this.a = null;
    }

    public final void S(long j, long j2) {
        q("playback_active");
    }

    public final void a(String str) {
        nif1 nif1Var;
        if (!this.f.remove(str) || (nif1Var = this.b) == null) {
            return;
        }
        nif1Var.e(str);
    }

    public final void b(long j) {
        q("manifest_loading");
    }

    public final void f() {
        a("video_joining");
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        this.c = true;
    }

    public final void j(int i, jgc1 jgc1Var, long j) {
        String str;
        kj41 kj41Var = this.a;
        if (kj41Var != null) {
            if (i == 1) {
                str = "UNKNOWN";
            } else if (i == 2) {
                str = "AUDIO";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "VIDEO";
            }
            kj41Var.c(sqg0.J(new mmr0[]{new mmr0("media_type", str), new mmr0("streaming_type", jgc1Var.name())}));
        }
    }

    public final void l(long j, long j2, long j3, boolean z) {
        if (z) {
            a("seeking");
        }
    }

    public final void m(long j, long j2) {
        if (this.e) {
            a("rebuffering");
        } else {
            a("initial_buffering");
            this.e = true;
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        if (z) {
            q("seeking");
        }
    }

    public final void q(String str) {
        nif1 nif1Var;
        if (!this.f.add(str) || (nif1Var = this.b) == null) {
            return;
        }
        nif1Var.c((Long) null, str);
    }

    public final void v(yhg0 yhg0Var, long j) {
        a("manifest_loading");
    }

    public final void y() {
        q("video_joining");
    }
}
