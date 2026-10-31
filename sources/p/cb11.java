package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cb11 extends qb11 {
    public final Annotation a;

    public cb11(Annotation annotation) {
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        db11 nb11Var;
        Annotation annotation = this.a;
        Method[] declaredMethods = j2h1.s(annotation).n().getDeclaredMethods();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            ajn0 ajn0VarE = ajn0.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = bb11.a;
            if (Enum.class.isAssignableFrom(cls)) {
                nb11Var = new rb11(ajn0VarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                nb11Var = new eb11(ajn0VarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                nb11Var = new fb11(ajn0VarE, (Object[]) objInvoke);
            } else {
                nb11Var = objInvoke instanceof Class ? new nb11(ajn0VarE, (Class) objInvoke) : new tb11(ajn0VarE, objInvoke);
            }
            arrayList.add(nb11Var);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cb11) {
            return this.a == ((cb11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return cb11.class.getName() + ": " + this.a;
    }
}
