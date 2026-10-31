package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dvt extends onm {
    public aza a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ evt d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvt(evt evtVar, onm onmVar) {
        super(onmVar);
        this.d = evtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((aza) null, (Set) null, this);
    }
}
