package p;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vqk1 {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = vqk1.class.getName();

    public static void a(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                dv20.g(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".").append(stackTrace[i].getMethodName());
                break;
            }
        }
        Locale locale = Locale.US;
        Thread.currentThread().getId();
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            a(str, objArr);
        }
    }
}
