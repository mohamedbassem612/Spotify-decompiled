package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d7m0 implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ Consumer c;

    public d7m0(Object obj, l811 l811Var, Consumer consumer) {
        this.a = obj;
        this.b = l811Var;
        this.c = consumer;
    }

    public final void accept(Object obj) {
        Object obj2 = this.a;
        l811 l811Var = this.b;
        Consumer consumer = this.c;
        synchronized (obj2) {
            if (!l811Var.a) {
                consumer.accept(new w9m1(obj, null));
            }
        }
    }
}
