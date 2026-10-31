package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mb11 extends qb11 implements m7a0, q7a0, p8a0 {
    public final Class a;

    public mb11(Class cls) {
        this.a = cls;
    }

    @Override // p.m7a0
    public final cb11 a(kf30 kf30Var) {
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return p1p1.z(declaredAnnotations, kf30Var);
        }
        return null;
    }

    public final Class b() {
        return this.a;
    }

    public final Collection c() {
        return z561.k0(new sgg1(kb11.a, z561.U(jb11.a, f46.I(this.a.getDeclaredFields()))));
    }

    public final kf30 d() {
        return bb11.a(this.a).a();
    }

    public final Collection e() {
        return z561.k0(new sgg1(lb11.a, z561.T(new gqb0(this, (byte) 11), f46.I(this.a.getDeclaredMethods()))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mb11) {
            return this.a.equals(((mb11) obj).a);
        }
        return false;
    }

    public final ajn0 f() {
        Class cls = this.a;
        return cls.isAnonymousClass() ? ajn0.e(ihc1.X0(cls.getName(), ".")) : ajn0.e(cls.getSimpleName());
    }

    public final ArrayList g() {
        o860 o860Var = i541.c;
        if (o860Var == null) {
            try {
                o860Var = new o860(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 17);
            } catch (NoSuchMethodException unused) {
                o860Var = new o860((Object) null, (Object) null, (Object) null, (Object) null, (byte) 17);
            }
            i541.c = o860Var;
        }
        Method method = (Method) o860Var.e;
        Object[] objArr = method != null ? (Object[]) method.invoke(this.a, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new yb11(obj));
        }
        return arrayList;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        return declaredAnnotations != null ? p1p1.B(declaredAnnotations) : z6x.a;
    }

    @Override // p.p8a0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ac11(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() {
        return this.a.isAnnotation();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        o860 o860Var = i541.c;
        if (o860Var == null) {
            try {
                o860Var = new o860(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 17);
            } catch (NoSuchMethodException unused) {
                o860Var = new o860((Object) null, (Object) null, (Object) null, (Object) null, (byte) 17);
            }
            i541.c = o860Var;
        }
        Method method = (Method) o860Var.d;
        Boolean bool = method != null ? (Boolean) method.invoke(this.a, null) : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean j() {
        o860 o860Var = i541.c;
        if (o860Var == null) {
            try {
                o860Var = new o860(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 17);
            } catch (NoSuchMethodException unused) {
                o860Var = new o860((Object) null, (Object) null, (Object) null, (Object) null, (byte) 17);
            }
            i541.c = o860Var;
        }
        Method method = (Method) o860Var.b;
        Boolean bool = method != null ? (Boolean) method.invoke(this.a, null) : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String toString() {
        return mb11.class.getName() + ": " + this.a;
    }
}
