package p;

import android.os.Bundle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iw30 extends x7e0 implements b031 {
    public final mfe X;
    public MobiusLoop Y;
    public Disposable Z;
    public final vw30 d;
    public final zw30 e;
    public final nn60 f;
    public final b35 g;
    public final kdn0 h;
    public final kdn0 i;
    public final bbc t;

    public iw30(vw30 vw30Var, zw30 zw30Var, nn60 nn60Var, b35 b35Var) {
        this.d = vw30Var;
        this.e = zw30Var;
        this.f = nn60Var;
        this.g = b35Var;
        kdn0 kdn0Var = new kdn0();
        this.h = kdn0Var;
        this.i = kdn0Var;
        bbc bbcVarA = mno1.a(1, 2, 4);
        this.t = bbcVarA;
        this.X = k4p1.B(bbcVarA);
    }

    @Override // p.b031
    public final void a(Bundle bundle) {
        oqr0 parcelable = bundle.getParcelable("state");
        if (parcelable != null) {
            bob1 bob1VarU = iho1.u(parcelable, (b3f1) oz11.a.get(this.g.g()));
            this.h.m(bob1VarU);
            this.f.a = bob1VarU.k.b;
        }
    }

    @Override // p.x7e0
    public final void e() {
        kw30 kw30Var = new kw30();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious();
        vw30 vw30Var = this.d;
        sw30 sw30Var = new sw30(vw30Var.a);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(taw.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious.a(sw30Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mfw.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new uw30(vw30Var.c)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qcw.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new pw30(vw30Var.b)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vew.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new qw30(vw30Var.d)));
        fns fnsVar = igu.a;
        MobiusLoop.Builder builderD = Mobius.d(kw30Var, new com.spotify.mobius.coroutines.a(pyf0.a, coroutinesSubtypeEffectHandlerBuilderI)).b(lw30.a).d(mw30.a);
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar2 = igu.a;
        mr20[] mr20VarArr = {this.X};
        companion.getClass();
        com.spotify.mobius.coroutines.b bVar = new com.spotify.mobius.coroutines.b(fnsVar2, mr20VarArr);
        com.spotify.mobius.coroutines.b bVar2 = new com.spotify.mobius.coroutines.b(fnsVar2, new mr20[]{r6x.a});
        Observable map = vw30Var.e.e().skip(1L).map(nw30.a);
        Scheduler scheduler = vw30Var.h;
        MobiusLoop.Builder builderC = builderD.c(bVar, bVar2, new com.spotify.mobius.coroutines.b(fnsVar2, new mr20[]{yoi1.g(map.observeOn(scheduler))}), new com.spotify.mobius.coroutines.b(fnsVar2, new mr20[]{yoi1.g(vw30Var.f.a(false).map(ow30.a).observeOn(scheduler))}), new com.spotify.mobius.coroutines.b(fnsVar2, new mr20[]{new fts(vw30Var.g.b, (byte) 4)}));
        mmr0 mmr0VarG = ak20.g(this.e, this.g);
        bob1 bob1Var = (bob1) mmr0VarG.a;
        Set setSingleton = (Set) mmr0VarG.b;
        kdn0 kdn0Var = this.i;
        bob1 bob1Var2 = (bob1) kdn0Var.e();
        if (bob1Var2 != null) {
            bob1Var = bob1Var2;
        }
        bob1 bob1Var3 = (bob1) kdn0Var.e();
        if (bob1Var3 != null) {
            setSingleton = Collections.singleton(new mfw(bob1Var3.k.b));
        }
        MobiusLoop mobiusLoopA = builderC.a(bob1Var, setSingleton);
        this.Z = mobiusLoopA.b(new y11(this, (byte) 11));
        this.Y = mobiusLoopA;
    }

    @Override // p.x7e0
    public final void f() {
        MobiusLoop mobiusLoop = this.Y;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        mobiusLoop.dispose();
        Disposable disposable = this.Z;
        if (disposable != null) {
            disposable.dispose();
        } else {
            u890.C("disposable");
            throw null;
        }
    }

    @Override // p.b031
    public final Bundle serialize() {
        bob1 bob1Var = (bob1) this.i.e();
        return mno1.h(new mmr0[]{oqn1.n("state", bob1Var != null ? iho1.s(bob1Var) : null)});
    }
}
