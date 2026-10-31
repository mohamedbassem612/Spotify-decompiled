package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zhv extends onm {
    public int a;
    public WidgetState b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aiv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhv(aiv aivVar, onm onmVar) {
        super(onmVar);
        this.d = aivVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, (WidgetState) null, this);
    }
}
