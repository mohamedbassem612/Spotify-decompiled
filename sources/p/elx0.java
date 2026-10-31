package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class elx0 extends onm {
    public Activity a;
    public g2z b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ykb0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elx0(ykb0 ykb0Var, onm onmVar) {
        super(onmVar);
        this.d = ykb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.h(null, this);
    }
}
