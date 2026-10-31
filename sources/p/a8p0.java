package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a8p0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;
    public final /* synthetic */ whb1 d;
    public final /* synthetic */ kee1 e;
    public final /* synthetic */ kee1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8p0(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, kee1 kee1Var, kee1 kee1Var2) {
        super(3);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
        this.d = whb1Var;
        this.e = kee1Var;
        this.f = kee1Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        float f = this.a;
        et40 et40Var = et40.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, f);
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = pzo0.X;
            x340Var.s0(objT);
        }
        gt40 gt40VarX = iko1.x(gt40VarE0, (iu30) objT);
        CurrentTrackMetadata currentTrackMetadata = this.b;
        String artwork = currentTrackMetadata.getArtwork();
        boolean isWorkProfile = this.c.getIsWorkProfile();
        whb1 whb1Var = this.d;
        poo1.a(artwork, gt40VarX, isWorkProfile, whb1Var, (String) null, 1, x340Var, 24576, 0);
        f5p1.h(currentTrackMetadata.getTitle(), currentTrackMetadata.getSubtitle(), whb1Var, eqr0.H(ow31.a(et40Var), 16.0f, 0.0f, 0.0f, 0.0f, 14), this.e, this.f, (String) null, (String) null, 0, x340Var, 0, 448);
        cxm.g((gt40) null, 0.0f, 0.0f, 0, x340Var, 0, 15);
        return rih1.a;
    }
}
