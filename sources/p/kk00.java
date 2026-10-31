package p;

import com.spotify.mobius.Connection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kk00 implements Connection {
    public final /* synthetic */ Object a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ xab1 c;
    public final /* synthetic */ dt71 d;

    public kk00(Object obj, l811 l811Var, xab1 xab1Var, dt71 dt71Var) {
        this.a = obj;
        this.b = l811Var;
        this.c = xab1Var;
        this.d = dt71Var;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.d.a(obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        Object obj = this.a;
        l811 l811Var = this.b;
        xab1 xab1Var = this.c;
        synchronized (obj) {
            if (!l811Var.a) {
                l811Var.a = true;
                xab1Var.d(null);
            }
        }
    }
}
