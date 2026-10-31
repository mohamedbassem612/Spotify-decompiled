package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bau0 extends hab0 implements xu30 {
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
    public bau0(gt40 gt40Var, boolean z, boolean z2, j2i j2iVar, WidgetState.ActiveSession activeSession, long j, float f, float f2, j2i j2iVar2) {
        super(3);
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

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        gt40 gt40VarC = ow31.a(et40.a).c(this.a);
        boolean z = this.c;
        boolean z2 = this.b;
        boolean z3 = z2 && z;
        ql3 ql3Var = ql3.g;
        if (z2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1419060477);
            j2h1.b(gt40VarC, z3 ? ql3.f : ql3Var, apo.r(-1452639477, new j2r0(this.d, (byte) 2), x340Var2), x340Var2, 384, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1419245950);
            x340Var3.r(false);
        }
        j2h1.b(gt40VarC, ql3Var, apo.r(-727722810, new aau0(this.e, this.f, this.g, this.h), x340Var), x340Var, 384, 0);
        if (z) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1419625793);
            if (z3) {
                ql3Var = ql3.h;
            }
            j2h1.b(gt40VarC, ql3Var, apo.r(1041980596, new j2r0(this.i, (byte) 3), x340Var4), x340Var4, 384, 0);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1419807422);
            x340Var5.r(false);
        }
        return rih1.a;
    }
}
