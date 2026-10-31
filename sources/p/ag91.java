package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ag91 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag91(WidgetState.WrappedStory wrappedStory, float f) {
        super(2);
        this.a = wrappedStory;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l6m1 l6m1Var = l6m1.STORY_SMALL;
            WidgetState.WrappedStory wrappedStory = this.a;
            q6m1.b(l6m1Var, wrappedStory, x340Var2, 6);
            j2h1.b(eqr0.H(dm5.I(et40.a), 0.0f, 32.0f, 0.0f, 12.0f, 5), ql3.f, apo.r(4713076, new zf91(wrappedStory, this.b), x340Var2), x340Var2, 384, 0);
            xpn1.j((gt40) null, x340Var2, 0);
            ueu.a(WidgetInteraction.WrappedVariant.STORY, wrappedStory.getDismissButtonText(), null, x340Var2, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
