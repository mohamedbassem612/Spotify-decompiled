package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nw51 extends onm {
    public LinkedHashMap a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vw51 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw51(vw51 vw51Var, onm onmVar) {
        super(onmVar);
        this.c = vw51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
