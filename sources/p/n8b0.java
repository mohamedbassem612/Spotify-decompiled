package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n8b0 implements g1d1 {
    public final /* synthetic */ Context a;

    public h1d1 b(uqs uqsVar) {
        String str = (String) uqsVar.d;
        up20 up20Var = (up20) uqsVar.e;
        if (str != null && str.length() != 0) {
            return new wk30(this.a, str, up20Var, true, true);
        }
        hhg1.n("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
