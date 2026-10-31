package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tig1 extends onm {
    public String a;
    public lhg1 b;
    public Collection c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vnd1 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tig1(vnd1 vnd1Var, onm onmVar) {
        super(onmVar);
        this.i = vnd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.g(null, null, this);
    }
}
