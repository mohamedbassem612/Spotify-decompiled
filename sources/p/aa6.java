package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aa6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 5;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(int i, String str, String str2, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, boolean z, boolean z2) {
        super(2);
        this.d = z;
        this.e = z2;
        this.b = str;
        this.i = iu30Var;
        this.t = function0;
        this.f = iu30Var2;
        this.g = function1;
        this.h = qim0Var;
        this.c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.h;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                r4o1.z((y86) obj8, (psk) obj7, (String) obj9, (upx0) obj4, (String) obj3, this.d, (iu30) obj6, this.e, (Function0) obj5, (b0k) obj, czo1.p(7));
                break;
            case 1:
                ((Number) obj2).intValue();
                irn1.i((String) obj9, (String) obj3, (zah1) obj8, this.d, this.e, (los) obj7, (nu) obj4, (vu30) obj6, (q3w) obj5, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj6;
                hob1 hob1Var = (hob1) obj8;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (((Boolean) ((ven0) obj9).getValue()).booleanValue()) {
                        i091 i091Var = (i091) obj7;
                        if (!(i091Var != null ? ebp1.q(i091Var) : false) || hob1Var.f) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    hob1 hob1Var2 = (hob1) obj8;
                    j2i j2iVarR = apo.r(-1653133157, new sci0(hob1Var2, (i091) obj7, this.e, (xpw) obj3, (ven0) obj9, (yqg) obj4, (byte) 2), x340Var2);
                    j2i j2iVarR2 = apo.r(1109187417, new tci0((znb0) obj5, hob1Var, iu30Var, (byte) 4), x340Var2);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new msh0(iu30Var, (byte) 24);
                        x340Var2.s0(objT);
                    }
                    yoo1.j(hob1Var2, j2iVarR, (qim0) null, j2iVarR2, z, this.d, (Function0) objT, x340Var2, 3120);
                }
                break;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                wsq0 wsq0Var = (wsq0) obj7;
                iu30 iu30Var2 = (iu30) obj6;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    a4d a4dVar = (a4d) obj8;
                    a4dVar.getClass();
                    boolean z2 = this.d;
                    boolean z3 = (z2 && wsq0Var.equals(rsq0.a)) ? false : true;
                    v3d v3dVar = this.e ? ((isq0) obj9).b : null;
                    j2i j2iVar = z2 ? g5j.a : (j2i) obj3;
                    vg41 vg41Var = (vg41) obj4;
                    j2i j2iVarR3 = apo.r(1456645098, new lsq0((osq0) obj5, wsq0Var), x340Var4);
                    boolean zG2 = x340Var4.g(iu30Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new dgq0(iu30Var2, (byte) 10);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new wck0(iu30Var2, (byte) 21);
                        x340Var4.s0(objT3);
                    }
                    otw.c(a4dVar, new w3d(vg41Var, v3dVar, j2iVarR3, function0, (iu30) objT3, j2iVar, this.d, z3, 32), (qim0) null, (ipb1) null, x340Var4, 72, 12);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                two1.j((ArrayList) obj8, (a3t0) obj7, (xpw) obj9, (lqr) obj3, this.d, this.e, (Function0) obj5, (Function0) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                f5p1.f(czo1.p(1), (String) obj9, (String) obj3, (Function0) obj5, (Function0) obj7, (b0k) obj, (iu30) obj6, (iu30) obj8, (qim0) obj4, this.d, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(String str, String str2, zah1 zah1Var, boolean z, boolean z2, los losVar, nu nuVar, vu30 vu30Var, q3w q3wVar, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.f = zah1Var;
        this.d = z;
        this.e = z2;
        this.g = losVar;
        this.h = nuVar;
        this.i = vu30Var;
        this.t = q3wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(ArrayList arrayList, a3t0 a3t0Var, xpw xpwVar, lqr lqrVar, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.f = arrayList;
        this.g = a3t0Var;
        this.b = xpwVar;
        this.c = lqrVar;
        this.d = z;
        this.e = z2;
        this.t = function0;
        this.h = function1;
        this.i = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(y86 y86Var, psk pskVar, String str, upx0 upx0Var, String str2, boolean z, iu30 iu30Var, boolean z2, Function0 function0, int i) {
        super(2);
        this.f = y86Var;
        this.g = pskVar;
        this.b = str;
        this.h = upx0Var;
        this.c = str2;
        this.d = z;
        this.i = iu30Var;
        this.e = z2;
        this.t = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(a4d a4dVar, boolean z, wsq0 wsq0Var, boolean z2, isq0 isq0Var, j2i j2iVar, vg41 vg41Var, iu30 iu30Var, osq0 osq0Var) {
        super(2);
        this.f = a4dVar;
        this.d = z;
        this.g = wsq0Var;
        this.e = z2;
        this.b = isq0Var;
        this.c = j2iVar;
        this.h = vg41Var;
        this.i = iu30Var;
        this.t = osq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(hob1 hob1Var, i091 i091Var, boolean z, iu30 iu30Var, ven0 ven0Var, boolean z2, xpw xpwVar, yqg yqgVar, znb0 znb0Var) {
        super(2);
        this.f = hob1Var;
        this.g = i091Var;
        this.d = z;
        this.i = iu30Var;
        this.b = ven0Var;
        this.e = z2;
        this.c = xpwVar;
        this.h = yqgVar;
        this.t = znb0Var;
    }
}
