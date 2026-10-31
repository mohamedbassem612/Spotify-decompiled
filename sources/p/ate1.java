package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ate1 implements Function {
    public final /* synthetic */ bte1 a;

    public ate1(bte1 bte1Var) {
        this.a = bte1Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        xse1 xse1Var = this.a.a;
        consumer.getClass();
        return ((jse1) xse1Var).a(consumer);
    }
}
