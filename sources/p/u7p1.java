package p;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u7p1 implements r7p1 {
    public static final u7p1 a;
    public static final u7p1 b;
    public static final Unsafe c;
    public static final int d;
    public static final /* synthetic */ u7p1[] e;

    static {
        Unsafe unsafeB;
        u7p1 u7p1Var = new u7p1("UNSAFE_LITTLE_ENDIAN", 0);
        a = u7p1Var;
        u7p1 u7p1Var2 = new u7p1("UNSAFE_BIG_ENDIAN", 1);
        b = u7p1Var2;
        e = new u7p1[]{u7p1Var, u7p1Var2};
        try {
            try {
                unsafeB = Unsafe.getUnsafe();
            } catch (Exception e2) {
                bhn0.o("Could not initialize intrinsics", e2);
                return;
            }
        } catch (SecurityException unused) {
            try {
                unsafeB = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, pkh1.b);
            } catch (Exception unused2) {
                unsafeB = b();
            }
        }
        c = unsafeB;
        d = unsafeB.arrayBaseOffset(byte[].class);
        if (unsafeB.arrayIndexScale(byte[].class) == 1) {
            return;
        }
        hhg1.c();
    }

    public static /* synthetic */ Unsafe b() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static u7p1[] values() {
        return (u7p1[]) e.clone();
    }

    @Override // p.r7p1
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        int i2 = d;
        Unsafe unsafe = c;
        if (iOrdinal == 0) {
            return unsafe.getLong(bArr, ((long) i) + ((long) i2));
        }
        if (iOrdinal == 1) {
            return Long.reverseBytes(unsafe.getLong(bArr, ((long) i) + ((long) i2)));
        }
        throw null;
    }
}
