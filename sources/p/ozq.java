package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ozq extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rzq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq(rzq rzqVar, lnm lnmVar) {
        super(lnmVar);
        this.b = rzqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((zjd1) null, (List) null, this);
    }
}
