package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h8p0 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ CurrentTrackMetadata d;
    public final /* synthetic */ whb1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, boolean z) {
        super(3);
        this.a = activeSession;
        this.b = z;
        this.c = f;
        this.d = currentTrackMetadata;
        this.e = whb1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        jch0.f(dm5.J(et40Var), 0, apo.r(103285027, new cvh(this.d, this.e, (byte) 1), b0kVar), b0kVar, 3072, 2);
        fc11.g(dm5.Q(et40Var, 8.0f), b0kVar, 0);
        rau0.c(this.a, this.b, this.c, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, b0kVar, 0, 1016);
        return rih1.a;
    }
}
