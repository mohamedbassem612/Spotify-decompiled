package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sbr extends onm {
    public tv80 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ toj0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbr(toj0 toj0Var, onm onmVar) {
        super(onmVar);
        this.d = toj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.r((List) null, this);
    }
}
