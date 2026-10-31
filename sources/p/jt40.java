package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jt40 extends onm {
    public Context a;
    public v441 b;
    public String c;
    public xgn0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ nt40 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt40(nt40 nt40Var, onm onmVar) {
        super(onmVar);
        this.f = nt40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.a(null, null, null, this);
    }
}
