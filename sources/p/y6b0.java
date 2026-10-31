package p;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class y6b0 extends v6b0 implements jv30, bw30, gc11 {
    public final mla0 b;
    public final String c;
    public final Object d;
    public final znb0 e = dm5.S(2, new x6b0(this, 0));
    public final znb0 f = dm5.S(2, new x6b0(this, 1));
    public final znb0 g = dm5.S(2, new x6b0(this, 2));
    public final znb0 h = dm5.S(2, new x6b0(this, 3));

    public y6b0(mla0 mla0Var, String str, Object obj) {
        this.b = mla0Var;
        this.c = str;
        this.d = obj;
    }

    public abstract List A();

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
        return this.b;
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
        return gc11Var != null && u890.j(this.b, gc11Var.a()) && u890.j(getName(), gc11Var.getName()) && u890.j(this.c, gc11Var.getSignature()) && u890.j(this.d, gc11Var.u());
    }

    public final List f() {
        return (List) this.e.getValue();
    }

    public final Object f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public final GenericDeclaration findJavaDeclaration() {
        return f3o1.k(this.b, this.c);
    }

    public final rzc g() {
        return (rzc) this.h.getValue();
    }

    public final List getAnnotations() {
        Member memberB = getCaller().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        return annotatedElement == null ? z6x.a : bpi1.t(f46.Q0(annotatedElement.getAnnotations()));
    }

    public final int getArity() {
        return w0h1.r(getCaller());
    }

    public final rzc getCaller() {
        return (rzc) this.g.getValue();
    }

    public final List getParameters() {
        return (List) this.f.getValue();
    }

    @Override // p.gc11
    public final String getSignature() {
        return this.c;
    }

    public final List getTypeParameters() {
        return z().a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((getName().hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final Object invoke(Object obj) {
        return call(new Object[]{obj});
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return call(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11});
    }

    public final i0d s(Constructor constructor, boolean z) {
        if (!z && (this instanceof w6b0)) {
            w6b0 w6b0Var = (w6b0) this;
            if (w6b0Var.getVisibility() != xma0.d) {
                List parameters = w6b0Var.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        tka0 tka0VarS = jhc1.s(((hc11) it.next()).t());
                        if (tka0VarS.p() && !tka0VarS.equals(rc11.a.b(e331.class))) {
                            return fc11.N(this) ? new uzc(constructor, fc11.A(this), (byte) 0) : new vzc(constructor, (byte) 0);
                        }
                    }
                }
            }
        }
        return fc11.N(this) ? new uzc(constructor, fc11.A(this), (byte) 1) : new vzc(constructor, (byte) 1);
    }

    public final d0d t(Method method, boolean z) {
        if (!fc11.N(this)) {
            return new h0d(method, (byte) 2);
        }
        if (this.b instanceof ema0) {
            return new g0d(method, z, fc11.A(this));
        }
        bhn0.s(this, "Only top-level functions are supported for now: ");
        return null;
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
        return this.d;
    }

    public List w() {
        return z6x.a;
    }

    public y3b0 x() {
        return null;
    }

    public abstract ija0 y();

    public c1h1 z() {
        return ((yka0) this.b.c.getValue()).d();
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
}
