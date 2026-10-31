package p;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a0r extends onm {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yla d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0r(yla ylaVar, onm onmVar) {
        super(onmVar);
        this.d = ylaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return yla.m(this.d, this);
    }
}
