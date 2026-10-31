package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h9b1 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9b1(WidgetState.WrappedStory wrappedStory) {
        super(3);
        this.a = wrappedStory;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        fc11.g(obh.a(et40Var), x340Var, 0);
        WidgetState.WrappedStory wrappedStory = this.a;
        o4p1.g(wrappedStory.getTitleSmall(), (gt40) null, fim1.d, 2, x340Var, 3072, 2);
        fc11.g(dm5.Q(et40Var, 8.0f), x340Var, 0);
        l6m1 l6m1Var = l6m1.STORY_SQUARE_TALL;
        x340 x340Var2 = x340Var;
        q6m1.d(wrappedStory, vy9.a(l6m1Var.a, ((s3v) x340Var2.k(p4k.a)).a), x340Var2, 0);
        fc11.g(dm5.Q(et40Var, 32.0f), x340Var2, 0);
        y9g1.a(wrappedStory.getButtonText(), (gt40) null, fim1.g, 0.0f, x340Var2, 0, 10);
        return rih1.a;
    }
}
