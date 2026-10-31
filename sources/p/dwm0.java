package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dwm0 {
    public final nen0 a;

    public static final void a(nen0 nen0Var, Object obj, Object obj2) {
        int iF = nen0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : nen0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof wdn0) {
                wdn0 wdn0Var = (wdn0) obj3;
                wdn0Var.b(obj2);
                obj2 = wdn0Var;
            } else {
                Object[] objArr = lfp0.a;
                wdn0 wdn0Var2 = new wdn0(2);
                wdn0Var2.b(obj3);
                wdn0Var2.b(obj2);
                obj2 = wdn0Var2;
            }
        }
        if (!z) {
            nen0Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        nen0Var.b[i] = obj;
        nen0Var.c[i] = obj2;
    }

    public static final Object b(nen0 nen0Var, xnm0 xnm0Var) {
        Object objG = nen0Var.g(xnm0Var);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof wdn0)) {
            nen0Var.k(xnm0Var);
            return objG;
        }
        wdn0 wdn0Var = (wdn0) objG;
        Object objQ = ero1.q(wdn0Var);
        if (wdn0Var.i()) {
            nen0Var.k(xnm0Var);
        }
        if (wdn0Var.b == 1) {
            nen0Var.m(xnm0Var, wdn0Var.f());
        }
        return objQ;
    }

    public static final void c(nen0 nen0Var, xnm0 xnm0Var, iu30 iu30Var) {
        Object objG = nen0Var.g(xnm0Var);
        if (objG != null) {
            if (!(objG instanceof wdn0)) {
                if (((Boolean) iu30Var.invoke(objG)).booleanValue()) {
                    nen0Var.k(xnm0Var);
                    return;
                }
                return;
            }
            wdn0 wdn0Var = (wdn0) objG;
            int i = wdn0Var.b;
            Object[] objArr = wdn0Var.a;
            int i2 = 0;
            tr80 tr80VarQ = yoi1.Q(0, i);
            int i3 = ((rr80) tr80VarQ).a;
            int i4 = ((rr80) tr80VarQ).b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) iu30Var.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            f46.e0(objArr, (te70) null, i - i2, i);
            wdn0Var.b -= i2;
            if (wdn0Var.i()) {
                nen0Var.k(xnm0Var);
            }
            if (wdn0Var.b == 1) {
                nen0Var.m(xnm0Var, wdn0Var.f());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwm0) {
            return this.a.equals(((dwm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
