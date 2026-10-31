package p;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dck1 extends fck1 {
    public static dck1 c;
    public static final a0b d = new a0b((byte) 29);
    public final Application b;

    public dck1(Application application) {
        this.b = application;
    }

    public static xbk1 d(Class cls, Application application) {
        if (!m75.class.isAssignableFrom(cls)) {
            return yon1.m1(cls);
        }
        try {
            xbk1 xbk1Var = (xbk1) cls.getConstructor(Application.class).newInstance(application);
            xbk1Var.getClass();
            return xbk1Var;
        } catch (IllegalAccessException e) {
            bhn0.o(cy30.j(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            bhn0.o(cy30.j(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            bhn0.o(cy30.j(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            bhn0.o(cy30.j(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // p.fck1, p.eck1
    public final xbk1 b(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        hhg1.h("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // p.fck1, p.eck1
    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        if (this.b != null) {
            return b(cls);
        }
        Application application = (Application) wcn0Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!m75.class.isAssignableFrom(cls)) {
            return yon1.m1(cls);
        }
        hhg1.n("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
