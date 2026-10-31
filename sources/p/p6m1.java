package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p6m1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6m1(WidgetState.WrappedStory wrappedStory, float f, int i) {
        super(2);
        this.a = wrappedStory;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        q6m1.d(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
