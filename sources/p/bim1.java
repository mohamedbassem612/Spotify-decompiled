package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bim1 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.WrappedStory b;
    public final /* synthetic */ kee1 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bim1(float f, WidgetState.WrappedStory wrappedStory, kee1 kee1Var, int i, float f2) {
        super(3);
        this.a = f;
        this.b = wrappedStory;
        this.c = kee1Var;
        this.d = i;
        this.e = f2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        fc11.g(dm5.Q(et40Var, 48.0f), x340Var, 0);
        eqr0.a(obh.a(dm5.h0(et40Var, this.a)), 1, 1, apo.r(1607110813, new aim1(this.b, this.c, this.d, this.e), x340Var), x340Var, 3072, 0);
        x340 x340Var2 = x340Var;
        fc11.g(dm5.Q(et40Var, 24.0f + ((p3v) x340Var2.k(s4k.a)).a), x340Var2, 0);
        return rih1.a;
    }
}
