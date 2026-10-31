package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nua1 extends hab0 implements iu30 {
    public final /* synthetic */ oua1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nua1(oua1 oua1Var) {
        super(1);
        this.a = oua1Var;
    }

    public final Object invoke(Object obj) {
        vua1 vua1Var = this.a.b;
        return Mobius.d(vua1Var.a, RxConnectables.a(vua1Var.b)).h(RxEventSources.a(new ObservableSource[]{vua1Var.c.b().map(sua1.a)})).b(new tua1(vua1Var)).d(new uua1(vua1Var));
    }
}
