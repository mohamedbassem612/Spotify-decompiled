package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bsj1 implements x191 {
    public final woa a;
    public final kma b;
    public final fpa c;
    public final gn10 d;
    public uoa e;
    public VideoSurfaceView f;
    public drj1 g;
    public final cv7 h = new cv7(this, (byte) 12);

    public bsj1(woa woaVar, kma kmaVar, fpa fpaVar, gn10 gn10Var) {
        this.a = woaVar;
        this.b = kmaVar;
        this.c = fpaVar;
        this.d = gn10Var;
    }

    public final boolean a() {
        return false;
    }

    public final void b(VideoSurfaceView videoSurfaceView, String str, long j, long j2, String str2, int i, String str3) {
        uoa uoaVar = this.e;
        if (uoaVar != null) {
            uoaVar.r(i != 2);
            m0u0 m0u0VarE = uoaVar.e();
            if (u890.j(m0u0VarE != null ? m0u0VarE.a.a : null, str)) {
                return;
            }
            uoaVar.f();
            o2u0 o2u0Var = new o2u0(wqn1.n(str), 12, (Map) null);
            oot0 oot0Var = new oot0(j, j2, false, false, (hu7) null, (tne1) null, false, 240);
            VideoSurfaceView videoSurfaceView2 = this.f;
            if (videoSurfaceView2 != null) {
                uoaVar.k(videoSurfaceView2);
            }
            this.f = videoSurfaceView;
            uoaVar.d(videoSurfaceView);
            uoaVar.h(o2u0Var, oot0Var);
            uoaVar.l();
        }
    }

    public final void e() {
        uoa uoaVar = this.e;
        if (uoaVar != null) {
            this.a.c(uoaVar);
            this.e = null;
        }
    }

    public final void f(drj1 drj1Var) {
        this.g = drj1Var;
    }

    public final void g(Function0 function0) {
        if (this.e == null) {
            uoa uoaVarA = woa.a(this.a, this.d.a, (o2u0) null, (w2k1) null, this.b, Collections.singletonList(this.h), false, (bas) null, new sn10(true), 710);
            uoaVarA.p(2);
            uoaVarA.t(false);
            uoaVarA.q(true);
            uoaVarA.s(new y2g1(this.c.a));
            this.e = uoaVarA;
        }
        function0.invoke();
    }

    public final void stop() {
        uoa uoaVar = this.e;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    public final void d(Function0 function0, Function0 function1) {
    }

    public final void c(String str, sjf1 sjf1Var, sjf1 sjf1Var2) {
    }
}
