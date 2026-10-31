package p;

import com.spotify.widgets.npvwidget.t;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yly0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ t b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yly0(t tVar, onm onmVar) {
        super(onmVar);
        this.b = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
