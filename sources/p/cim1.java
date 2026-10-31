package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cim1 extends hab0 implements vu30 {
    public final /* synthetic */ l6m1 a;
    public final /* synthetic */ WidgetState.WrappedStory b;
    public final /* synthetic */ float c;
    public final /* synthetic */ kee1 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cim1(l6m1 l6m1Var, WidgetState.WrappedStory wrappedStory, float f, kee1 kee1Var, int i, float f2) {
        super(2);
        this.a = l6m1Var;
        this.b = wrappedStory;
        this.c = f;
        this.d = kee1Var;
        this.e = i;
        this.f = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l6m1 l6m1Var = this.a;
            WidgetState.WrappedStory wrappedStory = this.b;
            q6m1.b(l6m1Var, wrappedStory, x340Var2, 0);
            eqr0.a(dm5.I(et40.a), 0, 1, apo.r(1072764711, new bim1(this.c, wrappedStory, this.d, this.e, this.f), x340Var2), x340Var2, 3072, 2);
            xpn1.j((gt40) null, x340Var2, 0);
            ueu.a(WidgetInteraction.WrappedVariant.STORY, wrappedStory.getDismissButtonText(), null, x340Var2, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
