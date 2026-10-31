package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x1n extends onm {
    public String a;
    public LinkedHashMap b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a2n e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1n(a2n a2nVar, onm onmVar) {
        super(onmVar);
        this.e = a2nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.R((String) null, this);
    }
}
