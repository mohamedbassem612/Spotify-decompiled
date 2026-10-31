package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dim1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedStory a;
    public final /* synthetic */ whb1 b;
    public final /* synthetic */ kee1 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ float e;
    public final /* synthetic */ l6m1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ short i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dim1(WidgetState.WrappedStory wrappedStory, whb1 whb1Var, kee1 kee1Var, int i, float f, l6m1 l6m1Var, String str, int i2, int i3) {
        super(2);
        this.a = wrappedStory;
        this.b = whb1Var;
        this.c = kee1Var;
        this.d = i;
        this.e = f;
        this.f = l6m1Var;
        this.g = str;
        this.h = i2;
        this.i = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        eim1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
