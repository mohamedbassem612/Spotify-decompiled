package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6d extends onm {
    public Intent a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s6d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6d(s6d s6dVar, onm onmVar) {
        super(onmVar);
        this.d = s6dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c((Intent) null, this);
    }
}
