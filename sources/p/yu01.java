package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yu01 implements wu01 {
    public final Scheduler a;
    public final zhq0 b;
    public final tyt0 c;
    public final wr00 d;
    public final in8 e;
    public final vgm f;
    public final t001 g;
    public final e4b1 h;
    public zu01 i = new zu01(1570, new tr80(0, 15, 1));
    public MobiusLoop j;

    public yu01(Scheduler scheduler, zhq0 zhq0Var, tyt0 tyt0Var, wr00 wr00Var, in8 in8Var, vgm vgmVar, t001 t001Var, e4b1 e4b1Var) {
        this.a = scheduler;
        this.b = zhq0Var;
        this.c = tyt0Var;
        this.d = wr00Var;
        this.e = in8Var;
        this.f = vgmVar;
        this.g = t001Var;
        this.h = e4b1Var;
    }

    public final void a(vs01 vs01Var) {
        MobiusLoop mobiusLoop = this.j;
        if (mobiusLoop != null) {
            mobiusLoop.a(vs01Var);
        }
    }

    public final void b(uu01 uu01Var, uu01 uu01Var2) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ds01.class, new o4e0(new wvq0(this.b, (byte) 9), (byte) 26));
        subtypeEffectHandlerBuilderC.g(cs01.class, new o4e0(this, (byte) 27));
        subtypeEffectHandlerBuilderC.g(yr01.class, new bk1(this.h, (byte) 2));
        Scheduler scheduler = this.a;
        subtypeEffectHandlerBuilderC.d(gs01.class, uu01Var, scheduler);
        subtypeEffectHandlerBuilderC.d(es01.class, uu01Var2, scheduler);
        subtypeEffectHandlerBuilderC.d(zr01.class, new xu01(this, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(as01.class, new xu01(this, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(fs01.class, new xu01(this, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(bs01.class, new xu01(this, (byte) 3), scheduler);
        MobiusLoop mobiusLoopG = Mobius.d(t7p0.t, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(vbx0.e).d(wbx0.e).g(this.i);
        mobiusLoopG.a(new os01(gyo1.T(this.i)));
        this.j = mobiusLoopG;
    }
}
