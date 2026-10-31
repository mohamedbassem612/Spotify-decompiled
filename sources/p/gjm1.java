package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gjm1 extends onm {
    public String a;
    public WidgetState b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hjm1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjm1(hjm1 hjm1Var, onm onmVar) {
        super(onmVar);
        this.d = hjm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
