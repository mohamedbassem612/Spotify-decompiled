package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class te0 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(WidgetState.ActiveSession activeSession, int i) {
        super(2);
        this.a = activeSession;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ye0.e(this.a, (b0k) obj, iP);
        return rih1.a;
    }
}
