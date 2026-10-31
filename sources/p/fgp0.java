package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fgp0 implements ObservableOnSubscribe {
    public final /* synthetic */ Observable a;
    public final /* synthetic */ zeu b;
    public final /* synthetic */ p811 c;

    public fgp0(Observable observable, zeu zeuVar, p811 p811Var) {
        this.a = observable;
        this.b = zeuVar;
        this.c = p811Var;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        MobiusLoop.Builder builderB = Mobius.d(new wam0((byte) 3), new x2y(this.a, this.b, observableEmitter, (byte) 4)).d(rh20.S0).b(xi20.T0);
        p811 p811Var = this.c;
        Object obj = p811Var.a;
        vbe vbeVar = obj != null ? q490.e : r490.e;
        qgp0 qgp0Var = new qgp0(vbeVar, true, obj != null ? new n8e0(obj) : null);
        kgp0 kgp0Var = kgp0.a;
        observableEmitter.setCancellable(new e33(builderB.a(qgp0Var, obj != null ? Effects.a(new lgp0[]{kgp0Var, new ggp0(vbeVar)}) : Effects.a(new kgp0[]{kgp0Var})), p811Var));
    }
}
