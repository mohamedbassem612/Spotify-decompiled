package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j4o extends onm {
    public List a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m4o d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4o(m4o m4oVar, onm onmVar) {
        super(onmVar);
        this.d = m4oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
