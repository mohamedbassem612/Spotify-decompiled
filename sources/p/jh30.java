package p;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jh30 extends rg30 {
    public final /* synthetic */ th30 b;

    public jh30(th30 th30Var) {
        this.b = th30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.fragment.app.Fragment$InstantiationException */
    @Override // p.rg30
    public final zf30 a(ClassLoader classLoader, String str) throws Fragment.InstantiationException {
        try {
            return (zf30) rg30.c(this.b.x.e.getClassLoader(), str).getConstructor(null).newInstance(null);
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
