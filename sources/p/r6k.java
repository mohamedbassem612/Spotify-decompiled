package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6k extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(String str, uoa uoaVar, Function0 function0, iu30 iu30Var, iu30 iu30Var2, dr41 dr41Var, Function0 function1, cg0 cg0Var, yt91 yt91Var, Function0 function2, Function0 function3, int i) {
        super(2);
        this.d = str;
        this.e = uoaVar;
        this.f = function0;
        this.X = iu30Var;
        this.Y = iu30Var2;
        this.t = dr41Var;
        this.g = function1;
        this.b = cg0Var;
        this.c = yt91Var;
        this.h = function2;
        this.i = function3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    /* JADX WARN: Code duplicated, block: B:12:0x008c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0110  */
    /* JADX WARN: Code duplicated, block: B:19:0x0166  */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        x340 x340Var;
        ihl ihlVarK;
        Object objT;
        m4c m4cVar;
        boolean zG;
        Object objT2;
        byte b = this.a;
        Object obj3 = this.g;
        Object obj4 = this.b;
        Object obj5 = this.X;
        Object obj6 = this.f;
        Object obj7 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj8 = this.Y;
        Object obj9 = this.c;
        Object obj10 = this.i;
        Object obj11 = this.h;
        Object obj12 = this.e;
        Object obj13 = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                w6k.b((a9k) obj7, (yqg) obj12, (Function0) obj6, (Function0) obj3, (Function0) obj11, (Function0) obj10, (iu30) obj5, (Function0) obj13, (qim0) obj4, (iu30) obj8, (vu30) obj9, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                mmo1.l((ArrayList) obj7, (cmt) obj12, (String) obj6, (String) obj3, (String) obj11, (String) obj10, (ijp) obj13, (jjp) obj5, (kjp) obj8, (qim0) obj4, (vu30) obj9, (b0k) obj, czo1.p(1));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                Function0 function0 = (Function0) obj6;
                iu30 iu30Var = (iu30) obj5;
                ven0 ven0Var = (ven0) obj12;
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var3.b0();
                } else {
                    boolean zG2 = x340Var3.g(iu30Var) | x340Var3.g(function0);
                    ven0 ven0Var2 = (ven0) obj13;
                    Object objT3 = x340Var3.T();
                    if (zG2 || objT3 == m4cVar2) {
                        objT3 = new qih(iu30Var, function0, ven0Var2);
                        x340Var3.s0(objT3);
                    }
                    scx scxVar = (scx) obj7;
                    x74.f((Function0) objT3, scxVar, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, apo.r(-599607059, new ta5(obj3, (Object) scxVar, obj11, obj8, (Object) arrayList, obj9, obj13, (byte) 27), x340Var3), apo.r(-1666552456, new jb1((tm21) obj8, arrayList, (y7e1) obj9, (Function0) obj10, (ven0) obj12, (byte) 17), x340Var3), x340Var3, 12607488, 54, 876);
                    if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var3.i0(-1840982037);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(-1841061800);
                        boolean zG3 = x340Var3.g(ven0Var);
                        Object objT4 = x340Var3.T();
                        if (zG3 || objT4 == m4cVar2) {
                            objT4 = new c470(ven0Var, (byte) 15);
                            x340Var3.s0(objT4);
                        }
                        exd0.g((Function0) objT4, x340Var3, 0);
                        x340Var3.r(false);
                    }
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                vvm1.m((String) obj7, (uoa) obj12, (Function0) obj6, (iu30) obj5, (iu30) obj8, (dr41) obj13, (Function0) obj3, (cg0) obj4, (yt91) obj9, (Function0) obj11, (Function0) obj10, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var4 = (b0k) obj;
                c380 c380Var = (c380) obj13;
                xhl xhlVar = (xhl) obj12;
                if ((((Number) obj2).intValue() & 11) != 2) {
                    ((ven0) obj7).setValue(rih1Var);
                    i = ((uhl) xhlVar).b;
                    xhlVar.m();
                    x340Var = x340Var4;
                    x340Var.i0(456275249);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    xhl xhlVar2 = (xhl) xhlVar.l().b;
                    ihl ihlVarK2 = xhlVar2.k();
                    ihl ihlVarK3 = xhlVar2.k();
                    ihl ihlVarK4 = xhlVar2.k();
                    ihlVarK = xhlVar2.k();
                    ihl ihlVarK5 = xhlVar2.k();
                    Integer num = (Integer) obj11;
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = vxd1.e;
                        x340Var.s0(objT);
                    }
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK2, (iu30) objT);
                    u1p1.t(x340Var);
                    u1p1.t(x340Var);
                    u1p1.e(num, uyn1.x(u291.a(qim0VarJ, 48.0f, 48.0f), 12.0f), x340Var, 0);
                    gfx.b(u1p1.E((m5a) obj10), apo.r(59115883, new fdo0((m5a) obj10, (Function0) obj6, xhlVar, ihlVarK3, ihlVarK4, (String) obj5, (vu30) obj9, ihlVarK, (Integer) obj11, ihlVarK2, (String) obj8, (vu30) obj4, ihlVarK5), x340Var), x340Var, 48);
                    zG = x340Var.g(c380Var) | x340Var.i(ihlVarK) | x340Var.d(12.0f) | x340Var.d(8.0f);
                    objT2 = x340Var.T();
                    if (zG) {
                        objT2 = new cmd1(c380Var, ihlVarK, (byte) 7);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new cmd1(c380Var, ihlVarK, (byte) 7);
                        x340Var.s0(objT2);
                    }
                    k5p1.d(uyn1.z(12.0f, 0.0f, 2, u291.f(xhl.j(nim0Var, ihlVarK5, (iu30) objT2), 1.0f)), new d36(16.0f, true, new g21(een.Q0, (byte) 29)), (g36) null, (pl3) null, 0, 0, apo.r(-783993029, new ql50(c380Var, (byte) 6), x340Var), x340Var, 1572864, 60);
                    x340Var.r(false);
                    if (((uhl) xhlVar).b != i) {
                        qxd0.S((su) obj3, x340Var);
                    }
                } else {
                    x340 x340Var5 = x340Var4;
                    if (!x340Var5.H()) {
                        ((ven0) obj7).setValue(rih1Var);
                        i = ((uhl) xhlVar).b;
                        xhlVar.m();
                        x340Var = x340Var4;
                        x340Var.i0(456275249);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        xhl xhlVar3 = (xhl) xhlVar.l().b;
                        ihl ihlVarK6 = xhlVar3.k();
                        ihl ihlVarK7 = xhlVar3.k();
                        ihl ihlVarK8 = xhlVar3.k();
                        ihlVarK = xhlVar3.k();
                        ihl ihlVarK9 = xhlVar3.k();
                        Integer num2 = (Integer) obj11;
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = vxd1.e;
                            x340Var.s0(objT);
                        }
                        nim0 nim0Var2 = nim0.a;
                        qim0 qim0VarJ2 = xhl.j(nim0Var2, ihlVarK6, (iu30) objT);
                        u1p1.t(x340Var);
                        u1p1.t(x340Var);
                        u1p1.e(num2, uyn1.x(u291.a(qim0VarJ2, 48.0f, 48.0f), 12.0f), x340Var, 0);
                        gfx.b(u1p1.E((m5a) obj10), apo.r(59115883, new fdo0((m5a) obj10, (Function0) obj6, xhlVar, ihlVarK7, ihlVarK8, (String) obj5, (vu30) obj9, ihlVarK, (Integer) obj11, ihlVarK6, (String) obj8, (vu30) obj4, ihlVarK9), x340Var), x340Var, 48);
                        zG = x340Var.g(c380Var) | x340Var.i(ihlVarK) | x340Var.d(12.0f) | x340Var.d(8.0f);
                        objT2 = x340Var.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new cmd1(c380Var, ihlVarK, (byte) 7);
                            x340Var.s0(objT2);
                        }
                        k5p1.d(uyn1.z(12.0f, 0.0f, 2, u291.f(xhl.j(nim0Var2, ihlVarK9, (iu30) objT2), 1.0f)), new d36(16.0f, true, new g21(een.Q0, (byte) 29)), (g36) null, (pl3) null, 0, 0, apo.r(-783993029, new ql50(c380Var, (byte) 6), x340Var), x340Var, 1572864, 60);
                        x340Var.r(false);
                        if (((uhl) xhlVar).b != i) {
                            qxd0.S((su) obj3, x340Var);
                        }
                    } else {
                        x340Var5.b0();
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(ArrayList arrayList, cmt cmtVar, String str, String str2, String str3, String str4, ijp ijpVar, jjp jjpVar, kjp kjpVar, qim0 qim0Var, vu30 vu30Var, int i) {
        super(2);
        this.d = arrayList;
        this.e = cmtVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.t = ijpVar;
        this.X = jjpVar;
        this.Y = kjpVar;
        this.b = qim0Var;
        this.c = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(a9k a9kVar, yqg yqgVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, qim0 qim0Var, iu30 iu30Var2, vu30 vu30Var, int i) {
        super(2);
        this.d = a9kVar;
        this.e = yqgVar;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.X = iu30Var;
        this.t = function4;
        this.b = qim0Var;
        this.Y = iu30Var2;
        this.c = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(iu30 iu30Var, Function0 function0, scx scxVar, ven0 ven0Var, ven0 ven0Var2, Function0 function1, Function0 function2, tm21 tm21Var, ArrayList arrayList, y7e1 y7e1Var, Function0 function3) {
        super(2);
        this.X = iu30Var;
        this.f = function0;
        this.d = scxVar;
        this.e = ven0Var;
        this.t = ven0Var2;
        this.g = function1;
        this.h = function2;
        this.Y = tm21Var;
        this.b = arrayList;
        this.c = y7e1Var;
        this.i = function3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(ven0 ven0Var, xhl xhlVar, su suVar, Integer num, m5a m5aVar, c380 c380Var, Function0 function0, String str, vu30 vu30Var, String str2, vu30 vu30Var2) {
        super(2);
        this.d = ven0Var;
        this.e = xhlVar;
        this.g = suVar;
        this.h = num;
        this.i = m5aVar;
        this.t = c380Var;
        this.f = function0;
        this.X = str;
        this.c = vu30Var;
        this.Y = str2;
        this.b = vu30Var2;
    }
}
