package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p1n extends onm {
    public LinkedHashMap a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a2n c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1n(a2n a2nVar, onm onmVar) {
        super(onmVar);
        this.c = a2nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.J((LinkedHashMap) null, this);
    }
}
