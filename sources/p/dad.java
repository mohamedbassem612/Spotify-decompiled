package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dad extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nad b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dad(nad nadVar, onm onmVar) {
        super(onmVar);
        this.b = nadVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s((String) null, 0, (String) null, (List) null, (cqf) null, this);
    }
}
