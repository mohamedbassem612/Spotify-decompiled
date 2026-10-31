package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x7h0 extends onm {
    public String a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y7h0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7h0(y7h0 y7h0Var, onm onmVar) {
        super(onmVar);
        this.d = y7h0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objG = this.d.g(null, null, this);
        return objG == d9n.a ? objG : new e331(objG);
    }
}
