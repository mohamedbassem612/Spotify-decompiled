package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ub11 extends qb11 implements m7a0, z7a0 {
    @Override // p.m7a0
    public final cb11 a(kf30 kf30Var) {
        Annotation[] declaredAnnotations = ((AnnotatedElement) b()).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return p1p1.z(declaredAnnotations, kf30Var);
        }
        return null;
    }

    public abstract Member b();

    public final ajn0 c() {
        String name = b().getName();
        return name != null ? ajn0.e(name) : moa1.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        Method method;
        ArrayList arrayList;
        zb11 gb11Var;
        zb11 xb11Var;
        String str;
        boolean z2;
        x390 x390Var;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        ws10 ws10Var = ws10.h;
        Member memberB = b();
        x390 x390Var2 = ws10.i;
        if (x390Var2 == null) {
            synchronized (ws10Var) {
                x390Var2 = ws10.i;
                if (x390Var2 == null) {
                    Class<?> cls = memberB.getClass();
                    try {
                        x390Var = new x390(cls.getMethod("getParameters", null), bb11.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null), (byte) 9);
                    } catch (NoSuchMethodException unused) {
                        x390Var = new x390((Object) null, (Object) null, (byte) 9);
                    }
                    ws10.i = x390Var;
                    x390Var2 = x390Var;
                }
            }
        }
        Method method2 = (Method) x390Var2.b;
        if (method2 == null || (method = (Method) x390Var2.c) == null) {
            arrayList = null;
        } else {
            Object[] objArr = (Object[]) method2.invoke(memberB, null);
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add((String) method.invoke(obj, null));
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    xb11Var = new xb11(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        gb11Var = new gb11(type);
                    } else {
                        gb11Var = type instanceof WildcardType ? new cc11((WildcardType) type) : new ob11(type);
                    }
                    xb11Var = gb11Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    gb11Var = new gb11(type);
                } else {
                    gb11Var = new gb11(type);
                }
                xb11Var = gb11Var;
            }
            if (arrayList != null) {
                str = (String) o7h.t0(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + c() + " type=" + xb11Var + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList2.add(new bc11(xb11Var, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    public final o60 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return k9a0.O0;
        }
        if (Modifier.isPrivate(modifiers)) {
            return k9a0.Y;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? k9a0.g : k9a0.f;
        }
        return k9a0.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ub11) && u890.j(b(), ((ub11) obj).b());
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = ((AnnotatedElement) b()).getDeclaredAnnotations();
        return declaredAnnotations != null ? p1p1.B(declaredAnnotations) : z6x.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
