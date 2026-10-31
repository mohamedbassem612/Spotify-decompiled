package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y8b1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8b1(float f, long j, WidgetState.WrappedStory wrappedStory) {
        super(2);
        this.a = wrappedStory;
        this.b = j;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l6m1 l6m1Var = l6m1.STORY_SQUARE;
            WidgetState.WrappedStory wrappedStory = this.a;
            q6m1.b(l6m1Var, wrappedStory, x340Var2, 6);
            eqr0.a(eqr0.H(dm5.I(et40.a), 16.0f, 0.0f, 16.0f, 0.0f, 10), 0, 1, apo.r(-973540256, new x8b1(this.c, this.b, wrappedStory), x340Var2), x340Var2, 3072, 2);
            xpn1.j((gt40) null, x340Var2, 0);
            ueu.a(WidgetInteraction.WrappedVariant.STORY, wrappedStory.getDismissButtonText(), null, x340Var2, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
