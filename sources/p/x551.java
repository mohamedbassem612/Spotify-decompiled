package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x551 implements Function {
    public final /* synthetic */ y551 a;

    public x551(y551 y551Var) {
        this.a = y551Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        y551 y551Var = this.a;
        p551 p551Var = y551Var.b;
        ly41 ly41Var = y551Var.e;
        consumer.getClass();
        return gvg.d("Search-Mobius-Flow", Mobius.d(p551Var, RxConnectables.a(ly41Var.a(consumer))).b(new v551(y551Var)).d(new w551(y551Var)));
    }
}
