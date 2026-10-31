package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o6d extends onm {
    public Intent a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s6d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6d(s6d s6dVar, onm onmVar) {
        super(onmVar);
        this.c = s6dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Intent) null, this);
    }
}
