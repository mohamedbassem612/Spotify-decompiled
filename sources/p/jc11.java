package p;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jc11 {
    public final Class a;
    public final at7 b;

    public jc11(Class cls, at7 at7Var) {
        this.a = cls;
        this.b = at7Var;
    }

    public final String a() {
        return this.a.getName().replace('.', '/').concat(".class");
    }

    public final void b(t6b0 t6b0Var) {
        for (Annotation annotation : this.a.getDeclaredAnnotations()) {
            annotation.getClass();
            o1p1.E(t6b0Var, annotation);
        }
        t6b0Var.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jc11) {
            return this.a.equals(((jc11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jc11.class.getName() + ": " + this.a;
    }
}
