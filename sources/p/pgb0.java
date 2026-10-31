package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pgb0 implements Runnable {
    public final /* synthetic */ vq80 a;
    public final /* synthetic */ uo5 b;
    public final /* synthetic */ Context c;

    public pgb0(vq80 vq80Var, uo5 uo5Var, Context context) {
        this.a = vq80Var;
        this.b = uo5Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invoke(new ogb0(this.b, this.c));
    }
}
