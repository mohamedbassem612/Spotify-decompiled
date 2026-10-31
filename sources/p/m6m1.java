package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m6m1 extends hab0 implements vu30 {
    public final /* synthetic */ l6m1 a;
    public final /* synthetic */ WidgetState.WrappedStory b;
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m6m1(l6m1 l6m1Var, WidgetState.WrappedStory wrappedStory, int i) {
        super(2);
        this.a = l6m1Var;
        this.b = wrappedStory;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        q6m1.b(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
