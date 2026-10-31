package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m8p0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, boolean z) {
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
            objT = pzo0.Z;
            x340Var.s0(objT);
        }
        gt40 gt40VarX = iko1.x(gt40VarE0, (iu30) objT);
        String artwork = this.b.getArtwork();
        WidgetState.ActiveSession activeSession = this.c;
        poo1.a(artwork, gt40VarX, activeSession.getIsWorkProfile(), this.d, (String) null, 1, x340Var, 24576, 0);
        float fB = (s3v.b(((s3v) x340Var.k(p4k.a)).a) - f) - 48.0f;
        if (p3v.b(fB, 96.0f) >= 0) {
            x340Var.i0(517921045);
            fc11.g(dm5.h0(et40Var, 16.0f), x340Var, 0);
            rau0.c(activeSession, this.e, fB, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, x340Var, 0, 1016);
            x340Var.r(false);
        } else {
            x340Var.i0(518154568);
            x340Var.r(false);
        }
        return rih1.a;
    }
}
