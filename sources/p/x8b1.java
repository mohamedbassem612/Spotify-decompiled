package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x8b1 extends hab0 implements xu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ WidgetState.WrappedStory c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8b1(float f, long j, WidgetState.WrappedStory wrappedStory) {
        super(3);
        this.a = j;
        this.b = f;
        this.c = wrappedStory;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        gt40 gt40VarJ = dm5.J(et40Var);
        float fA = s3v.a(this.a);
        float f = this.b;
        gt40 gt40VarQ = dm5.Q(gt40VarJ, (fA - (81.0f * f)) - 8.0f);
        WidgetState.WrappedStory wrappedStory = this.c;
        j2h1.b(gt40VarQ, ql3.j, apo.r(-666773442, new w8b1(wrappedStory), b0kVar), b0kVar, 384, 0);
        fc11.g(dm5.Q(et40Var, 8.0f), b0kVar, 0);
        q6m1.d(wrappedStory, f, b0kVar, 0);
        return rih1.a;
    }
}
