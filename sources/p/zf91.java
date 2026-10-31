package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zf91 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf91(WidgetState.WrappedStory wrappedStory, float f) {
        super(2);
        this.a = wrappedStory;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            o4p1.g(this.a.getTitle(), dm5.h0(eqr0.H(et40.a, 12.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f + this.b), fim1.c, 2, x340Var2, 3072, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
