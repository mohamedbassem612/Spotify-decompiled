package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yjf1 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zjf1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjf1(zjf1 zjf1Var, onm onmVar) {
        super(onmVar);
        this.c = zjf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
