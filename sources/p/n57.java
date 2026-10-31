package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.support.assertion.Assertion$Note;
import com.spotify.support.assertion.Assertion$RecoverableAssertionError;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n57 {
    public static final n57 b = new n57(new laz(i6a1.a, (byte) 29));
    public volatile m57 a;

    private n57(m57 m57Var) {
        this.a = m57Var;
    }

    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                m("The two objects(null, " + String.valueOf(obj2) + ") are not equal.");
                return;
            }
            return;
        }
        if (obj.equals(obj2)) {
            return;
        }
        m("The two objects(" + String.valueOf(obj) + ", " + String.valueOf(obj2) + ") are not equal.");
    }

    public static void b(Object obj, Object obj2) {
        if (Objects.equals(obj, obj2)) {
            return;
        }
        p(cy30.p("The two objects (", String.valueOf(obj), ", ", String.valueOf(obj2), ") are not equal."));
    }

    public static void c(Object obj, Object obj2) {
        boolean zEquals;
        if (obj != null) {
            zEquals = obj.equals(obj2);
        } else {
            zEquals = obj2 == null;
        }
        if (zEquals) {
            m("The two objects(" + String.valueOf(obj) + ", " + String.valueOf(obj2) + ") are equal.");
        }
    }

    @Deprecated
    public static void d(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void e(String str) {
        p(str);
    }

    public static void f(String str, String str2) {
        o(new Assertion$RecoverableAssertionError(Logger.f("%s", new Object[]{str}), str2));
    }

    public static void g(String str, Throwable th) {
        o(new Assertion$RecoverableAssertionError(str, th));
    }

    @Deprecated
    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        m(Logger.f("%s", new Object[]{str}));
    }

    public static void i(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        m(Logger.f(str, objArr));
    }

    @Deprecated
    public static void j(boolean z, String str) {
        if (z) {
            return;
        }
        p(str);
    }

    public static void k(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        p(String.format(Locale.US, str, objArr));
    }

    private static m57 l() {
        return b.a;
    }

    public static void m(String str) {
        Logger.d("%s", new Object[]{str});
        n(new AssertionError(Logger.f("%s", new Object[]{str})));
    }

    private static void n(AssertionError assertionError) {
        r(assertionError);
        l().g(assertionError);
        throw null;
    }

    private static void o(Assertion$RecoverableAssertionError assertion$RecoverableAssertionError) {
        r(assertion$RecoverableAssertionError);
        l().e(assertion$RecoverableAssertionError);
    }

    private static void p(String str) {
        o(new Assertion$RecoverableAssertionError(Logger.f("%s", new Object[]{str}), (String) null));
    }

    public static void q(Throwable th) {
        l().h(th);
    }

    private static void r(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!n57.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                arrayList.add(stackTraceElement);
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }

    public static void s(String str) {
        u(new Assertion$Note(str, null));
    }

    public static void t(String str, Throwable th) {
        u(new Assertion$Note(str, th));
    }

    private static void u(Assertion$Note assertion$Note) {
        r(assertion$Note);
        l().k(assertion$Note);
    }

    public static void v(Throwable th) {
        Assertion$Note assertion$Note = new Assertion$Note(th.getMessage(), null);
        assertion$Note.setStackTrace(th.getStackTrace());
        u(assertion$Note);
    }

    public static void w(m57 m57Var) {
        b.a = m57Var;
    }
}
