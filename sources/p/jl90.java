package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jl90 extends onm {
    public ak90 a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xp10 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl90(xp10 xp10Var, lnm lnmVar) {
        super(lnmVar);
        this.d = xp10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
