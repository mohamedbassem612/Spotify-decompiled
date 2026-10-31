package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class dia0 {
    public static final kf30 a;
    public static final heg b;

    static {
        kf30 kf30Var = new kf30("kotlin.jvm.JvmField");
        a = kf30Var;
        mka.n(kf30Var);
        mka.n(new kf30("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = mka.f("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        return c(str) ? str : "get".concat(i1o1.i(str));
    }

    public static final String b(String str) {
        return "set".concat(c(str) ? str.substring(2) : i1o1.i(str));
    }

    public static final boolean c(String str) {
        if (nhc1.Y(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (u890.q(97, cCharAt) > 0 || u890.q(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
