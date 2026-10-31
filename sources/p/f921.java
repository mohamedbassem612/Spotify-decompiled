package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f921 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g2z b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f921(g2z g2zVar, onm onmVar) {
        super(onmVar);
        this.b = g2zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.M((List) null, this);
    }
}
