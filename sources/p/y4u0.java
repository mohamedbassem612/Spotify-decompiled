package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4u0 extends a8d1 implements dv30 {
    public /* synthetic */ xzc0 a;
    public /* synthetic */ w4u0 b;
    public /* synthetic */ Set c;
    public /* synthetic */ u4u0 d;
    public /* synthetic */ src0 e;

    public y4u0(lnm lnmVar) {
        super(6, lnmVar);
    }

    @Override // p.dv30
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        y4u0 y4u0Var = new y4u0((lnm) obj6);
        y4u0Var.a = (xzc0) obj;
        y4u0Var.b = (w4u0) obj2;
        y4u0Var.c = (Set) obj3;
        y4u0Var.d = (u4u0) obj4;
        y4u0Var.e = (src0) obj5;
        return y4u0Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        xzc0 xzc0Var = this.a;
        w4u0 w4u0Var = this.b;
        Set set = this.c;
        u4u0 u4u0Var = this.d;
        src0 src0Var = this.e;
        hm5.M(obj);
        return new v4u0(u4u0Var, xzc0Var, set, w4u0Var, src0Var);
    }
}
