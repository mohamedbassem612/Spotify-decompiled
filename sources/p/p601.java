package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p601 {
    public static final long a = sgc1.u(0.5f, 1.0f);

    public static final void a(a101 a101Var, String str, iu30 iu30Var, b0i0 b0i0Var, fqm fqmVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0i0 b0i0Var2;
        fqm fqmVar2;
        qim0 qim0Var2;
        Object next;
        String str2;
        List list = a101Var.c;
        String str3 = a101Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-166221454);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(a101Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            b0i0Var2 = b0i0Var;
            i2 |= x340Var.i(b0i0Var2) ? 2048 : 1024;
        } else {
            b0i0Var2 = b0i0Var;
        }
        if ((i & 24576) == 0) {
            fqmVar2 = fqmVar;
            i2 |= x340Var.i(fqmVar2) ? 16384 : 8192;
        } else {
            fqmVar2 = fqmVar;
        }
        int i3 = 196608 | i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = sqg0.M(new mmr0[]{new mmr0(str3, a101Var)});
                x340Var.s0(objT);
            }
            Map map = (Map) objT;
            List list2 = list;
            if (!list2.isEmpty()) {
                map.put(str3, a101Var);
            }
            a101 a101Var2 = (a101) map.get(str3);
            if (a101Var2 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new lqf0(a101Var, str, iu30Var, b0i0Var2, fqmVar2, i);
                    return;
                }
                return;
            }
            List list3 = a101Var2.c;
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((gxz0) next).c.a, str));
            gxz0 gxz0Var = (gxz0) next;
            if (gxz0Var == null || (str2 = gxz0Var.b) == null) {
                str2 = "";
            }
            boolean z = !ihc1.y0(str2);
            boolean z2 = !list2.isEmpty();
            n8b1 n8b1VarL0 = irn1.l0(0.5f, 0.0f, null, 6);
            long j = a;
            qim0 qim0Var3 = nim0.a;
            fq7.g(z2, qim0Var3, xay.g(0.0f, 2, j, n8b1VarL0), xay.h(irn1.o0(0, 0, null, 7), j, 2), (String) null, apo.r(502905930, new o601(a101Var2, str, list3, a101Var, z, b0i0Var, str2, iu30Var, fqmVar), x340Var), x340Var, ((i3 >> 12) & 112) | 200064, 16);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new kqf0(a101Var, str, iu30Var, b0i0Var, fqmVar, qim0Var2, i, (byte) 20);
        }
    }
}
