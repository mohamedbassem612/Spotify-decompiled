package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ueh1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.Unauthenticated a;
    public final /* synthetic */ gt40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ueh1(WidgetState.Unauthenticated unauthenticated, gt40 gt40Var) {
        super(2);
        this.a = unauthenticated;
        this.b = gt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            afh1.b(this.a, this.b, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
