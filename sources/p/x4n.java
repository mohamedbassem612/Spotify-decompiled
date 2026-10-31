package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x4n extends onm {
    public Uri a;
    public jsc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y4n d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4n(y4n y4nVar, onm onmVar) {
        super(onmVar);
        this.d = y4nVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, 0, 0, null, this);
    }
}
