package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hn71 extends onm {
    public Set a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ in71 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn71(in71 in71Var, onm onmVar) {
        super(onmVar);
        this.d = in71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, this);
    }
}
