package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(List list, String str) {
        super(3);
        this.a = (byte) 0;
        this.c = list;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strN0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(22406003);
                if (list.size() > 1) {
                    x340Var.i0(57335682);
                    strN0 = cwl1.n0(2131958985, new Object[]{Integer.valueOf(list.size())}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1777518953);
                    gxz0 gxz0Var = (gxz0) o7h.q0(list);
                    w4i1 w4i1Var = gxz0Var.c;
                    String str = gxz0Var.b;
                    if (u890.j(w4i1Var.a, this.b)) {
                        x340Var.i0(1777617533);
                        strN0 = cwl1.n0(2131954785, new Object[]{str}, x340Var);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1777801053);
                        strN0 = cwl1.n0(2131962539, new Object[]{gxz0Var.c.b, str}, x340Var);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                boolean zG = x340Var.g(strN0);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new v1(strN0, (byte) 3);
                    x340Var.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
                x340Var.r(false);
                return qim0VarA;
            case 1:
                ((Number) obj3).intValue();
                long jY = fc11.Y(yoi1.o((((i2c) obj).d() / 100.0f) * 16.0f, 10.0f, 18.0f), 4294967296L);
                x340 x340Var2 = (b0k) obj2;
                boolean zI = x340Var2.i(list);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == fkj0.X) {
                    objT2 = new nec0(list, (byte) 3);
                    x340Var2.s0(objT2);
                }
                u4p1.k(0, jY, this.b, x340Var2, (iu30) objT2);
                return rih1Var;
            default:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var3).k;
                fra fraVar = een.N0;
                nim0 nim0Var = nim0.a;
                uwo1.e(this.b, ew20Var.e(nim0Var, fraVar), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
                if (list.isEmpty()) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-367855206);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-368210776);
                    boolean zG2 = x340Var5.g(list);
                    Object objT3 = x340Var5.T();
                    if (zG2 || objT3 == fkj0.X) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new phx(14, 0L, (String) it.next(), (String) null, (String) null));
                        }
                        objT3 = mqo1.A(arrayList);
                        x340Var5.s0(objT3);
                    }
                    fc11.a((c380) objT3, ew20Var.e(nim0Var, fraVar), hcx.a, (hux) null, false, list.size(), (gbx) null, (String) null, (idn0) null, x340Var5, 392, 472);
                    x340Var5.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf(String str, List list, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = list;
    }
}
