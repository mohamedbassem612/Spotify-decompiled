package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class goy0 extends onm {
    public List a;
    public res b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ res e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goy0(res resVar, onm onmVar) {
        super(onmVar);
        this.e = resVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.q((List) null, this);
    }
}
