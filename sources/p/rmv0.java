package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rmv0 extends onm {
    public List a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ smv0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmv0(smv0 smv0Var, onm onmVar) {
        super(onmVar);
        this.e = smv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
