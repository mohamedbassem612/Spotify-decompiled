package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nte extends onm {
    public List a;
    public LinkedHashMap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aod d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nte(aod aodVar, onm onmVar) {
        super(onmVar);
        this.d = aodVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d((List) null, this);
    }
}
