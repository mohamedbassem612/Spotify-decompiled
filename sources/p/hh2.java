package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hh2 implements xpw {
    public final xu30 a;
    public final Function0 b;
    public final Function0 c;
    public final djx0 d;
    public final ohv0 e;
    public final wnh1 f;
    public final e7m0 g;
    public final eih1 h;
    public final psw i;

    public hh2(xu30 xu30Var, Function0 function0, Function0 function1, djx0 djx0Var, ohv0 ohv0Var, wnh1 wnh1Var, EventSource eventSource) {
        this.a = xu30Var;
        this.b = function0;
        this.c = function1;
        this.d = djx0Var;
        this.e = ohv0Var;
        this.f = wnh1Var;
        zg2 zg2Var = new zg2();
        drm1 drm1Var = new drm1((byte) 2);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ch2.class, new bk1((Object) this, (byte) 4));
        subtypeEffectHandlerBuilderC.c(bh2.class, new fh2(this, (byte) 0));
        subtypeEffectHandlerBuilderC.c(ah2.class, new fh2(this, (byte) 1));
        this.g = sbl.z(zg2Var, drm1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), ah1.T0, new eh2(eventSource, this));
        this.h = new eih1();
        j2i j2iVar = new j2i(662829773, new r1(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
