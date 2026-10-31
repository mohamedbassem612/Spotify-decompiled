package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tpq0 extends s2n {
    public final /* synthetic */ byte a;

    public /* synthetic */ tpq0(byte b) {
        this.a = b;
    }

    public static tpq0 c() {
        return new tpq0((byte) 1);
    }

    public static tpq0 d() {
        return new tpq0((byte) 2);
    }

    public t2n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gc31 gc31Var) {
        switch (this.a) {
            case 1:
                if ((type instanceof Class) && s2j0.class.isAssignableFrom((Class) type)) {
                    return new ciy0();
                }
                return null;
            case 2:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return cg41.a;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, gc31Var);
        }
    }

    public final t2n b(Type type, Annotation[] annotationArr, gc31 gc31Var) {
        qzr0 qzr0Var;
        switch (this.a) {
            case 0:
                if (m5n1.B(type) != Optional.class) {
                    return null;
                }
                return new l1p0(gc31Var.d(m5n1.A(0, (ParameterizedType) type), annotationArr), (byte) 9);
            case 1:
                if (!(type instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type;
                if (!s2j0.class.isAssignableFrom(cls)) {
                    return null;
                }
                try {
                    try {
                        qzr0Var = (qzr0) cls.getDeclaredMethod("parser", null).invoke(null, null);
                        break;
                    } catch (IllegalAccessException | NoSuchMethodException unused) {
                        qzr0Var = (qzr0) cls.getDeclaredField("PARSER").get(null);
                        break;
                    } catch (InvocationTargetException e) {
                        eg.j(e.getCause());
                        return null;
                    }
                    return new y1t0(qzr0Var, (byte) 4);
                } catch (IllegalAccessException | NoSuchFieldException e2) {
                    throw new IllegalArgumentException("Found a protobuf message but " + cls.getName() + " had no parser() method or PARSER field.", e2);
                }
            default:
                if (type == String.class) {
                    return wdx0.h;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return ybx0.i;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return ytw0.e;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return hcx0.i;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return icx0.h;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return jcx0.i;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return kcx0.i;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return pdx0.i;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return rdx0.h;
                }
                return null;
        }
    }
}
