package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v5b implements l5r0 {
    public final r5b a;
    public final String b;
    public final gw70 c;
    public final hf4 d;
    public final qc90 e;
    public MobiusLoop.Controller f;
    public cr6 g;

    public v5b(r5b r5bVar, String str, gw70 gw70Var, hf4 hf4Var, qc90 qc90Var) {
        this.a = r5bVar;
        this.b = str;
        this.c = gw70Var;
        this.d = hf4Var;
        this.e = qc90Var;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        s5b s5bVar;
        this.g = new cr6(layoutInflater, viewGroup, this.c);
        qc90 qc90Var = this.e;
        if (qc90Var instanceof dri1) {
            dri1 dri1Var = (dri1) qc90Var;
            s2b s2bVar = dri1Var.b;
            String str = s2bVar.b;
            String str2 = s2bVar.a;
            s2b s2bVar2 = dri1Var.c;
            s5bVar = new s5b(new x5b(this.b, str, str2, s2bVar2.b, s2bVar2.a, dri1Var.d, false, this.d.a()));
        } else if (qc90Var instanceof hgs0) {
            s5bVar = new s5b(y5b.d);
        } else {
            if (!(qc90Var instanceof jr00)) {
                eg.o();
                return;
            }
            s5bVar = new s5b(w5b.d);
        }
        r5b r5bVar = this.a;
        x0b x0bVar = r5bVar.a;
        lzn0 lzn0Var = r5bVar.b;
        j8k1 j8k1Var = r5bVar.c;
        kt91 kt91Var = r5bVar.d;
        i8h1 i8h1Var = r5bVar.e;
        ntk0 ntk0Var = r5bVar.f;
        Scheduler scheduler = r5bVar.g;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(t4b.class, new bk1(x0bVar, (byte) 6));
        subtypeEffectHandlerBuilderC.d(c5b.class, new f5b(lzn0Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.c(u4b.class, new mba(j8k1Var, (byte) 5));
        subtypeEffectHandlerBuilderC.a(b5b.class, new g5b(lzn0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.a(a5b.class, new g5b(lzn0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.a(e5b.class, new v0b(kt91Var, (byte) 1));
        subtypeEffectHandlerBuilderC.a(y4b.class, new u0b(i8h1Var, ntk0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.a(x4b.class, new u0b(i8h1Var, ntk0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.d(z4b.class, new a21(lzn0Var, j8k1Var, (byte) 20), scheduler);
        this.f = Mobius.b(l1d.g(Mobius.d(q5b.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{Observable.empty()}))), s5bVar, p5b.a, MainThreadWorkRunner.a());
    }

    public final View getView() {
        cr6 cr6Var = this.g;
        if (cr6Var != null) {
            return (View) cr6Var.c;
        }
        return null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.f;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        cr6 cr6Var = this.g;
        cr6Var.getClass();
        controller.c(cr6Var);
        MobiusLoop.Controller controller2 = this.f;
        if (controller2 != null) {
            controller2.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.f;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        MobiusLoop.Controller controller2 = this.f;
        if (controller2 != null) {
            controller2.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
