package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jp11 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ op11 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp11(op11 op11Var, onm onmVar) {
        super(onmVar);
        this.c = op11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        d9n d9nVarF = this.c.f((String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (wp11) null, false, this);
        return d9nVarF == d9n.a ? d9nVarF : new e331(d9nVarF);
    }
}
