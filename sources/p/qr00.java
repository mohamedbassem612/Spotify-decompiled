package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qr00 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ t7y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr00(t7y t7yVar, onm onmVar) {
        super(onmVar);
        this.b = t7yVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l((List) null, this);
    }
}
