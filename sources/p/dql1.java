package p;

import com.spotify.widgets.widgetbackgroundupdates.WidgetUpdateWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dql1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ WidgetUpdateWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dql1(WidgetUpdateWorker widgetUpdateWorker, onm onmVar) {
        super(onmVar);
        this.b = widgetUpdateWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, this);
    }
}
