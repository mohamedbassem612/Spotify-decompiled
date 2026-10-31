package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hz2 extends a8d1 implements xu30 {
    public /* synthetic */ float a;
    public /* synthetic */ boolean b;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        hz2 hz2Var = new hz2(3, (lnm) obj3);
        hz2Var.a = fFloatValue;
        hz2Var.b = zBooleanValue;
        return hz2Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f = this.a;
        boolean z = this.b;
        hm5.M(obj);
        rin0 rin0Var = iz2.c;
        if (!z) {
            f = 1.7777778f;
        }
        return new rin0(rin0Var.a, rin0Var.b, rin0Var.c, new fxl(new exl(f)), rin0Var.e, rin0Var.f, rin0Var.g, rin0Var.h, rin0Var.i);
    }
}
