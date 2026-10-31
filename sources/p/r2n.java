package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r2n implements Function0 {
    public final /* synthetic */ byte a;
    public final int b;
    public final Object c;

    public /* synthetic */ r2n(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                b7 b7Var = (b7) ((Function0) obj).invoke();
                znb0 znb0VarS = dm5.S(2, new ka(b7Var, (byte) 17));
                Type typeL = b7Var.l();
                if (typeL instanceof Class) {
                    Class cls = (Class) typeL;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (typeL instanceof GenericArrayType) {
                    if (i == 0) {
                        Type genericComponentType = ((GenericArrayType) typeL).getGenericComponentType();
                        genericComponentType.getClass();
                        return genericComponentType;
                    }
                    mna0.d(b7Var, "Array type has been queried for a non-0th argument: ");
                } else {
                    if (typeL instanceof ParameterizedType) {
                        Type type = (Type) ((List) znb0VarS.getValue()).get(i);
                        if (!(type instanceof WildcardType)) {
                            return type;
                        }
                        WildcardType wildcardType = (WildcardType) type;
                        Type type2 = (Type) f46.k0(wildcardType.getLowerBounds());
                        Type type3 = type2 == null ? (Type) f46.j0(wildcardType.getUpperBounds()) : type2;
                        type3.getClass();
                        return type3;
                    }
                    mna0.d(b7Var, "Non-generic type has been queried for arguments: ");
                }
                return null;
            case 1:
                return (lpr0) ((List) obj).get(i);
            default:
                return (lpr0) ((jyc) obj).F().get(i);
        }
    }
}
