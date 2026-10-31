package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uzc extends i0d implements q0c {
    public final /* synthetic */ byte e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public uzc(Constructor constructor, Object obj, byte b) {
        this.e = b;
        switch (b) {
            case 1:
                super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes());
                this.f = obj;
                break;
            default:
                Class declaringClass = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : f46.a0(1, genericParameterTypes.length - 1, genericParameterTypes)));
                this.f = obj;
                break;
        }
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        byte b = this.e;
        Object obj = this.f;
        Member member = this.a;
        switch (b) {
            case 0:
                d(objArr);
                c8b1 c8b1Var = new c8b1(3);
                c8b1Var.a(obj);
                c8b1Var.b(objArr);
                c8b1Var.a((Object) null);
                ArrayList arrayList = c8b1Var.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr);
                c8b1 c8b1Var2 = new c8b1(2);
                c8b1Var2.a(obj);
                c8b1Var2.b(objArr);
                ArrayList arrayList2 = c8b1Var2.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
