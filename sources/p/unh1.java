package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class unh1 extends onm {
    public cv30 a;
    public Function0 b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vnh1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unh1(vnh1 vnh1Var, onm onmVar) {
        super(onmVar);
        this.e = vnh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.a(null, null, this);
    }
}
