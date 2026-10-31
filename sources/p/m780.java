package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m780 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.InactiveSession a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ c380 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m780(WidgetState.InactiveSession inactiveSession, float f, float f2, float f3, boolean z, float f4, c380 c380Var) {
        super(2);
        this.a = inactiveSession;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = f4;
        this.g = c380Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState.InactiveSession inactiveSession = this.a;
            ui90 ui90Var = new ui90(inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage());
            float f = 2.0f * this.c;
            float f2 = this.b;
            float f3 = this.d;
            float f4 = (f2 - f) - f3;
            if (this.e) {
                x340Var2.i0(-1402876839);
            } else {
                x340Var2.i0(1340220815);
                zBooleanValue = ((Boolean) x340Var2.k(r4k.c)).booleanValue();
            }
            x340Var2.r(false);
            boolean z = zBooleanValue;
            y3o1.g(this.g, ui90Var, this.f, f4, dm5.Q(dm5.h0(et40.a, this.f), f2 - f3), false, z, inactiveSession.getIsWorkProfile(), (fg50) null, x340Var2, 0, 672);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
