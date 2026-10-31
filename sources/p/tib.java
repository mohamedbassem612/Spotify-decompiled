package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tib extends onm {
    public g23 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uib c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tib(uib uibVar, onm onmVar) {
        super(onmVar);
        this.c = uibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Set) null, (qhb) null, (rhb) null, false, (gaa) null, this);
    }
}
