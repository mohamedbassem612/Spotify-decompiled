package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gb11 extends zb11 {
    public final Type a;
    public final zb11 b;

    /* JADX WARN: Multi-variable type inference failed */
    public gb11(Type type) {
        zb11 xb11Var;
        zb11 xb11Var2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    xb11Var = componentType.isPrimitive() ? new xb11(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new gb11(componentType) : componentType instanceof WildcardType ? new cc11((WildcardType) componentType) : new ob11(componentType);
                }
            }
            eg.i("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            xb11Var2 = cls2.isPrimitive() ? new xb11(cls2) : xb11Var2;
            this.b = xb11Var2;
        }
        xb11Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new gb11(genericComponentType) : genericComponentType instanceof WildcardType ? new cc11((WildcardType) genericComponentType) : new ob11(genericComponentType);
        xb11Var2 = xb11Var;
        this.b = xb11Var2;
    }

    @Override // p.zb11
    public final Type b() {
        return this.a;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return z6x.a;
    }
}
