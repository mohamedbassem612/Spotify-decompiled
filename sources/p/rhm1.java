package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rhm1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ gt40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhm1(WidgetState.WrappedStory wrappedStory, gt40 gt40Var, int i) {
        super(2);
        j2i j2iVar = nki.a;
        this.a = wrappedStory;
        this.b = gt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j2i j2iVar = nki.a;
        int iP = czo1.p(385);
        thm1.a(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
