package p;

import androidx.xr.projected.permissions.RequestPermissionsOnHostActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uxb implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uxb(RequestPermissionsOnHostActivity requestPermissionsOnHostActivity, String str, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        this.b = requestPermissionsOnHostActivity;
        this.d = str;
        this.c = function0;
        this.e = function1;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                t890.b((j2i) obj6, (j2i) obj5, (j2i) obj4, this.c, (vy71) obj3, (b0k) obj, czo1.p(3505));
                return rih1Var;
            case 1:
                qim0 qim0Var = (qim0) obj5;
                ven0 ven0Var = (ven0) obj4;
                j2i j2iVar = (j2i) obj6;
                gea geaVar = (gea) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = new g45(ven0Var, (byte) 6);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    j2iVar.invoke(x340Var2, 0);
                    geaVar.b(this.c, x340Var2, 6);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Integer) obj2).getClass();
                int i = RequestPermissionsOnHostActivity.i1;
                ((RequestPermissionsOnHostActivity) obj6).l0(czo1.p(1), (String) obj5, this.c, (Function0) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
        }
    }

    public /* synthetic */ uxb(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, Function0 function0, vy71 vy71Var, int i) {
        this.b = j2iVar;
        this.d = j2iVar2;
        this.e = j2iVar3;
        this.c = function0;
        this.f = vy71Var;
    }

    public /* synthetic */ uxb(qim0 qim0Var, ven0 ven0Var, j2i j2iVar, gea geaVar, Function0 function0) {
        this.d = qim0Var;
        this.e = ven0Var;
        this.b = j2iVar;
        this.f = geaVar;
        this.c = function0;
    }
}
