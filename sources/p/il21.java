package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class il21 extends onm {
    public String a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jl21 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il21(jl21 jl21Var, onm onmVar) {
        super(onmVar);
        this.d = jl21Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
