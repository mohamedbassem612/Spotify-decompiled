package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class otb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lub b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otb(lub lubVar, byte b) {
        super(0);
        this.a = b;
        this.b = lubVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lub lubVar = this.b;
        switch (b) {
            case 0:
                mub mubVar = lubVar.a;
                t480 t480Var = lubVar.f;
                if (t480Var != null) {
                    mubVar.b.o(t480Var, mub.d);
                }
                lubVar.f = null;
                return rih1Var;
            case 1:
                hp80 hp80Var = lubVar.b;
                String strA = lubVar.a();
                if (strA != null) {
                    mub mubVar2 = lubVar.a;
                    uba ubaVar = mubVar2.b;
                    opl0 opl0VarA = mubVar2.a(strA, hp80Var);
                    if (nub.a[l1d.C(1)] != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC = opl0VarA.c.c();
                    x6h1VarC.i.add(new a7h1("icon_button", "receipt", (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = opl0VarA.b;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    lubVar.g = ubaVar.p(k7h1Var.a(), mub.d);
                }
                return rih1Var;
            case 2:
                mub mubVar3 = lubVar.a;
                t480 t480Var2 = lubVar.g;
                if (t480Var2 != null) {
                    mubVar3.b.o(t480Var2, mub.d);
                }
                lubVar.g = null;
                return rih1Var;
            case 3:
                mub mubVar4 = lubVar.a;
                t480 t480Var3 = lubVar.d;
                if (t480Var3 != null) {
                    mubVar4.b.o(t480Var3, mub.d);
                }
                lubVar.d = null;
                return rih1Var;
            case 4:
                hp80 hp80Var2 = lubVar.b;
                String strA2 = lubVar.a();
                if (strA2 != null) {
                    mub mubVar5 = lubVar.a;
                    uba ubaVar2 = mubVar5.b;
                    opl0 opl0VarA2 = mubVar5.a(strA2, hp80Var2);
                    x6h1 x6h1VarC2 = opl0VarA2.c.c();
                    x6h1VarC2.i.add(new a7h1("nudge_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).b = opl0VarA2.b;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    lubVar.e = ubaVar2.p(k7h1Var2.a(), mub.d);
                }
                return rih1Var;
            default:
                mub mubVar6 = lubVar.a;
                t480 t480Var4 = lubVar.e;
                if (t480Var4 != null) {
                    mubVar6.b.o(t480Var4, mub.d);
                }
                lubVar.e = null;
                return rih1Var;
        }
    }
}
