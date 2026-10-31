package p;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v4b1 extends ptg0 {
    public static final Pattern b = Pattern.compile("\\{\\}");

    public static String a(String str) {
        return b.matcher(str).replaceAll("%s");
    }

    @Override // p.rue0
    public final void b(Object obj) {
        a("Mobius ({}) - Initializing loop");
    }

    @Override // p.rue0
    public final void d(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            a(str);
        } else {
            a(str);
        }
    }

    @Override // p.rue0
    public final void e(String str) {
        Logger.d(str, new Object[0]);
    }

    @Override // p.rue0
    public final void f(String str, Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.l((Throwable) objArr[objArr.length - 1], a(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.k(a(str), objArr);
        }
    }

    @Override // p.rue0
    public final boolean g() {
        return true;
    }

    @Override // p.rue0
    public final void h(String str, Integer num, Object obj) {
        if (!(obj instanceof Throwable)) {
            a(str);
            return;
        }
        Throwable th = (Throwable) obj;
        String strA = a(str);
        Object[] objArr = {num};
        Iterator it = Logger.a.iterator();
        while (it.hasNext()) {
            Logger.j(((tre0) it.next()).d(), th, strA, objArr);
        }
    }

    @Override // p.rue0
    public final void i(String str, Throwable th) {
        Object[] objArr = new Object[0];
        Iterator it = Logger.a.iterator();
        while (it.hasNext()) {
            Logger.j(((tre0) it.next()).d(), th, str, objArr);
        }
    }

    @Override // p.rue0
    public final void j(Object obj, Exception exc) {
        Logger.e(exc, a("FATAL ERROR: exception during initialization from model {}"), new Object[]{obj});
    }

    @Override // p.rue0
    public final void k(String str, Exception exc) {
        Logger.e(exc, str, new Object[0]);
    }

    @Override // p.rue0
    public final void l(Object obj, String str) {
        a(str);
    }

    @Override // p.rue0
    public final void m(Object obj, String str) {
        Logger.k(a(str), new Object[]{obj});
    }

    @Override // p.rue0
    public final void n(Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.e((Throwable) objArr[objArr.length - 1], a("FATAL ERROR: exception updating model '{}' with event '{}'"), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.d(a("FATAL ERROR: exception updating model '{}' with event '{}'"), objArr);
        }
    }

    @Override // p.rue0
    public final void o(String str) {
        Logger.k(str, new Object[0]);
    }

    @Override // p.rue0
    public final void p(String str) {
    }
}
