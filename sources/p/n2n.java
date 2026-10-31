package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n2n extends onm {
    public List a;
    public List b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gal e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2n(gal galVar, onm onmVar) {
        super(onmVar);
        this.e = galVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
