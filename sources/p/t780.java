package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t780 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.InactiveSession a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t780(WidgetState.InactiveSession inactiveSession, int i) {
        super(2);
        this.a = inactiveSession;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        w780.c(this.a, (b0k) obj, iP);
        return rih1.a;
    }
}
