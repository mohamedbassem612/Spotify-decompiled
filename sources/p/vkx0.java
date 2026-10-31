package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vkx0 extends onm {
    public g2z a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cua c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkx0(cua cuaVar, onm onmVar) {
        super(onmVar);
        this.c = cuaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Context) null, this);
    }
}
