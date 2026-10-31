package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nft extends lft implements jv30, bw30, gc11 {
    public static final /* synthetic */ mma0[] N0 = {new cey0(nft.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final mc11 X;
    public final znb0 Y;
    public final znb0 Z;
    public final mla0 h;
    public final String i;
    public final Object t;

    public nft(mla0 mla0Var, String str, String str2, ov30 ov30Var, Object obj, rka0 rka0Var) {
        super(rka0Var);
        this.h = mla0Var;
        this.i = str2;
        this.t = obj;
        this.X = jhc1.A(ov30Var, new na(this, str, (byte) 9));
        this.Y = dm5.S(2, new mft(this, (byte) 0));
        this.Z = dm5.S(2, new mft(this, (byte) 1));
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ov30 t() {
        mma0 mma0Var = N0[0];
        return (ov30) this.X.invoke();
    }

    public final Object E0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12});
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(new Object[]{obj, obj2, obj3, obj4});
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public final mla0 a() {
        return this.h;
    }

    public final Object b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9});
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5});
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final boolean equals(Object obj) {
        gc11 gc11Var;
        kf30 kf30Var = bpi1.a;
        if (obj instanceof gc11) {
            gc11Var = (gc11) obj;
        } else if (obj instanceof sv30) {
            qka0 qka0VarCompute = ((sv30) obj).compute();
            if (qka0VarCompute instanceof gc11) {
                gc11Var = (gc11) qka0VarCompute;
            } else {
                gc11Var = null;
            }
        } else {
            gc11Var = null;
        }
        return gc11Var != null && u890.j(this.h, gc11Var.a()) && getName().equals(gc11Var.getName()) && u890.j(this.i, gc11Var.getSignature()) && u890.j(this.t, gc11Var.u());
    }

    public final Object f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public final GenericDeclaration findJavaDeclaration() {
        return f3o1.k(this.h, this.i);
    }

    public final rzc g() {
        return (rzc) this.Z.getValue();
    }

    public final int getArity() {
        return w0h1.r(getCaller());
    }

    public final rzc getCaller() {
        return (rzc) this.Y.getValue();
    }

    public final String getName() {
        return ((o9r) t()).getName().b();
    }

    @Override // p.gc11
    public final String getSignature() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((getName().hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final Object invoke(Object obj) {
        return call(new Object[]{obj});
    }

    public final boolean isExternal() {
        return ((lft) this).b.e || t().isExternal();
    }

    public final boolean isInfix() {
        return ((lft) this).b.g || t().isInfix();
    }

    public final boolean isInline() {
        return ((lft) this).b.h || t().isInline();
    }

    public final boolean isOperator() {
        return ((lft) this).b.f || t().isOperator();
    }

    public final boolean isSuspend() {
        return t().isSuspend();
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11});
    }

    public final rgt s() {
        a8b0 returnType = t().getReturnType();
        returnType.getClass();
        return new rgt(returnType, new mft(this, (byte) 2), false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f4x0.e(sb, this);
        sb.append("fun ");
        f4x0.h(sb, this);
        f4x0.g(sb, getName());
        o7h.x0(upn1.u(this), sb, ", ", "(", ")", zqb0.Y0, 48);
        sb.append(": ");
        sb.append(f4x0.r(getReturnType(), false));
        return sb.toString();
    }

    public final Object u() {
        return this.t;
    }

    public final lft x(rka0 rka0Var) {
        return new nft(this.h, t(), rka0Var);
    }

    public final i0d y(Constructor constructor, ov30 ov30Var, boolean z) {
        if (!z) {
            xdg xdgVar = ov30Var instanceof xdg ? (xdg) ov30Var : null;
            if (xdgVar != null && !mht.e(xdgVar.getVisibility()) && !vf80.b(xdgVar.H1()) && !iht.n(xdgVar.H1())) {
                List listF = xdgVar.F();
                if (!(listF instanceof Collection) || !listF.isEmpty()) {
                    Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        if (r6p1.v(((tsi1) it.next()).getType())) {
                            return fc11.N(this) ? new uzc(constructor, fc11.A(this), (byte) 0) : new vzc(constructor, (byte) 0);
                        }
                    }
                }
            }
        }
        return fc11.N(this) ? new uzc(constructor, fc11.A(this), (byte) 1) : new vzc(constructor, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    public final d0d z(Method method, boolean z) {
        Object objA;
        Class cls;
        if (!fc11.N(this)) {
            return new h0d(method, (byte) 2);
        }
        rob0 rob0VarI = t().I();
        if (rob0VarI != null) {
            a8b0 type = rob0VarI.getType();
            int i = vf80.a;
            jfg jfgVarS = type.t0().s();
            if ((jfgVarS != null ? vf80.a(jfgVarS) : false) && (cls = (Class) f46.k0(method.getParameterTypes())) != null && cls.isInterface()) {
                objA = this.t;
            } else {
                objA = fc11.A(this);
            }
        } else {
            objA = fc11.A(this);
        }
        return new g0d(method, z, objA);
    }

    public final Object invoke() {
        return call(new Object[0]);
    }

    public final Object invoke(Object obj, Object obj2) {
        return call(new Object[]{obj, obj2});
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(new Object[]{obj, obj2, obj3});
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nft(mla0 mla0Var, ov30 ov30Var, rka0 rka0Var) {
        this(mla0Var, ((o9r) ov30Var).getName().b(), i141.c(ov30Var).f(), ov30Var, lyc.NO_RECEIVER, rka0Var);
    }

    public nft(mla0 mla0Var, String str, String str2, Object obj) {
        this(mla0Var, str, str2, null, obj, rka0.i);
    }

    public nft(mla0 mla0Var, ov30 ov30Var) {
        this(mla0Var, ov30Var, rka0.i);
    }
}
