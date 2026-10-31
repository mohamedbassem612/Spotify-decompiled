package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f8p0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ whb1 c;
    public final /* synthetic */ WidgetState.ActiveSession d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gt40 f;
    public final /* synthetic */ kee1 g;
    public final /* synthetic */ kee1 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8p0(float f, CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var, WidgetState.ActiveSession activeSession, boolean z, gt40 gt40Var, kee1 kee1Var, kee1 kee1Var2, int i) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = whb1Var;
        this.d = activeSession;
        this.e = z;
        this.f = gt40Var;
        this.g = kee1Var;
        this.h = kee1Var2;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p8p0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1));
        return rih1.a;
    }
}
