package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yx5 extends onm {
    public Object a;
    public Context b;
    public s3x c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cy5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx5(cy5 cy5Var, onm onmVar) {
        super(onmVar);
        this.e = cy5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.d((Context) null, (s3x) null, this);
    }
}
