package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mw70 extends onm {
    public Uri a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wfx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw70(wfx wfxVar, onm onmVar) {
        super(onmVar);
        this.c = wfxVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Uri) null, this);
    }
}
