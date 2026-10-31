package p;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rg30 {
    public static final jv81 a = new jv81(0);

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        jv81 jv81Var = a;
        jv81 jv81Var2 = (jv81) jv81Var.get(classLoader);
        if (jv81Var2 == null) {
            jv81Var2 = new jv81(0);
            jv81Var.put(classLoader, jv81Var2);
        }
        Class cls = (Class) jv81Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jv81Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.fragment.app.Fragment$InstantiationException */
    public static Class c(ClassLoader classLoader, String str) throws Fragment.InstantiationException {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public zf30 a(ClassLoader classLoader, String str) {
        try {
            return (zf30) c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(f4i1.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
