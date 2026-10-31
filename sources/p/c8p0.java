package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c8p0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.ActiveSession b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8p0(float f, WidgetState.ActiveSession activeSession, boolean z, float f2) {
        super(3);
        this.a = f;
        this.b = activeSession;
        this.c = z;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        fc11.g(dm5.h0(et40.a, this.a), b0kVar, 0);
        rau0.c(this.b, this.c, this.d, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, b0kVar, 0, 1016);
        return rih1.a;
    }
}
