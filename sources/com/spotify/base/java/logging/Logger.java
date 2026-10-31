package com.spotify.base.java.logging;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.c7t0;
import p.ete0;
import p.f4i1;
import p.fse0;
import p.jue0;
import p.kue0;
import p.mue0;
import p.sjb;
import p.tre0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\tJ3\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u000eJ;\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/spotify/base/java/logging/Logger;", "", "", "message", "Lp/rih1;", "core", "(Ljava/lang/String;)V", "", "breadcrumb", "(ZLjava/lang/String;)V", "", "level", "file", "line", "(ILjava/lang/String;ILjava/lang/String;)V", "(IZLjava/lang/String;ILjava/lang/String;)V", "p/jue0", "p/as10", "p/kue0", "p/lue0", "src_main_java_com_spotify_base_java_logging-logging"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class Logger {
    public static List a = z6x.a;
    public static fse0 b = new c7t0();
    public static sjb c = new sjb((byte) 27);
    public static final Object d = new Object();
    public static volatile jue0 e = new kue0();
    public static final mue0 f = mue0.a;

    public static final void a(Exception exc, String str, Object... objArr) {
        if (e.a(exc, str, objArr)) {
            return;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            j(((tre0) it.next()).breadcrumb(), exc, str, objArr);
        }
    }

    public static final void b(String str, Object... objArr) {
        if (e.a((Exception) null, str, objArr)) {
            return;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i(((tre0) it.next()).breadcrumb(), str, objArr);
        }
    }

    public static void c(String str, String str2, Object[] objArr, Throwable th) {
        String strF;
        try {
            strF = f(str2, objArr);
        } catch (RuntimeException e2) {
            String strA = b.a(str2);
            m(str, e2, "Early breadcrumb format string does not match its arguments: %s", str2);
            strF = strA;
        }
        for (tre0 tre0Var : a) {
            try {
                ete0 ete0VarBreadcrumb = tre0Var.breadcrumb();
                String str3 = "null";
                if (th == null) {
                    ete0VarBreadcrumb.a(str, strF != null ? strF : "null");
                } else {
                    if (strF != null) {
                        str3 = strF;
                    }
                    ete0VarBreadcrumb.i(str, str3, th);
                }
            } catch (RuntimeException e3) {
                m(str, e3, "Log destination %s failed to receive an early breadcrumb", tre0Var.getClass().getName());
            }
        }
    }

    public static final void core(int level, boolean breadcrumb, String file, int line, String message) {
        ete0 ete0VarE;
        for (tre0 tre0Var : a) {
            if (breadcrumb) {
                ete0VarE = tre0Var.breadcrumb();
            } else if (level == 0 || level == 1) {
                ete0VarE = tre0Var.e();
            } else if (level == 2) {
                ete0VarE = tre0Var.a();
            } else if (level != 3) {
                ete0VarE = level != 4 ? tre0Var.b() : tre0Var.c();
            } else {
                ete0VarE = tre0Var.f();
            }
            String str = Thread.currentThread().getName() + "@" + file + ":" + line;
            String strA = b.a(message);
            if (strA == null) {
                strA = "null";
            }
            ete0VarE.a(str, strA);
        }
    }

    public static final void d(String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i(((tre0) it.next()).a(), str, objArr);
        }
    }

    public static final void e(Throwable th, String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            j(((tre0) it.next()).a(), th, str, objArr);
        }
    }

    public static String f(String str, Object[] objArr) {
        return objArr.length == 0 ? b.a(str) : (String) f.invoke(b, str, objArr);
    }

    public static final void g(String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i(((tre0) it.next()).c(), str, objArr);
        }
    }

    public static final void h(Throwable th, String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            j(((tre0) it.next()).c(), th, str, objArr);
        }
    }

    public static void i(ete0 ete0Var, String str, Object[] objArr) {
        String strT = c.t();
        String strF = f(str, objArr);
        if (strF == null) {
            strF = "null";
        }
        ete0Var.a(strT, strF);
    }

    public static void j(ete0 ete0Var, Throwable th, String str, Object[] objArr) {
        String strT = c.t();
        String strF = f(str, objArr);
        if (strF == null) {
            strF = "null";
        }
        if (th == null) {
            ete0Var.a(strT, strF);
        } else {
            ete0Var.i(strT, strF, th);
        }
    }

    public static final void k(String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            i(((tre0) it.next()).f(), str, objArr);
        }
    }

    public static final void l(Throwable th, String str, Object... objArr) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            j(((tre0) it.next()).f(), th, str, objArr);
        }
    }

    public static void m(String str, RuntimeException runtimeException, String str2, Object... objArr) {
        try {
            str2 = f(str2, objArr);
        } catch (RuntimeException unused) {
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            try {
                ((tre0) it.next()).f().i(str, str2 == null ? "null" : str2, runtimeException);
            } catch (RuntimeException unused2) {
            }
        }
    }

    public static final void core(boolean breadcrumb, String message) {
        for (tre0 tre0Var : a) {
            ete0 ete0VarBreadcrumb = breadcrumb ? tre0Var.breadcrumb() : tre0Var.c();
            String strE = f4i1.e(Thread.currentThread().getName(), "@core");
            String strA = b.a(message);
            if (strA == null) {
                strA = "null";
            }
            ete0VarBreadcrumb.a(strE, strA);
        }
    }

    public static final void core(int level, String file, int line, String message) {
        core(level, false, file, line, message);
    }

    public static final void core(String message) {
        core(false, message);
    }
}
