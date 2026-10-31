package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cc11 extends zb11 {
    public final WildcardType a;

    public cc11(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // p.zb11
    public final Type b() {
        return this.a;
    }

    public final zb11 c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            t8e1.o(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Type type = (Type) f46.B0(lowerBounds);
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new xb11(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new gb11(type);
            }
            return type instanceof WildcardType ? new cc11((WildcardType) type) : new ob11(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) f46.B0(upperBounds);
            if (!u890.j(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new xb11(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new gb11(type2);
                }
                return type2 instanceof WildcardType ? new cc11((WildcardType) type2) : new ob11(type2);
            }
        }
        return null;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return z6x.a;
    }
}
