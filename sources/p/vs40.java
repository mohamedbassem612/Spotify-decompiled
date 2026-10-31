package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vs40 extends onm {
    public ws40 a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ws40 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs40(ws40 ws40Var, onm onmVar) {
        super(onmVar);
        this.e = ws40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.a((Context) null, 0, this);
    }
}
