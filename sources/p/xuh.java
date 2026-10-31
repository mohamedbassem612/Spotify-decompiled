package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xuh extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ WidgetState.ActiveSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuh(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = activeSession;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            gt40 gt40VarE0 = dm5.e0(et40.a, this.a);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = bmh.X0;
                x340Var2.s0(objT);
            }
            poo1.a(this.b.getArtwork(), iko1.x(gt40VarE0, (iu30) objT), this.c.getIsWorkProfile(), (q10) null, (String) null, 1, x340Var2, 0, 24);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
