package p;

import java.io.EOFException;
import java.util.ConcurrentModificationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class eg implements pqc {
    public static /* synthetic */ void d() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void f(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void l() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ void o() throws NoWhenBranchMatchedException {
        throw new NoWhenBranchMatchedException();
    }

    @Override // p.pqc
    public String a(n3r n3rVar) {
        String str = n3rVar.h;
        return str != null ? str : n3rVar.a.toString();
    }
}
