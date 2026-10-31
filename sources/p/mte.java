package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mte extends onm {
    public goe a;
    public LinkedHashMap b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ aod e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mte(aod aodVar, onm onmVar) {
        super(onmVar);
        this.e = aodVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.e((goe) null, false, this);
    }
}
