package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hoc1 {
    public final String a;

    public hoc1(String str, StackTraceElement[] stackTraceElementArr) {
        this.a = str;
    }

    public final RuntimeException a(String str) {
        RuntimeException runtimeException = new RuntimeException(str);
        runtimeException.setStackTrace(eio1.a);
        return runtimeException;
    }

    public final String b() {
        return this.a;
    }
}
