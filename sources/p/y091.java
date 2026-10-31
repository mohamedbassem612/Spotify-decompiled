package p;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y091 extends onm {
    public h191 a;
    public Object b;
    public Serializable c;
    public Object d;
    public a191 e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h191 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y091(h191 h191Var, onm onmVar) {
        super(onmVar);
        this.h = h191Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(this);
    }
}
