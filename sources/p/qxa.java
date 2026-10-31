package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qxa extends onm {
    public WidgetState a;
    public vgn0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zsc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(zsc zscVar, onm onmVar) {
        super(onmVar);
        this.e = zscVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.D((WidgetState) null, this);
    }
}
