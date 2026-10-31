package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i370 extends onm {
    public Map a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yfu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i370(yfu yfuVar, onm onmVar) {
        super(onmVar);
        this.c = yfuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((ArrayList) null, this);
    }
}
