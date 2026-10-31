package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qai1 extends onm {
    public String a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tai1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qai1(tai1 tai1Var, onm onmVar) {
        super(onmVar);
        this.d = tai1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
