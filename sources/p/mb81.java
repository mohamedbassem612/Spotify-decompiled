package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mb81 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jo8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb81(jo8 jo8Var, onm onmVar) {
        super(onmVar);
        this.c = jo8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
