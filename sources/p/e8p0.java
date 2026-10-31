package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e8p0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ kee1 e;
    public final /* synthetic */ kee1 f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, kee1 kee1Var, kee1 kee1Var2, boolean z) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
        this.d = whb1Var;
        this.e = kee1Var;
        this.f = kee1Var2;
        this.g = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = this.a;
            et40 et40Var = et40.a;
            gt40 gt40VarI = dm5.I(et40Var);
            kee1 kee1Var = this.e;
            kee1 kee1Var2 = this.f;
            float f2 = this.a;
            CurrentTrackMetadata currentTrackMetadata = this.b;
            WidgetState.ActiveSession activeSession = this.c;
            j2h1.b(gt40VarI, ql3.f, apo.r(-1972019889, new b8p0(f2, currentTrackMetadata, activeSession, this.d, kee1Var, kee1Var2), x340Var2), x340Var2, 384, 0);
            j2h1.b(dm5.I(et40Var), ql3.i, apo.r(449250232, new d8p0(16.0f + f, activeSession, this.g, (s3v.b(((s3v) x340Var2.k(p4k.a)).a) - f) - 48.0f), x340Var2), x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
