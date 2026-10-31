package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mfi1 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fum0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfi1(fum0 fum0Var, onm onmVar) {
        super(onmVar);
        this.c = fum0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
