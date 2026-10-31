package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kkf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ skf b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kkf(skf skfVar, boolean z, byte b) {
        super(3);
        this.a = b;
        this.b = skfVar;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strO;
        lee1 lee1Var;
        x340 x340Var;
        float f;
        qim0 qim0Var;
        ksl kslVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        skf skfVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uwr uwrVar = cbx.a;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var3.b0();
                    return rih1Var;
                }
                btf btfVar = skfVar.b;
                w4i1 w4i1Var = skfVar.c;
                ArrayList arrayList = skfVar.d;
                if (btfVar instanceof btf) {
                    String str = btfVar.a;
                    if (str != null && !ihc1.y0(str)) {
                        x340Var3.i0(1828183667);
                        x340Var3.r(false);
                        strO = btfVar.a;
                        strO.getClass();
                    } else if (arrayList.size() > 1) {
                        x340Var3.i0(1828186250);
                        x340Var3.r(false);
                        strO = iro1.o(arrayList);
                    } else if (arrayList.size() == 1) {
                        x340Var3.i0(839262485);
                        strO = cwl1.n0(2131953368, new Object[]{w4i1Var.b}, x340Var3) + ", " + ((w4i1) o7h.q0(arrayList)).b;
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(1828197851);
                        strO = cwl1.n0(2131953368, new Object[]{w4i1Var.b}, x340Var3);
                        x340Var3.r(false);
                    }
                } else {
                    if (!u890.j(btfVar, atf.a)) {
                        eg.o();
                        return null;
                    }
                    strO = iro1.o(arrayList);
                }
                String str2 = strO;
                if (z) {
                    x340Var3.i0(1393315826);
                    lee1Var = cbx.d(x340Var3).k;
                } else {
                    x340Var3.i0(1393317006);
                    lee1Var = cbx.d(x340Var3).j;
                }
                x340Var3.r(false);
                uwo1.e(str2, null, lee1Var, cbx.a(x340Var3).b.a, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2034);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), een.Z, x340Var5, 0);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var5, qim0Var2);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(hmb0.t1);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(jw31VarA, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    boolean z2 = skfVar.i;
                    ksl kslVar2 = isl.a;
                    if (z2) {
                        x340Var5.i0(1830081834);
                        cnx cnxVar = cnx.c;
                        long j = cbx.a(x340Var5).b.e;
                        zov0 zov0Var = cbx.b(x340Var5).g;
                        kslVar = kslVar2;
                        f = 16.0f;
                        qim0Var = qim0Var2;
                        w0h1.a(cnxVar, kslVar, anm1.N("chat-row-age-assurance-warning-icon", u291.r(qim0Var2, 16.0f)), j, 0L, true, x340Var5, cnx.d | 196656, 16);
                        x340Var = x340Var5;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var5;
                        f = 16.0f;
                        qim0Var = qim0Var2;
                        kslVar = kslVar2;
                        x340Var.i0(1830475255);
                        x340Var.r(false);
                    }
                    if (skfVar.j) {
                        x340Var.i0(1830530683);
                        x340 x340Var6 = x340Var;
                        kpx kpxVar = kpx.c;
                        long j2 = cbx.a(x340Var6).b.b;
                        zov0 zov0Var2 = cbx.b(x340Var6).g;
                        w0h1.a(kpxVar, kslVar, anm1.N("chat-row-muted-icon", u291.r(qim0Var, f)), j2, 0L, true, x340Var6, kpx.d | 196656, 16);
                        x340Var = x340Var6;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1830907767);
                        x340Var.r(false);
                    }
                    if (z) {
                        x340Var.i0(1830932443);
                        tto1.b(skfVar.g, 0, x340Var, null);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1830990103);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    tto1.h(skfVar, z, null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
