package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sos extends onm {
    public String a;
    public fi4 b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tos e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sos(tos tosVar, onm onmVar) {
        super(onmVar);
        this.e = tosVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, this);
    }
}
