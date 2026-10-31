package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fvh extends hab0 implements xu30 {
    public final /* synthetic */ CurrentTrackMetadata a;
    public final /* synthetic */ float b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvh(CurrentTrackMetadata currentTrackMetadata, float f, WidgetState.ActiveSession activeSession, boolean z) {
        super(3);
        this.a = currentTrackMetadata;
        this.b = f;
        this.c = activeSession;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        String str = (String) x340Var.k(wol1.b);
        String str2 = (String) x340Var.k(wol1.c);
        String str3 = (String) x340Var.k(wol1.a);
        CurrentTrackMetadata currentTrackMetadata = this.a;
        whb1 whb1VarC = ivh.c(str, str2, str3, currentTrackMetadata.getUri());
        float f = this.b;
        et40 et40Var = et40.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, f);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = bmh.Y0;
            x340Var.s0(objT);
        }
        gt40 gt40VarX = iko1.x(gt40VarE0, (iu30) objT);
        String artwork = currentTrackMetadata.getArtwork();
        WidgetState.ActiveSession activeSession = this.c;
        poo1.a(artwork, gt40VarX, activeSession.getIsWorkProfile(), whb1VarC, (String) null, 1, x340Var, 24576, 0);
        j2h1.b(eqr0.H(dm5.I(ow31.a(et40Var)), 8.0f, 0.0f, 0.0f, 0.0f, 14), (ql3) null, apo.r(1720132212, new evh(this.b, this.a, activeSession, whb1VarC, this.d), x340Var), x340Var, 384, 2);
        return rih1.a;
    }
}
