package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qis {
    public final dg30 a;
    public final ma41 b;
    public final j2u c;
    public final lls0 d;
    public final nzw0 e;
    public final Scheduler f;
    public final Scheduler g;
    public final lzw0 h;
    public final otu i;
    public final rh0 j;

    public qis(dg30 dg30Var, ma41 ma41Var, j2u j2uVar, lls0 lls0Var, nzw0 nzw0Var, Scheduler scheduler, Scheduler scheduler2, lzw0 lzw0Var, otu otuVar, rh0 rh0Var) {
        this.a = dg30Var;
        this.b = ma41Var;
        this.c = j2uVar;
        this.d = lls0Var;
        this.e = nzw0Var;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = lzw0Var;
        this.i = otuVar;
        this.j = rh0Var;
    }

    public final MobiusLoop.Controller a(lis lisVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        j2u j2uVar = this.c;
        hyw0 hyw0Var = new hyw0(j2uVar, (byte) 1);
        Scheduler scheduler = this.f;
        subtypeEffectHandlerBuilderC.d(xxw0.class, hyw0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(vxw0.class, new hyw0(j2uVar, (byte) 0), scheduler);
        lls0 lls0Var = this.d;
        ma41 ma41Var = this.b;
        subtypeEffectHandlerBuilderC.d(fyw0.class, new y43((Object) lisVar, (Object) lls0Var, (Object) j2uVar, (Object) ma41Var, (byte) 10), scheduler);
        subtypeEffectHandlerBuilderC.g(zxw0.class, new jyw0(scheduler, lisVar, lls0Var, (byte) 0));
        otu otuVar = this.i;
        subtypeEffectHandlerBuilderC.g(wxw0.class, new fzv(otuVar, (byte) 1));
        subtypeEffectHandlerBuilderC.d(byw0.class, new izv(otuVar, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.g(dyw0.class, new so(scheduler, lls0Var, (byte) 28));
        subtypeEffectHandlerBuilderC.c(ayw0.class, new ixp0(this.j, (byte) 29));
        subtypeEffectHandlerBuilderC.c(cyw0.class, new ezv(ma41Var, (byte) 2));
        subtypeEffectHandlerBuilderC.d(yxw0.class, new hzv(this.a, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.g(gyw0.class, new jyw0(scheduler, lisVar, lls0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.d(eyw0.class, new lyw0(lls0Var, (byte) 0), scheduler);
        return Mobius.b(Mobius.d(nis.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(this.h).b(new ois(this)).d(new pis(this)), this.e, mis.a, new SchedulerWorkRunner(scheduler));
    }
}
