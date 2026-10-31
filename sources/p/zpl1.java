package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zpl1 extends onm {
    public WidgetState a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aql1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpl1(aql1 aql1Var, onm onmVar) {
        super(onmVar);
        this.c = aql1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, (WidgetState) null, this);
    }
}
