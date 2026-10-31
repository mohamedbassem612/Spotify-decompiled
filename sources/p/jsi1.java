package p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jsi1 implements rzc {
    public final rzc a;
    public final boolean b;
    public final dlg1 c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[EDGE_INSN: B:32:0x0083->B:52:0x00c5 BREAK  A[LOOP:4: B:39:0x009d->B:150:?]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    public jsi1(List list, rzc rzcVar, dc11 dc11Var, boolean z) throws i9n {
        Class clsL;
        Method declaredMethod;
        boolean z2;
        int size;
        dlg1 dlg1Var;
        Member memberB;
        Class clsL2;
        oma0 oma0VarS;
        this.a = rzcVar;
        this.b = z;
        oma0 returnType = dc11Var.getReturnType();
        boolean z3 = dc11Var instanceof gc11;
        if ((z3 && ((gc11) dc11Var).isSuspend() && (oma0VarS = bpi1.s(returnType)) != null && yxo1.C(oma0VarS)) || (clsL = yxo1.L(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsL.getDeclaredMethod("box-impl", yxo1.y(clsL, dc11Var).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                eqg.c("No box method found in inline class: ", clsL, " (calling ", dc11Var);
                throw null;
            }
        }
        if ((dc11Var instanceof gma0) && yxo1.D(((gma0) dc11Var).e())) {
            dlg1Var = new dlg1(tr80.d, new Method[0], declaredMethod);
        } else {
            int i = -1;
            if (!(rzcVar instanceof g0d) || ((g0d) rzcVar).g) {
                if (!fc11.P(dc11Var)) {
                    List parameters = dc11Var.getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator it = parameters.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((hc11) it.next()).s() == 1) {
                                    bla0 bla0VarA = dc11Var.a();
                                    bla0 bla0Var = bla0VarA instanceof bla0 ? bla0VarA : null;
                                    if (bla0Var == null || !bla0Var.p()) {
                                        i = 1;
                                        break;
                                    }
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    i = 0;
                    break;
                }
                if (!(rzcVar instanceof q0c)) {
                    i = 0;
                    break;
                }
            }
            this.a.b();
            ArrayList arrayList = new ArrayList();
            tka0 tka0VarA = dc11Var.a();
            if (!fc11.P(dc11Var) && (tka0VarA instanceof tka0)) {
                tka0 tka0Var = tka0VarA;
                if (tka0Var.p()) {
                    arrayList.add(ila0.o(tka0Var));
                }
            }
            if (fc11.P(dc11Var)) {
                tka0 tka0Var2 = tka0VarA instanceof tka0 ? tka0VarA : null;
                if (tka0Var2 == null || !tka0Var2.j()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            for (hc11 hc11Var : dc11Var.f()) {
                if (hc11Var.s() != 1 || z2) {
                    arrayList.add(hc11Var.t());
                }
            }
            List listF = dc11Var.f();
            if (!(listF instanceof Collection) || !listF.isEmpty()) {
                Iterator it2 = listF.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((hc11) it2.next()).s() == 3) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            } else {
                size = arrayList.size();
                break;
            }
            int size2 = arrayList.size() + i + (this.b ? ((size + 31) / 32) + 1 : 0) + ((z3 && ((gc11) dc11Var).isSuspend()) ? 1 : 0);
            boolean z4 = this.b;
            if (w0h1.r(this) != size2) {
                StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb.append(w0h1.r(this));
                sb.append(" != ");
                sb.append(size2);
                sb.append("\nCalling: ");
                sb.append(dc11Var);
                List listA = this.a.a();
                sb.append("\nParameter types: ");
                sb.append(listA);
                sb.append(")\nDefault: ");
                sb.append(z4);
                throw new i9n(sb.toString());
            }
            tr80 tr80VarQ = yoi1.Q(Math.max(i, 0), arrayList.size() + i);
            Method[] methodArr = new Method[size2];
            int i2 = 0;
            while (i2 < size2) {
                methodArr[i2] = (i2 > ((rr80) tr80VarQ).b || ((rr80) tr80VarQ).a > i2 || (clsL2 = yxo1.L((oma0) arrayList.get(i2 - i))) == null) ? null : yxo1.y(clsL2, dc11Var);
                i2++;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                methodArr[((Number) it3.next()).intValue()] = null;
            }
            tka0 tka0VarA2 = dc11Var.a();
            if (!fc11.P(dc11Var) && (tka0VarA2 instanceof tka0) && tka0VarA2.p() && (memberB = this.a.b()) != null) {
                Class<?> declaringClass = memberB.getDeclaringClass();
                if (declaringClass == null ? false : !rc11.a.b(declaringClass).p()) {
                    methodArr[0] = null;
                }
            }
            dlg1Var = new dlg1(tr80VarQ, methodArr, declaredMethod);
        }
        this.c = dlg1Var;
    }

    @Override // p.rzc
    public final List a() {
        return this.a.a();
    }

    @Override // p.rzc
    public final Member b() {
        return this.a.b();
    }

    @Override // p.rzc
    public final boolean c() {
        return this.a instanceof e0d;
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        Object objInvoke;
        Method method;
        dlg1 dlg1Var = this.c;
        tr80 tr80Var = (tr80) dlg1Var.a;
        Method[] methodArr = (Method[]) dlg1Var.b;
        Method method2 = (Method) dlg1Var.c;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objInvoke2 = objArr[i];
            int i2 = ((rr80) tr80Var).a;
            if (i <= ((rr80) tr80Var).b && i2 <= i && (method = methodArr[i]) != null) {
                objInvoke2 = objInvoke2 != null ? method.invoke(objInvoke2, null) : bpi1.e(method.getReturnType());
            }
            objArr2[i] = objInvoke2;
        }
        Object objCall = this.a.call(objArr2);
        return (objCall == d9n.a || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p.rzc
    public final Type getReturnType() {
        return this.a.getReturnType();
    }
}
