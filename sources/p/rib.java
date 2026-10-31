package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rib extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sib b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rib(sib sibVar, onm onmVar) {
        super(onmVar);
        this.b = sibVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((Set) null, (qhb) null, (rhb) null, this);
    }
}
