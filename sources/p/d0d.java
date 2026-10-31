package p;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class d0d extends i0d {
    public final /* synthetic */ byte e = 0;
    public final boolean f;

    public d0d(Field field, boolean z, boolean z2) {
        super(field, Void.TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f = z;
    }

    @Override // p.rzc
    public Object call(Object[] objArr) throws IllegalAccessException {
        d(objArr);
        ((Field) this.a).set(this.c != null ? f46.j0(objArr) : null, f46.t0(objArr));
        return rih1.a;
    }

    @Override // p.i0d
    public void d(Object[] objArr) {
        switch (this.e) {
            case 0:
                super.d(objArr);
                if (this.f && f46.t0(objArr) == null) {
                    hhg1.n("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.d(objArr);
                break;
        }
    }

    public Object f(Object[] objArr, Object obj) {
        return this.f ? rih1.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0d(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = genericReturnType.equals(Void.TYPE);
    }

    public /* synthetic */ d0d(Method method, boolean z, int i) {
        this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
    }
}
