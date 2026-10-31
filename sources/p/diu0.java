package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class diu0 extends hab0 implements xu30 {
    public final /* synthetic */ bzg a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ Integer i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diu0(bzg bzgVar, ven0 ven0Var, ven0 ven0Var2, List list, List list2, boolean z, boolean z2, iu30 iu30Var, Integer num) {
        super(3);
        this.a = bzgVar;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
        this.h = iu30Var;
        this.i = num;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (p3v.b(i2cVar.c(), giu0.c) >= 0) {
            bzg bzgVar = this.a;
            w2g0.c(d7e.r(1.21875f, u291.f(u291.i(nim0.a, bzgVar.a, bzgVar.b), 1.0f), true), (tl3) null, apo.r(1582906932, new ciu0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i), x340Var2), x340Var2, 3072, 6);
        }
        return rih1.a;
    }
}
