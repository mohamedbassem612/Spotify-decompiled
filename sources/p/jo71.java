package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jo71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ko71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo71(ko71 ko71Var, onm onmVar) {
        super(onmVar);
        this.b = ko71Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((List) null, this);
    }
}
