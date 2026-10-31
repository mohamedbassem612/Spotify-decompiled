package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vzc extends i0d {
    public final /* synthetic */ byte e;

    /* JADX WARN: Illegal instructions before constructor call */
    public vzc(Constructor constructor, byte b) {
        this.e = b;
        Class<?> cls = null;
        switch (b) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                Class declaringClass2 = constructor.getDeclaringClass();
                Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
                if (declaringClass3 != null && !Modifier.isStatic(declaringClass2.getModifiers())) {
                    cls = declaringClass3;
                }
                super(constructor, declaringClass, cls, constructor.getGenericParameterTypes());
                break;
            default:
                Class declaringClass4 = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : f46.a0(0, genericParameterTypes.length - 1, genericParameterTypes)));
                break;
        }
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        byte b = this.e;
        Member member = this.a;
        switch (b) {
            case 0:
                d(objArr);
                c8b1 c8b1Var = new c8b1(2);
                c8b1Var.b(objArr);
                c8b1Var.a((Object) null);
                ArrayList arrayList = c8b1Var.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
