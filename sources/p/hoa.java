package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hoa implements c0u0 {
    public List a;

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void J(long j, long j2) {
        a(i6u0.a, Long.valueOf(j), j2);
    }

    public final void K(long j, long j2) {
        a(f6u0.a, Long.valueOf(j), j2);
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        xjz xjzVar = betamaxException.a;
        byte b = xjzVar.a;
        xjzVar.name();
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void O(long j, long j2) {
        a(g6u0.a, Long.valueOf(j), j2);
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        List list = this.a;
        this.a = z6x.a;
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            pze0.m(it2.next());
            throw null;
        }
    }

    public final void S(long j, long j2) {
        a(j6u0.a, Long.valueOf(j), j2);
    }

    public final void a(k6u0 k6u0Var, Long l, long j) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void d(long j, long j2, boolean z) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        xjz xjzVar = betamaxException.a;
        byte b = xjzVar.a;
        xjzVar.name();
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void k(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                bhn0.d();
                return;
            } else {
                try {
                    throw null;
                } catch (Exception e) {
                    Logger.l(e, "Multiplayer playback signpost duration update failed", new Object[0]);
                }
            }
        }
        Iterator it2 = this.a.iterator();
        if (it2.hasNext()) {
            pze0.m(it2.next());
            throw null;
        }
    }

    public final void l(long j, long j2, long j3, boolean z) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void m(long j, long j2) {
        a(h6u0.a, Long.valueOf(j), j2);
    }

    public final void o(int i, long j, long j2) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }
}
