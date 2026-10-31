package p;

import com.spotify.userhighlight.v1.UserHighlightChange;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sai1 extends onm {
    public UserHighlightChange a;
    public smc0 b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tai1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sai1(tai1 tai1Var, onm onmVar) {
        super(onmVar);
        this.e = tai1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objC = this.e.c(null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
