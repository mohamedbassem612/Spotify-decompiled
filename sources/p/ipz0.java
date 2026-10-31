package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ipz0 extends hab0 implements iu30 {
    public final /* synthetic */ jpz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipz0(jpz0 jpz0Var) {
        super(1);
        this.a = jpz0Var;
    }

    public final Object invoke(Object obj) {
        qpz0 qpz0Var = this.a.a;
        return Mobius.d(lpz0.a, RxConnectables.a(new o4e0(qpz0Var, (byte) 25))).h(RxEventSources.a(new ObservableSource[]{qpz0Var.c.e().filter(mpz0.a).map(npz0.a)})).b(new opz0(qpz0Var)).d(new ppz0(qpz0Var));
    }
}
