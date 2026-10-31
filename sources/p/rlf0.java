package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rlf0 extends hab0 implements xu30 {
    public final /* synthetic */ bmf0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlf0(bmf0 bmf0Var, ven0 ven0Var, boolean z, float f, Function0 function0, boolean z2, boolean z3) {
        super(3);
        this.a = bmf0Var;
        this.b = ven0Var;
        this.c = z;
        this.d = f;
        this.e = function0;
        this.f = z2;
        this.g = z3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (zBooleanValue) {
            x340Var2.i0(-1694252794);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            kiv kivVar = t4k.n;
            bmf0 bmf0Var = this.a;
            mod.b(kivVar.a(bmf0Var.f), apo.r(1444457910, new c360(this.c, ven0Var, bmf0Var, this.d, this.e, this.f), x340Var2), x340Var2, 56);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1693224400);
            wlf0.c((bmf0) this.b.getValue(), this.c, this.d, this.e, this.f, this.g, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }
}
