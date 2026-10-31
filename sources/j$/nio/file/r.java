package j$.nio.file;

import j$.time.DateTimeException;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class r {
    public static /* synthetic */ void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void b(String str, int i) {
        throw new DateTimeException(str + i);
    }

    public static /* synthetic */ void c(String str, int i, Object obj) {
        throw new DateTimeException(str + i + obj);
    }

    public static /* synthetic */ void d(String str, Object obj) {
        throw new j$.time.temporal.n(str + obj);
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException(str + obj + obj2);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new DateTimeException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Throwable th) {
        throw new DateTimeException(str + obj + ((Object) " of type ") + obj2, th);
    }

    public static /* synthetic */ void h(String str) {
        throw new DateTimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, int i) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void j(String str, Object obj) {
        throw new DateTimeException(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new ClassCastException(str + obj + ((Object) ", actual: ") + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new DateTimeException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }
}
