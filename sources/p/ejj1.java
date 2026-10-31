package p;

import android.net.Uri;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejj1 {
    public final woa a;
    public final String b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public uoa f;
    public final w2k1 g = new w2k1();
    public mr20 h;
    public volatile boolean i;
    public boolean j;

    public ejj1(woa woaVar, String str, Uri uri, boolean z, boolean z2) {
        this.a = woaVar;
        this.b = str;
        this.c = uri;
        this.d = z;
        this.e = z2;
    }

    public final void a(VideoSurfaceView videoSurfaceView) {
        if (this.e) {
            videoSurfaceView.setOnFirstFrameRendered(new dch1(this, (byte) 19));
        }
        this.g.a(videoSurfaceView);
    }

    public final void b(VideoSurfaceView videoSurfaceView) {
        if (this.e) {
            videoSurfaceView.setOnFirstFrameRendered((Function0) null);
        }
        this.g.f(videoSurfaceView);
    }

    public final void c() {
        uoa uoaVar = this.f;
        if (uoaVar != null) {
            uoaVar.i();
            this.a.c(uoaVar);
        }
        Iterator it = o7h.l1(this.g.b).iterator();
        while (it.hasNext()) {
            b((VideoSurfaceView) it.next());
        }
        this.h = null;
        this.f = null;
        this.i = false;
    }

    public final uoa d() {
        uoa uoaVar = this.f;
        if (uoaVar != null) {
            return uoaVar;
        }
        eg.m("VideoController is not initialized");
        return null;
    }

    public final void e() {
        djj1 djj1Var = new djj1((byte) 0);
        cv7 cv7Var = new cv7(djj1Var, (byte) 10);
        this.h = rqt0.u((bpb1) djj1Var.c);
        uoa uoaVarA = woa.a(this.a, this.b, (o2u0) null, this.g, (kma) null, Collections.singletonList(cv7Var), false, (bas) null, new sn10(false), 746);
        uoaVarA.h(new o2u0(this.c.toString(), 14, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 251));
        uoaVarA.q(this.d);
        this.f = uoaVarA;
    }

    public final void f() {
        if (this.i) {
            return;
        }
        this.j = true;
        d().l();
    }
}
