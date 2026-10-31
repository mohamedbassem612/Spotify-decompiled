package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ec11 implements dc11 {
    public final mc11 a = jhc1.A(null, new y52(0, this, fc11.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 20));

    @Override // p.qka0
    public final Object call(Object... objArr) {
        try {
            return getCaller().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.full.IllegalCallableAccessException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    @Override // p.qka0
    public final Object callBy(Map map) throws i9n, IllegalCallableAccessException {
        Object objW;
        boolean z = false;
        if (fc11.M(this)) {
            List<hc11> parameters = getParameters();
            ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
            for (hc11 hc11Var : parameters) {
                if (map.containsKey(hc11Var)) {
                    objW = map.get(hc11Var);
                    if (objW == null) {
                        nkx0.m("Annotation argument value cannot be null (", hc11Var, 41);
                        return null;
                    }
                } else if (hc11Var.w()) {
                    objW = null;
                } else {
                    if (!hc11Var.x()) {
                        hhg1.g(hc11Var, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objW = fc11.w(hc11Var.t());
                }
                arrayList.add(objW);
            }
            rzc rzcVarG = g();
            if (rzcVarG == null) {
                tw20.y(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return rzcVarG.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        List<hc11> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return getCaller().call(isSuspend() ? new lnm[]{null} : new lnm[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.a.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (hc11 hc11Var2 : parameters2) {
            if (map.containsKey(hc11Var2)) {
                objArr[hc11Var2.n()] = map.get(hc11Var2);
            } else if (hc11Var2.w()) {
                int i2 = (i / 32) + size;
                objArr[i2] = Integer.valueOf(((Integer) objArr[i2]).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!hc11Var2.x()) {
                hhg1.g(hc11Var2, "No argument provided for a required parameter: ");
                return null;
            }
            if (hc11Var2.s() == 4 || hc11Var2.s() == 2) {
                i++;
            }
        }
        if (!z) {
            try {
                return getCaller().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        rzc rzcVarG2 = g();
        if (rzcVarG2 == null) {
            tw20.y(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return rzcVarG2.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }
}
