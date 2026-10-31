package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a941 extends onm {
    public erv a;
    public List b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i09 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a941(i09 i09Var, onm onmVar) {
        super(onmVar);
        this.e = i09Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
