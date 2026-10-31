package p;

import android.app.Activity;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vv1 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv1(uvx uvxVar, jvx jvxVar, int i, idn0 idn0Var, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, j2i j2iVar) {
        super(3);
        this.c = uvxVar;
        this.d = jvxVar;
        this.b = i;
        this.e = idn0Var;
        this.f = xu30Var;
        this.g = xu30Var2;
        this.h = xu30Var3;
        this.i = xu30Var4;
        this.t = xu30Var5;
        this.X = xu30Var6;
        this.Y = xu30Var7;
        this.Z = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.f;
        Object obj7 = this.e;
        int i = this.b;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.X;
        Object obj11 = this.t;
        Object obj12 = this.i;
        Object obj13 = this.h;
        Object obj14 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Activity activity = (Activity) obj5;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj9;
                c9n c9nVar = (c9n) obj12;
                upo upoVar = (upo) obj11;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    Integer num = (Integer) ven0Var.getValue();
                    boolean zBooleanValue = ((Boolean) ((tob1) obj4).getValue()).booleanValue();
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new xj0(ven0Var, (byte) 8);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarG0 = irn1.g0(nim0.a, (iu30) objT);
                    fu1 fu1Var = (fu1) obj6;
                    dx1 dx1Var = (dx1) obj14;
                    ow1 ow1Var = (ow1) obj13;
                    boolean zI = x340Var2.i(c9nVar) | x340Var2.i(upoVar);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new y4(c9nVar, upoVar, (byte) 20);
                        x340Var2.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zE = x340Var2.e(i) | x340Var2.i(c9nVar) | x340Var2.g((mj11) obj10) | x340Var2.i(activity) | x340Var2.g((dx1) obj14) | x340Var2.i(upoVar);
                    ven0 ven0Var2 = (ven0) obj8;
                    ven0 ven0Var3 = (ven0) obj7;
                    c9n c9nVar2 = (c9n) obj12;
                    mj11 mj11Var = (mj11) obj10;
                    dx1 dx1Var2 = (dx1) obj14;
                    upo upoVar2 = (upo) obj11;
                    Object objT3 = x340Var2.T();
                    if (zE || objT3 == m4cVar) {
                        objT3 = new uv1(ven0Var2, this.b, ven0Var3, c9nVar2, mj11Var, activity, dx1Var2, upoVar2);
                        x340Var2.s0(objT3);
                    }
                    n9p1.a(fu1Var, dx1Var, ow1Var, function0, (iu30) objT3, apo.r(-1693920294, new wh(upoVar, (ow1) obj13, (byte) 3), x340Var2), qim0VarG0, zBooleanValue, num, x340Var2, 196608);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                jvx jvxVar = (jvx) obj8;
                jto1.c((uvx) obj9, null, new cw9(jvxVar.a, (idn0) obj7, jvxVar.b, i != 3, i == 1), (xu30) obj6, (xu30) obj14, (xu30) obj13, (xu30) obj12, (xu30) obj11, (xu30) obj10, (xu30) obj5, (j2i) obj4, b0kVar, 0, 2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv1(ven0 ven0Var, fu1 fu1Var, dx1 dx1Var, ow1 ow1Var, c9n c9nVar, upo upoVar, int i, mj11 mj11Var, Activity activity, tob1 tob1Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(3);
        this.c = ven0Var;
        this.f = fu1Var;
        this.g = dx1Var;
        this.h = ow1Var;
        this.i = c9nVar;
        this.t = upoVar;
        this.b = i;
        this.X = mj11Var;
        this.Y = activity;
        this.Z = tob1Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
    }
}
