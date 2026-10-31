package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zcv0 extends onm {
    public long a;
    public Function0 b;
    public p811 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ adv0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcv0(adv0 adv0Var, onm onmVar) {
        super(onmVar);
        this.e = adv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.b(0L, (jea) null, this);
    }
}
