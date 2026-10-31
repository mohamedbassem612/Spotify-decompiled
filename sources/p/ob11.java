package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ob11 extends zb11 {
    public final Type a;
    public final q7a0 b;

    public ob11(Type type) {
        q7a0 mb11Var;
        this.a = type;
        if (type instanceof Class) {
            mb11Var = new mb11((Class) type);
        } else if (type instanceof TypeVariable) {
            mb11Var = new ac11((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                bhn0.v("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            mb11Var = new mb11((Class) ((ParameterizedType) type).getRawType());
        }
        this.b = mb11Var;
    }

    @Override // p.zb11, p.m7a0
    public final cb11 a(kf30 kf30Var) {
        return null;
    }

    @Override // p.zb11
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    public final ArrayList c() {
        z7a0 gb11Var;
        z7a0 xb11Var;
        List<Type> listC = bb11.c(this.a);
        ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
        for (Type type : listC) {
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    xb11Var = new xb11(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        gb11Var = new gb11(type);
                    } else {
                        gb11Var = type instanceof WildcardType ? new cc11((WildcardType) type) : new ob11(type);
                    }
                    xb11Var = gb11Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    gb11Var = new gb11(type);
                } else {
                    gb11Var = new gb11(type);
                }
                xb11Var = gb11Var;
            }
            arrayList.add(xb11Var);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            if (!(((Class) type).getTypeParameters().length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return z6x.a;
    }
}
