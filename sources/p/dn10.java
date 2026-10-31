package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dn10 extends onm {
    public Map a;
    public LinkedHashMap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ en10 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn10(en10 en10Var, onm onmVar) {
        super(onmVar);
        this.d = en10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
