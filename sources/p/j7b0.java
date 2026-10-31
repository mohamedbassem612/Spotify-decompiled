package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class j7b0 extends v6b0 implements nla0, fma0 {
    public final mla0 a() {
        return t().b;
    }

    public final rzc g() {
        return null;
    }

    public final List getAnnotations() {
        Annotation[] annotations;
        boolean z = u1p1.z(t());
        List list = z6x.a;
        if (z) {
            return list;
        }
        Member memberB = getCaller().b();
        List listQ0 = null;
        Method method = memberB instanceof Method ? (Method) memberB : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listQ0 = f46.Q0(annotations);
        }
        if (listQ0 != null) {
            list = listQ0;
        }
        return bpi1.t(list);
    }

    public final List getTypeParameters() {
        return t().getTypeParameters();
    }

    public final xma0 getVisibility() {
        xma0 xma0VarC;
        x3b0 x3b0VarS = s();
        if (x3b0VarS != null) {
            yzu yzuVar = xm7.s;
            mma0 mma0Var = xm7.a[44];
            vjk1 vjk1Var = (vjk1) yzuVar.y(x3b0VarS);
            if (vjk1Var != null && (xma0VarC = ajo1.C(vjk1Var)) != null) {
                return xma0VarC;
            }
        }
        return t().getVisibility();
    }

    public final boolean isExternal() {
        x3b0 x3b0VarS = s();
        if (x3b0VarS == null) {
            return false;
        }
        mgc mgcVar = xm7.u;
        mma0 mma0Var = xm7.a[47];
        return mgcVar.D(x3b0VarS);
    }

    public final boolean isInfix() {
        return false;
    }

    public final boolean isInline() {
        x3b0 x3b0VarS = s();
        if (x3b0VarS == null) {
            return false;
        }
        mgc mgcVar = xm7.v;
        mma0 mma0Var = xm7.a[48];
        return mgcVar.D(x3b0VarS);
    }

    public final boolean isOperator() {
        return false;
    }

    public final boolean isSuspend() {
        return false;
    }

    @Override // p.v6b0
    public final dfm0 n() {
        x3b0 x3b0VarS = s();
        if (x3b0VarS != null) {
            yzu yzuVar = xm7.t;
            mma0 mma0Var = xm7.a[45];
            dfm0 dfm0Var = (dfm0) yzuVar.y(x3b0VarS);
            if (dfm0Var != null) {
                return dfm0Var;
            }
        }
        return t().n();
    }

    public x3b0 s() {
        return t().e.d;
    }

    public abstract u7b0 t();

    public final Object u() {
        return t().d;
    }
}
