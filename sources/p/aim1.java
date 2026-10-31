package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aim1 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ kee1 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aim1(WidgetState.WrappedStory wrappedStory, kee1 kee1Var, int i, float f) {
        super(3);
        this.a = wrappedStory;
        this.b = kee1Var;
        this.c = i;
        this.d = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        WidgetState.WrappedStory wrappedStory = this.a;
        o4p1.g(wrappedStory.getTitle(), (gt40) null, this.b, this.c, b0kVar, 0, 2);
        o4p1.g(wrappedStory.getSubtitle(), (gt40) null, fim1.e, 2, b0kVar, 3072, 2);
        fc11.g(dm5.Q(et40.a, this.d), b0kVar, 0);
        y9g1.a(wrappedStory.getButtonText(), (gt40) null, fim1.g, 0.0f, b0kVar, 0, 10);
        return rih1.a;
    }
}
