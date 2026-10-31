package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cau0 extends hab0 implements vu30 {
    public final /* synthetic */ gt40 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ WidgetState.ActiveSession e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ j2i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cau0(gt40 gt40Var, boolean z, boolean z2, j2i j2iVar, WidgetState.ActiveSession activeSession, long j, float f, float f2, j2i j2iVar2) {
        super(2);
        this.a = gt40Var;
        this.b = z;
        this.c = z2;
        this.d = j2iVar;
        this.e = activeSession;
        this.f = j;
        this.g = f;
        this.h = f2;
        this.i = j2iVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            jch0.f(dm5.J(et40.a), 1, apo.r(-106493980, new bau0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i), x340Var2), x340Var2, 3072, 2);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
