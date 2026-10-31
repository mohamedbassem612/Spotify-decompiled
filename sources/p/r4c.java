package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4c extends onm {
    public int a;
    public Set b;
    public String c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a5c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4c(a5c a5cVar, onm onmVar) {
        super(onmVar);
        this.f = a5cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.l(0, null, null, this);
    }
}
