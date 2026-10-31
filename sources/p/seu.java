package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class seu extends hab0 implements vu30 {
    public final /* synthetic */ WidgetInteraction.WrappedVariant a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gt40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seu(WidgetInteraction.WrappedVariant wrappedVariant, String str, gt40 gt40Var, int i) {
        super(2);
        this.a = wrappedVariant;
        this.b = str;
        this.c = gt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(7);
        ueu.a(this.a, this.b, this.c, (b0k) obj, iP);
        return rih1.a;
    }
}
