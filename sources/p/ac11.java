package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ac11 extends qb11 implements m7a0, q7a0 {
    public final TypeVariable a;

    public ac11(TypeVariable typeVariable) {
        this.a = typeVariable;
    }

    @Override // p.m7a0
    public final cb11 a(kf30 kf30Var) {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return p1p1.z(declaredAnnotations, kf30Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ac11) {
            return u890.j(this.a, ((ac11) obj).a);
        }
        return false;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? z6x.a : p1p1.B(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ac11.class.getName() + ": " + this.a;
    }
}
