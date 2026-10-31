package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ymn0 extends onm {
    public Uri a;
    public Uri b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kqi0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymn0(kqi0 kqi0Var, onm onmVar) {
        super(onmVar);
        this.d = kqi0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.n(null, this);
    }
}
