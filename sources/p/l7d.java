package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l7d extends onm {
    public Intent a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fta c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7d(fta ftaVar, onm onmVar) {
        super(onmVar);
        this.c = ftaVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.C((Intent) null, this);
    }
}
