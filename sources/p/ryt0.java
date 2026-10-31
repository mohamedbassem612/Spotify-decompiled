package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ryt0 extends onm {
    public xzg0 a;
    public Object b;
    public Serializable c;
    public Object d;
    public Object e;
    public ijg1 f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ uyt0 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryt0(uyt0 uyt0Var, lnm lnmVar) {
        super(lnmVar);
        this.i = uyt0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.invoke(null, this);
    }
}
