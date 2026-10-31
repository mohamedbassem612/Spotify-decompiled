package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class evh extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ whb1 c;
    public final /* synthetic */ WidgetState.ActiveSession d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evh(float f, CurrentTrackMetadata currentTrackMetadata, WidgetState.ActiveSession activeSession, whb1 whb1Var, boolean z) {
        super(2);
        this.a = f;
        this.b = currentTrackMetadata;
        this.c = whb1Var;
        this.d = activeSession;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            et40 et40Var = et40.a;
            jch0.f(dm5.J(et40Var), 0, apo.r(-526339952, new cvh(this.b, this.c, (byte) 0), x340Var2), x340Var2, 3072, 2);
            j2h1.b(dm5.I(et40Var), ql3.i, apo.r(-900019242, new dvh(this.d, this.e, ((s3v.b(((s3v) x340Var2.k(p4k.a)).a) - this.a) - 16.0f) - 8.0f), x340Var2), x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
