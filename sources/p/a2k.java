package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a2k extends rg30 {
    public final Map b;

    public a2k(Map map) {
        this.b = map;
    }

    public final zf30 a(ClassLoader classLoader, String str) {
        Class clsC = rg30.c(classLoader, str);
        ni30 ni30Var = (ni30) this.b.get(clsC);
        try {
            return ni30Var != null ? ni30Var.a() : super.a(classLoader, str);
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length + 2;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
            for (int i = 0; i < length; i++) {
                stackTraceElementArr[i] = null;
            }
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 2, stackTrace.length);
            stackTraceElementArr[0] = new StackTraceElement(clsC.getName(), "", "", 0);
            stackTraceElementArr[1] = new StackTraceElement("[[ Failed to instantiate fragment ↑↑ ]] ", "", "", 0);
            th.setStackTrace(stackTraceElementArr);
            if (ni30Var != null) {
                throw th;
            }
            n57.q(th);
            return new zf30();
        }
    }
}
