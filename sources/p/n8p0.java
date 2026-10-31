package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n8p0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, boolean z) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
        this.d = whb1Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState.ActiveSession activeSession = this.c;
            boolean z = this.e;
            float f = this.a;
            CurrentTrackMetadata currentTrackMetadata = this.b;
            whb1 whb1Var = this.d;
            jch0.f((gt40) null, 2, apo.r(-645143206, new m8p0(f, currentTrackMetadata, activeSession, whb1Var, z), x340Var2), x340Var2, 3072, 3);
            j2h1.b(dm5.I(et40.a), ql3.e, j4j.a, x340Var2, 384, 0);
            eqr0.a((gt40) null, 0, 0, apo.r(-1641907988, new b470(this.a, currentTrackMetadata, whb1Var), x340Var2), x340Var2, 3072, 7);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
