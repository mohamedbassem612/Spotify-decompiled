package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hdf1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdf1(boolean z, boolean z2, boolean z3, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(2, lnmVar);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = ven0Var4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new hdf1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        hdf1 hdf1VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        hdf1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        ven0 ven0Var = this.d;
        d3k d3kVar = (d3k) ven0Var.getValue();
        rih1 rih1Var = rih1.a;
        if (d3kVar == null && !this.a) {
            cjj1 cjj1Var = (cjj1) this.e.getValue();
            boolean z = cjj1Var instanceof yij1;
            d3k d3kVar2 = d3k.c;
            if (z) {
                ven0Var.setValue(d3kVar2);
                return rih1Var;
            }
            if (cjj1Var instanceof bjj1) {
                if (!this.b) {
                    ven0 ven0Var2 = this.f;
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        ven0Var.setValue(d3kVar2);
                        return rih1Var;
                    }
                    ven0Var2.setValue(Boolean.TRUE);
                    ((Function0) this.g.getValue()).invoke();
                    return rih1Var;
                }
            } else if (u890.j(cjj1Var, xij1.a) && this.c) {
                ven0Var.setValue(d3kVar2);
            }
        }
        return rih1Var;
    }
}
