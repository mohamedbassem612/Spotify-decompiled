package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pkh1 implements PrivilegedExceptionAction {
    public static final /* synthetic */ pkh1 b = new pkh1(6);
    public static final /* synthetic */ pkh1 c = new pkh1(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ pkh1(byte b2) {
        this.a = b2;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() throws IllegalAccessException {
        int i = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Field[] declaredFields = Unsafe.class.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                    i++;
                }
                return null;
            case 1:
                Field[] declaredFields2 = Unsafe.class.getDeclaredFields();
                int length2 = declaredFields2.length;
                while (i < length2) {
                    Field field2 = declaredFields2[i];
                    field2.setAccessible(true);
                    Object obj2 = field2.get(null);
                    if (Unsafe.class.isInstance(obj2)) {
                        return (Unsafe) Unsafe.class.cast(obj2);
                    }
                    i++;
                }
                return null;
            case 2:
                Field[] declaredFields3 = Unsafe.class.getDeclaredFields();
                int length3 = declaredFields3.length;
                while (i < length3) {
                    Field field3 = declaredFields3[i];
                    field3.setAccessible(true);
                    Object obj3 = field3.get(null);
                    if (Unsafe.class.isInstance(obj3)) {
                        return (Unsafe) Unsafe.class.cast(obj3);
                    }
                    i++;
                }
                return null;
            case 3:
                Unsafe unsafe = hvn1.c;
                Field[] declaredFields4 = Unsafe.class.getDeclaredFields();
                int length4 = declaredFields4.length;
                while (i < length4) {
                    Field field4 = declaredFields4[i];
                    field4.setAccessible(true);
                    Object obj4 = field4.get(null);
                    if (Unsafe.class.isInstance(obj4)) {
                        return (Unsafe) Unsafe.class.cast(obj4);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
            case 4:
                Field[] declaredFields5 = Unsafe.class.getDeclaredFields();
                int length5 = declaredFields5.length;
                while (i < length5) {
                    Field field5 = declaredFields5[i];
                    field5.setAccessible(true);
                    Object obj5 = field5.get(null);
                    if (Unsafe.class.isInstance(obj5)) {
                        return (Unsafe) Unsafe.class.cast(obj5);
                    }
                    i++;
                }
                return null;
            case 5:
                Field[] declaredFields6 = Unsafe.class.getDeclaredFields();
                int length6 = declaredFields6.length;
                while (i < length6) {
                    Field field6 = declaredFields6[i];
                    field6.setAccessible(true);
                    Object obj6 = field6.get(null);
                    if (Unsafe.class.isInstance(obj6)) {
                        return (Unsafe) Unsafe.class.cast(obj6);
                    }
                    i++;
                }
                return null;
            case 6:
                return u7p1.b();
            default:
                Unsafe unsafe2 = qfp1.b;
                Field[] declaredFields7 = Unsafe.class.getDeclaredFields();
                int length7 = declaredFields7.length;
                while (i < length7) {
                    Field field7 = declaredFields7[i];
                    field7.setAccessible(true);
                    Object obj7 = field7.get(null);
                    if (Unsafe.class.isInstance(obj7)) {
                        return (Unsafe) Unsafe.class.cast(obj7);
                    }
                    i++;
                }
                throw new NoSuchFieldError("the Unsafe");
        }
    }
}
