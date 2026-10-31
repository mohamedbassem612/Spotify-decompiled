package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu3 implements Function {
    public final /* synthetic */ mu3 a;

    public lu3(mu3 mu3Var) {
        this.a = mu3Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        iu3 iu3Var = new iu3();
        mu3 mu3Var = this.a;
        om3 om3Var = mu3Var.c;
        consumer.getClass();
        return l1d.g(Mobius.d(iu3Var, RxConnectables.a(om3Var.a(consumer)))).d(new ju3(mu3Var)).b(new ku3(mu3Var));
    }
}
