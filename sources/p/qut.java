package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qut extends onm {
    public Set a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sut d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qut(sut sutVar, lnm lnmVar) {
        super(lnmVar);
        this.d = sutVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d((Set) null, this);
    }
}
