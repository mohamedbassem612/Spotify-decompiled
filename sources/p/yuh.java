package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yuh extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ whb1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CurrentTrackMetadata d;
    public final /* synthetic */ float e;
    public final /* synthetic */ WidgetState.ActiveSession f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuh(float f, whb1 whb1Var, boolean z, CurrentTrackMetadata currentTrackMetadata, float f2, WidgetState.ActiveSession activeSession) {
        super(3);
        this.a = f;
        this.b = whb1Var;
        this.c = z;
        this.d = currentTrackMetadata;
        this.e = f2;
        this.f = activeSession;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        float f = this.a;
        float fMax = Math.max(48.0f, f);
        et40 et40Var = et40.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, fMax);
        whb1 whb1Var = this.b;
        gt40 gt40VarL = d9y0.l(gt40VarE0, whb1Var);
        CurrentTrackMetadata currentTrackMetadata = this.d;
        WidgetState.ActiveSession activeSession = this.f;
        j2h1.b(gt40VarL, ql3.g, apo.r(-1597799388, new xuh(f, currentTrackMetadata, activeSession), x340Var), x340Var, 384, 0);
        if (this.c) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(856719512);
            f5p1.h(currentTrackMetadata.getTitle(), currentTrackMetadata.getSubtitle(), whb1Var, eqr0.H(ow31.a(et40Var), 8.0f, 0.0f, 0.0f, 0.0f, 14), nee1.a, nee1.b, (String) null, (String) null, 0, x340Var2, 0, 448);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(857013981);
            fc11.g(ow31.a(et40Var), x340Var3, 0);
            x340Var3.r(false);
        }
        if (p3v.b(this.e, 0.0f) > 0) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(857129425);
            gt40 gt40VarH = eqr0.H(et40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z = activeSession.getContentType() == WidgetState.ContentType.TALK;
            float f2 = this.e;
            rau0.c(activeSession, z, f2, gt40VarH, f2, 0.0f, 0.0f, 0.0f, 0.0f, x340Var4, 0, 992);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(857422716);
            x340Var5.r(false);
        }
        cxm.g((gt40) null, 48.0f, 12.0f, 2, x340Var, 3120, 1);
        return rih1.a;
    }
}
