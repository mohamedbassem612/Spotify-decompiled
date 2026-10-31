package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ri31 extends onm {
    public ni31 a;
    public Collection b;
    public Iterator c;
    public String d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ti31 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri31(ti31 ti31Var, onm onmVar) {
        super(onmVar);
        this.i = ti31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.d(null, null, this);
    }
}
