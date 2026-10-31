package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jia {
    public final qia a;
    public final Function0 b;

    public jia(qia qiaVar, njx0 njx0Var, Function0 function0) {
        this.a = qiaVar;
        this.b = function0;
    }

    public final jfe a(int i, int i2, b0k b0kVar, boolean z) {
        qia qiaVar = this.a;
        float f = qiaVar.b;
        List list = qiaVar.a;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = mno1.a(-2, 0, 6);
            x340Var.s0(objT);
        }
        jfe jfeVar = (jfe) objT;
        boolean zI = x340Var.i(jfeVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new zw11((Object) jfeVar, (byte) 16);
            x340Var.s0(objT2);
        }
        qxd0.i(rih1.a, (iu30) objT2, x340Var);
        int i3 = (i2 & 14) ^ 6;
        boolean zG = ((i3 > 4 && x340Var.e(i)) || (i2 & 6) == 4) | x340Var.g(qiaVar);
        Object objT3 = x340Var.T();
        if (zG || objT3 == m4cVar) {
            objT3 = null;
            if ((!list.isEmpty() ? list : null) != null) {
                int i4 = tia.f;
                long jQ = 0;
                if (jfv.c(0L, 0L) <= 0 && !list.isEmpty()) {
                    pia piaVar = (pia) o7h.A0(list);
                    jQ = jfv.q(piaVar.a, piaVar.b);
                }
                float size = 0.0f;
                if (f > 0.0f) {
                    size = f;
                } else if (list.size() > 1) {
                    Iterator it = list.iterator();
                    double dS = 0.0d;
                    while (it.hasNext()) {
                        dS += jfv.s(((pia) it.next()).b, ngv.e);
                    }
                    size = 60.0f / ((float) (dS / ((double) list.size())));
                }
                objT3 = new tia(new sia(list, jQ, size), this.b);
            }
            x340Var.s0(objT3);
        }
        tia tiaVar = (tia) objT3;
        if (tiaVar != null) {
            f = tiaVar.a.c;
        }
        float f2 = f;
        boolean zG2 = ((i3 > 4 && x340Var.e(i)) || (i2 & 6) == 4) | x340Var.g(qiaVar);
        Object objT4 = x340Var.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT4);
        }
        ven0 ven0Var = (ven0) objT4;
        Integer numValueOf = Integer.valueOf(i);
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zI2 = x340Var.i(ven0Var) | ((((i2 & 112) ^ 48) > 32 && x340Var.h(z)) || (i2 & 48) == 32) | x340Var.d(f2) | x340Var.i(jfeVar) | x340Var.i(tiaVar);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            iia iiaVar = new iia(z, ven0Var, f2, jfeVar, tiaVar, (lnm) null);
            x340Var.s0(iiaVar);
            objT5 = iiaVar;
        }
        qxd0.r(numValueOf, qiaVar, boolValueOf, (vu30) objT5, x340Var);
        return jfeVar;
    }
}
