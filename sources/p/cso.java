package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cso extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cso(i6b i6bVar, onm onmVar) {
        super(onmVar);
        this.c = i6bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, this);
    }
}
