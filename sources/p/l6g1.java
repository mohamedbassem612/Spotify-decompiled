package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l6g1 extends onm {
    public Map a;
    public Iterator b;
    public Map c;
    public Object d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ n6g1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6g1(n6g1 n6g1Var, onm onmVar) {
        super(onmVar);
        this.h = n6g1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c((ArrayList) null, this);
    }
}
