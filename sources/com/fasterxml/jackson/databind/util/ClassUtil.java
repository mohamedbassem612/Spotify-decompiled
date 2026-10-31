package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import p.bb00;
import p.gvg;
import p.mna0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];
    private static final Iterator<?> EMPTY_ITERATOR = Collections.emptyIterator();

    public static final class Ctor {
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkAndFixAccess(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || isJDKClass(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            Class<?> declaringClass2 = member.getDeclaringClass();
            StringBuilder sb = new StringBuilder("Cannot access ");
            sb.append(member);
            String name = declaringClass2.getName();
            String message = e.getMessage();
            sb.append(" (from class ");
            sb.append(name);
            sb.append("; failed to set access: ");
            sb.append(message);
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e2) {
            if (!"InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw e2;
            }
            String simpleName = member.getClass().getSimpleName();
            String name2 = member.getName();
            String strNameOf = nameOf(member.getDeclaringClass());
            String name3 = e2.getClass().getName();
            String message2 = e2.getMessage();
            StringBuilder sbN = gvg.n("Failed to call `setAccess()` on ", simpleName, " '", name2, "' (of class ");
            bb00.j(sbN, strNameOf, ") due to `", name3, "`, problem: ");
            sbN.append(message2);
            throw new IllegalArgumentException(sbN.toString(), e2);
        }
    }

    public static <T> T createInstance(Class<T> cls, boolean z) {
        Constructor constructorFindConstructor = findConstructor(cls, z);
        if (constructorFindConstructor == null) {
            mna0.e("Class ", cls.getName(), " has no default (no arg) constructor");
            return null;
        }
        try {
            return (T) constructorFindConstructor.newInstance(null);
        } catch (Exception e) {
            unwrapAndThrowAsIAE(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                checkAndFixAccess(declaredConstructor, z);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            unwrapAndThrowAsIAE(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean isJDKClass(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return backticked(simpleName);
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static void throwAsIAE(Throwable th, String str) {
        throwIfRTE(th);
        throwIfError(th);
        throw new IllegalArgumentException(str, th);
    }

    public static Throwable throwIfError(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable throwIfRTE(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }
}
