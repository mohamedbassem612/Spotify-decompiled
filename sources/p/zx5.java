package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zx5 extends onm {
    public cy5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cy5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx5(cy5 cy5Var, onm onmVar) {
        super(onmVar);
        this.c = cy5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.e((Context) null, (Object) null, this);
    }
}
