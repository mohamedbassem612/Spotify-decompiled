package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tn40 extends onm {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ un40 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn40(un40 un40Var, onm onmVar) {
        super(onmVar);
        this.d = un40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
