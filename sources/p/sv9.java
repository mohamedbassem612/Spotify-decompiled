package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sv9 extends onm {
    public Context a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fv9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv9(fv9 fv9Var, onm onmVar) {
        super(onmVar);
        this.d = fv9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, false, this);
    }
}
