package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vb11 extends ub11 implements p8a0 {
    public final Method a;

    public vb11(Method method) {
        this.a = method;
    }

    @Override // p.ub11
    public final Member b() {
        return this.a;
    }

    public final Method f() {
        return this.a;
    }

    public final zb11 g() {
        Type genericReturnType = this.a.getGenericReturnType();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new xb11(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new gb11(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new cc11((WildcardType) genericReturnType) : new ob11(genericReturnType);
    }

    @Override // p.p8a0
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ac11(typeVariable));
        }
        return arrayList;
    }

    public final List h() {
        Method method = this.a;
        return d(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
    }
}
