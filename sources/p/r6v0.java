package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r6v0 extends onm {
    public LinkedHashMap a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s6v0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6v0(s6v0 s6v0Var, onm onmVar) {
        super(onmVar);
        this.d = s6v0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, 0L, this);
    }
}
