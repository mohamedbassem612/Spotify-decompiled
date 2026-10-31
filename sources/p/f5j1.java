package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class f5j1 {
    public final y36 a;
    public final y36 b;
    public final y36 c;

    public f5j1(y36 y36Var, y36 y36Var2, y36 y36Var3) {
        this.a = y36Var;
        this.b = y36Var2;
        this.c = y36Var3;
    }

    public abstract g5j1 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        y36 y36Var = this.c;
        Class cls2 = (Class) y36Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        y36Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        y36 y36Var = this.a;
        Method method = (Method) y36Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, f5j1.class.getClassLoader()).getDeclaredMethod("read", f5j1.class);
        y36Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        y36 y36Var = this.b;
        Method method = (Method) y36Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, f5j1.class);
        y36Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((g5j1) this).e.readInt();
    }

    public final Parcelable g(int i, Parcelable parcelable) {
        if (!e(i)) {
            return parcelable;
        }
        return ((g5j1) this).e.readParcelable(g5j1.class.getClassLoader());
    }

    public final h5j1 h() {
        String string = ((g5j1) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (h5j1) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            bhn0.o("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            bhn0.o("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            bhn0.o("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            bhn0.o("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((g5j1) this).e.writeInt(i);
    }

    public final void k(int i, Parcelable parcelable) {
        i(i);
        ((g5j1) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(h5j1 h5j1Var) {
        if (h5j1Var == null) {
            ((g5j1) this).e.writeString(null);
            return;
        }
        try {
            ((g5j1) this).e.writeString(b(h5j1Var.getClass()).getName());
            g5j1 g5j1VarA = a();
            try {
                d(h5j1Var.getClass()).invoke(null, h5j1Var, g5j1VarA);
                Parcel parcel = g5j1VarA.e;
                int i = g5j1VarA.i;
                if (i >= 0) {
                    int i2 = g5j1VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                bhn0.o("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                bhn0.o("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                bhn0.o("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                bhn0.o("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            bhn0.o(h5j1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
