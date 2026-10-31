package p;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xka0 implements Function0 {
    public final bla0 a;
    public final Class b;
    public final heg c;

    public xka0(bla0 bla0Var, Class cls, heg hegVar) {
        this.a = bla0Var;
        this.b = cls;
        this.c = hegVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws i9n {
        bla0 bla0Var = this.a;
        Class cls = bla0Var.b;
        Class superclass = cls.getSuperclass();
        Class cls2 = this.b;
        if (u890.j(superclass, cls2)) {
            Type genericSuperclass = cls.getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        int iP0 = f46.p0(cls.getInterfaces(), cls2);
        if (iP0 >= 0) {
            Type type = cls.getGenericInterfaces()[iP0];
            type.getClass();
            return type;
        }
        throw new i9n("No superclass of " + bla0Var + " in Java reflection for " + this.c);
    }
}
