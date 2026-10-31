package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class owm extends onm {
    public List a;
    public List b;
    public Map c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v1k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owm(v1k v1kVar, onm onmVar) {
        super(onmVar);
        this.e = v1kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, this);
    }
}
