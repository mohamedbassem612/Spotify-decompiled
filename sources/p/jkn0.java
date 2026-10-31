package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jkn0 implements Connection {
    public final /* synthetic */ kkn0 a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ zyw c;

    public jkn0(kkn0 kkn0Var, Consumer consumer, zyw zywVar) {
        this.a = kkn0Var;
        this.b = consumer;
        this.c = zywVar;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        wjn0 wjn0Var = (wjn0) obj;
        kkn0 kkn0Var = this.a;
        kkn0.h(kkn0Var, wjn0Var);
        kkn0.g(kkn0Var, wjn0Var, kkn0.d(kkn0Var), kkn0.e(kkn0Var), this.b);
        kkn0.i(kkn0Var, wjn0Var.b());
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        kkn0.f(this.a).removeTextChangedListener(this.c);
    }
}
