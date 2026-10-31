package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class u7b0 extends v6b0 implements ic11 {
    public final mla0 b;
    public final String c;
    public final Object d;
    public final w3b0 e;
    public final znb0 f = dm5.S(2, new i7b0(this, 0));
    public final znb0 g = dm5.S(2, new i7b0(this, 1));
    public final znb0 h = dm5.S(2, new i7b0(this, 2));
    public final znb0 i = dm5.S(2, new i7b0(this, 3));
    public final znb0 t = dm5.S(2, new i7b0(this, 4));

    public u7b0(mla0 mla0Var, String str, Object obj, w3b0 w3b0Var) {
        this.b = mla0Var;
        this.c = str;
        this.d = obj;
        this.e = w3b0Var;
    }

    public final mla0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ic11 ic11VarC = bpi1.c(obj);
        return ic11VarC != null && u890.j(this.b, ic11VarC.a()) && u890.j(this.e.b, ic11VarC.getName()) && u890.j(this.c, ic11VarC.getSignature()) && u890.j(this.d, ic11VarC.u());
    }

    public final List f() {
        return (List) this.f.getValue();
    }

    public final GenericDeclaration findJavaDeclaration() {
        return f3o1.k(this.b, this.c);
    }

    public final rzc g() {
        t().getClass();
        return null;
    }

    public final List getAnnotations() {
        Annotation[] annotations;
        boolean z = u1p1.z(this);
        w3b0 w3b0Var = this.e;
        mla0 mla0Var = this.b;
        if (z) {
            ArrayList arrayList = w3b0Var.l;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ajo1.y((q2b0) it.next(), mla0Var.n().getClassLoader()));
            }
            return arrayList2;
        }
        if (!(mla0Var instanceof ema0)) {
            bhn0.s(this, "Annotations are only supported for top-level properties for now: ");
            return null;
        }
        ija0 ija0Var = don1.v(w3b0Var).e;
        if (ija0Var == null) {
            return z6x.a;
        }
        Method methodZ = mla0Var.z(ija0Var.c, ija0Var.d);
        if (methodZ != null && (annotations = methodZ.getAnnotations()) != null) {
            return bpi1.t(f46.Q0(annotations));
        }
        mna0.d(this, "No synthetic method found: ");
        return null;
    }

    public final rzc getCaller() {
        return t().getCaller();
    }

    public final String getName() {
        return this.e.b;
    }

    public final List getParameters() {
        return (List) this.g.getValue();
    }

    public final oma0 getReturnType() {
        return (oma0) this.h.getValue();
    }

    public final String getSignature() {
        return this.c;
    }

    public final List getTypeParameters() {
        return ((c1h1) this.i.getValue()).a;
    }

    public final xma0 getVisibility() {
        yzu yzuVar = xm7.o;
        mma0 mma0Var = xm7.a[33];
        return ajo1.C((vjk1) yzuVar.y(this.e));
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.e.b);
    }

    public final boolean isSuspend() {
        return false;
    }

    @Override // p.v6b0
    public final dfm0 n() {
        yzu yzuVar = xm7.f50p;
        mma0 mma0Var = xm7.a[34];
        return (dfm0) yzuVar.y(this.e);
    }

    public final Field q() {
        return (Field) this.t.getValue();
    }

    public final Member s() {
        mgc mgcVar = xm7.r;
        mma0 mma0Var = xm7.a[41];
        w3b0 w3b0Var = this.e;
        if (!mgcVar.D(w3b0Var)) {
            return null;
        }
        ija0 ija0Var = don1.v(w3b0Var).f;
        if (ija0Var == null) {
            return q();
        }
        return this.b.z(ija0Var.c, ija0Var.d);
    }

    public abstract k7b0 t();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f4x0.e(sb, this);
        sb.append(this instanceof zla0 ? "var " : "val ");
        f4x0.h(sb, this);
        f4x0.g(sb, this.e.b);
        sb.append(": ");
        sb.append(f4x0.r(getReturnType(), false));
        return sb.toString();
    }

    public final Object u() {
        return this.d;
    }
}
