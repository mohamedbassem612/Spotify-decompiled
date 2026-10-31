package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o780 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.InactiveSession a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o780(WidgetState.InactiveSession inactiveSession, float f, boolean z, int i) {
        super(2);
        this.a = inactiveSession;
        this.b = f;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        w780.a(this.a, this.b, this.c, (b0k) obj, iP);
        return rih1.a;
    }
}
