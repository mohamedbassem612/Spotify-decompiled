package p;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class voe0 implements s1c1 {
    public static final String d;
    public static final noe0 e;
    public final bx81 a;
    public final fj10 b;
    public final String c;

    static {
        String canonicalName = voe0.class.getCanonicalName();
        int iB0 = ihc1.B0(canonicalName, ".", 0, 6);
        d = iB0 == -1 ? "" : canonicalName.substring(0, iB0);
        e = new noe0("NO_LOCKS", bbn.a1);
    }

    public voe0(String str) {
        this(str, new a0m(new ReentrantLock(), (byte) 22));
    }

    public static void d(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final qoe0 a(iu30 iu30Var) {
        return new qoe0(this, new ConcurrentHashMap(3, 1.0f, 2), iu30Var, (byte) 1);
    }

    public final ffr b(iu30 iu30Var) {
        return new ffr((Object) this, (Object) new ConcurrentHashMap(3, 1.0f, 2), (Object) iu30Var, (byte) 3);
    }

    public lls0 c(Object obj, String str) {
        StringBuilder sbG = dv20.g("Recursion detected ", str);
        sbG.append(obj == null ? "" : gvg.g(obj, "on input: "));
        sbG.append(" under ");
        sbG.append(this);
        AssertionError assertionError = new AssertionError(sbG.toString());
        d(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return l1d.n(this.c, ")", sb);
    }

    public voe0(String str, bx81 bx81Var) {
        fj10 fj10Var = fj10.Y;
        this.a = bx81Var;
        this.b = fj10Var;
        this.c = str;
    }
}
