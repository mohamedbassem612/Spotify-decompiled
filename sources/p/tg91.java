package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tg91 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.PlayPauseState a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cz31 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg91(WidgetState.PlayPauseState playPauseState, long j, cz31 cz31Var, boolean z) {
        super(2);
        this.a = playPauseState;
        this.b = j;
        this.c = cz31Var;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState.PlayPauseState playPauseState = this.a;
            int iH = rau0.h(playPauseState);
            String strG = rau0.g((Context) x340Var2.k(p4k.b), playPauseState);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = fe91.f;
                x340Var2.s0(objT);
            }
            czo1.c(iH, this.b, strG, this.c, iko1.x(et40.a, (iu30) objT), 0L, this.d, 40.0f, 0.0f, 0, x340Var2, 12582912, 544);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
