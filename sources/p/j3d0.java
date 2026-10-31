package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3d0 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ qxc0 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ zsu0 f;
    public final /* synthetic */ r3d0 g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ uvx i;

    public j3d0(List list, qxc0 qxc0Var, c9n c9nVar, String str, Function0 function0, zsu0 zsu0Var, r3d0 r3d0Var, tob1 tob1Var, uvx uvxVar) {
        this.a = list;
        this.b = qxc0Var;
        this.c = c9nVar;
        this.d = str;
        this.e = function0;
        this.f = zsu0Var;
        this.g = r3d0Var;
        this.h = tob1Var;
        this.i = uvxVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i2 = 2;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            tha1 tha1Var = (tha1) this.a.get(iIntValue);
            x340Var2.i0(1644492658);
            Class<?> cls = tha1Var.getSortOrder().getClass();
            tob1 tob1Var = this.h;
            boolean z = cls == ((g3d0) tob1Var.getValue()).getClass();
            if (z) {
                d3d0 d3d0Var = (g3d0) tob1Var.getValue();
                if (!(d3d0Var instanceof d3d0)) {
                    i2 = 1;
                } else if (d3d0Var.a()) {
                    i2 = 3;
                }
            } else {
                i2 = 0;
            }
            qxc0 qxc0Var = this.b;
            boolean zD = tha1Var.d(qxc0Var);
            String strO0 = cwl1.o0(x340Var2, tha1Var.b());
            String strN0 = cwl1.n0(2131957355, new Object[]{strO0}, x340Var2);
            boolean zI = x340Var2.i(this.c) | x340Var2.i(qxc0Var) | x340Var2.g(this.d) | x340Var2.i(tha1Var) | x340Var2.g(this.e) | x340Var2.h(zD);
            zsu0 zsu0Var = this.f;
            boolean zI2 = x340Var2.i(tob1Var) | zI | x340Var2.i(zsu0Var) | x340Var2.i(this.g);
            Object objT = x340Var2.T();
            if (zI2 || objT == fkj0.X) {
                objT = new ch6(this.c, qxc0Var, this.d, tha1Var, this.e, zD, zsu0Var, this.g, this.h);
                x340Var2.s0(objT);
            }
            jto1.b(anm1.N("list_sort_page_item_" + tha1Var.b(), pqo.h(u291.f(nim0.a, 1.0f), !zD)), this.i, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strN0), (Function0) objT), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(506705696, new f13(i2, (byte) 9), x340Var2), (xu30) null, (xu30) null, apo.r(-465319453, new c2(strO0, z, (byte) 7), x340Var2), x340Var2, 64, 196992, 28604);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
