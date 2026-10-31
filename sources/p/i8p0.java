package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i8p0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, boolean z) {
        super(3);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
        this.d = whb1Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        float f = this.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, f);
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = pzo0.Y;
            x340Var.s0(objT);
        }
        gt40 gt40VarX = iko1.x(gt40VarE0, (iu30) objT);
        CurrentTrackMetadata currentTrackMetadata = this.b;
        String artwork = currentTrackMetadata.getArtwork();
        WidgetState.ActiveSession activeSession = this.c;
        boolean isWorkProfile = activeSession.getIsWorkProfile();
        whb1 whb1Var = this.d;
        poo1.a(artwork, gt40VarX, isWorkProfile, whb1Var, (String) null, 1, x340Var, 24576, 0);
        eqr0.a(eqr0.H(ow31.a(et40Var), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, apo.r(2136285119, new h8p0((s3v.b(((s3v) x340Var.k(p4k.a)).a) - f) - 48.0f, currentTrackMetadata, activeSession, whb1Var, this.e), x340Var), x340Var, 3072, 6);
        return rih1.a;
    }
}
