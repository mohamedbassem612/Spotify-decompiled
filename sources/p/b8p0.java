package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b8p0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ kee1 e;
    public final /* synthetic */ kee1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, kee1 kee1Var, kee1 kee1Var2) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
        this.d = whb1Var;
        this.e = kee1Var;
        this.f = kee1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            jch0.f(dm5.J(et40.a), 0, apo.r(1878347187, new a8p0(this.a, this.b, this.c, this.d, this.e, this.f), x340Var2), x340Var2, 3072, 2);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
