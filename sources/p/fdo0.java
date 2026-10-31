package p;

import android.view.ViewGroup;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fdo0 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdo0(m5a m5aVar, Function0 function0, xhl xhlVar, ihl ihlVar, ihl ihlVar2, String str, vu30 vu30Var, ihl ihlVar3, Integer num, ihl ihlVar4, String str2, vu30 vu30Var2, ihl ihlVar5) {
        super(2);
        this.d = m5aVar;
        this.b = function0;
        this.e = xhlVar;
        this.f = ihlVar;
        this.g = ihlVar2;
        this.h = str;
        this.c = vu30Var;
        this.i = ihlVar3;
        this.t = num;
        this.X = ihlVar4;
        this.Y = str2;
        this.Z = vu30Var2;
        this.N0 = ihlVar5;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        ihl ihlVar;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.i;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.N0;
        Object obj9 = this.d;
        Object obj10 = this.Z;
        Object obj11 = this.t;
        Object obj12 = this.Y;
        Object obj13 = this.c;
        Object obj14 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                r4o1.x((xm41) obj9, (xm41) obj7, (jxa) obj6, (kge) obj5, (mr20) obj14, (ViewGroup) obj4, this.b, (LinkedHashSet) obj12, (vxf0) obj10, (vu30) obj13, (Function0) obj11, (iu30) obj8, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ihl ihlVar2 = (ihl) obj8;
                vu30 vu30Var = (vu30) obj10;
                String str = (String) obj12;
                ihl ihlVar3 = (ihl) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ihl ihlVar4 = (ihl) obj4;
                ihl ihlVar5 = (ihl) obj5;
                ihl ihlVar6 = (ihl) obj6;
                xhl xhlVar = (xhl) obj7;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (((m5a) obj9) instanceof j5a) {
                        x340Var2.i0(975792658);
                        j = ((u7h) x340Var2.k(qgx.a)).a;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(975794159);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var2).b.a;
                        x340Var2.r(false);
                    }
                    long j2 = j;
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = vxd1.f;
                        x340Var2.s0(objT);
                    }
                    xhlVar.getClass();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarJ = xhl.j(nim0Var, ihlVar6, (iu30) objT);
                    u1p1.t(x340Var2);
                    u1p1.t(x340Var2);
                    u1p1.d(this.b, j2, u291.a(qim0VarJ, 48.0f, 48.0f), x340Var2, 0);
                    boolean zG = x340Var2.g((String) obj14) | x340Var2.g((vu30) obj13) | x340Var2.d(12.0f) | x340Var2.i(ihlVar4) | x340Var2.g((Integer) obj11) | x340Var2.g(this.b) | x340Var2.i(ihlVar3) | x340Var2.i(ihlVar6);
                    String str2 = (String) obj14;
                    vu30 vu30Var2 = (vu30) obj13;
                    Integer num = (Integer) obj11;
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new z1(str2, vu30Var2, ihlVar4, num, this.b, ihlVar3, ihlVar6);
                        ihlVar = ihlVar4;
                        x340Var2.s0(objT2);
                    } else {
                        ihlVar = ihlVar4;
                    }
                    u1p1.g((String) obj14, (vu30) obj13, 3, u291.b(0.0f, u1p1.v(x340Var2), 1, xhl.j(nim0Var, ihlVar5, (iu30) objT2)), 0, (qx8) null, j2, x340Var2, 0, 48);
                    boolean zG2 = x340Var2.g(str) | x340Var2.g(vu30Var) | x340Var2.i(ihlVar5) | x340Var2.d(8.0f) | x340Var2.i(ihlVar2) | x340Var2.d(12.0f);
                    Object objT3 = x340Var2.T();
                    if (zG2 || objT3 == m4cVar) {
                        i = 2;
                        objT3 = new e971(str, vu30Var, ihlVar5, ihlVar2, (byte) 12);
                        x340Var2.s0(objT3);
                    } else {
                        i = 2;
                    }
                    u1p1.f((String) obj12, (vu30) obj10, uyn1.z(12.0f, 0.0f, i, u291.f(xhl.j(nim0Var, ihlVar, (iu30) objT3), 1.0f)), j2, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                wpb1.i((m4m1) obj9, (iu30) obj8, (iu30) obj7, (iu30) obj6, (iu30) obj5, (iu30) obj14, (iu30) obj4, this.b, (iu30) obj12, (Function0) obj11, (Function0) obj3, (Function0) obj10, (qim0) obj13, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdo0(xm41 xm41Var, xm41 xm41Var2, jxa jxaVar, kge kgeVar, mr20 mr20Var, ViewGroup viewGroup, Function0 function0, LinkedHashSet linkedHashSet, vxf0 vxf0Var, vu30 vu30Var, Function0 function1, iu30 iu30Var, Function0 function2, int i) {
        super(2);
        this.d = xm41Var;
        this.e = xm41Var2;
        this.f = jxaVar;
        this.g = kgeVar;
        this.h = mr20Var;
        this.i = viewGroup;
        this.b = function0;
        this.Y = linkedHashSet;
        this.Z = vxf0Var;
        this.c = vu30Var;
        this.t = function1;
        this.N0 = iu30Var;
        this.X = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdo0(m4m1 m4m1Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, Function0 function0, iu30 iu30Var7, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, int i) {
        super(2);
        this.d = m4m1Var;
        this.N0 = iu30Var;
        this.e = iu30Var2;
        this.f = iu30Var3;
        this.g = iu30Var4;
        this.h = iu30Var5;
        this.i = iu30Var6;
        this.b = function0;
        this.Y = iu30Var7;
        this.t = function1;
        this.X = function2;
        this.Z = function3;
        this.c = qim0Var;
    }
}
