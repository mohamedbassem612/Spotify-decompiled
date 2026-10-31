package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d8p0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.ActiveSession b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8p0(float f, WidgetState.ActiveSession activeSession, boolean z, float f2) {
        super(2);
        this.a = f;
        this.b = activeSession;
        this.c = z;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            jch0.f((gt40) null, 0, apo.r(-1609798884, new c8p0(this.a, this.b, this.c, this.d), x340Var2), x340Var2, 3072, 7);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
