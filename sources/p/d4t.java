package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d4t extends onm {
    public ViewGroup a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e4t c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4t(e4t e4tVar, onm onmVar) {
        super(onmVar);
        this.c = e4tVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        this.c.a(null, this);
        return d9n.a;
    }
}
