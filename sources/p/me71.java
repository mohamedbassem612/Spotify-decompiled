package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class me71 extends onm {
    public List a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nn61 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me71(nn61 nn61Var, onm onmVar) {
        super(onmVar);
        this.d = nn61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, 0, this);
    }
}
