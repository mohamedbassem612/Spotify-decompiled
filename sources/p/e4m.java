package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4m implements Function {
    public final /* synthetic */ f4m a;

    public e4m(f4m f4mVar) {
        this.a = f4mVar;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        b4m b4mVar = new b4m();
        f4m f4mVar = this.a;
        nzl nzlVar = f4mVar.c;
        consumer.getClass();
        return l1d.g(Mobius.d(b4mVar, RxConnectables.a(nzlVar.a(consumer)))).d(new c4m(f4mVar)).b(new d4m(f4mVar));
    }
}
