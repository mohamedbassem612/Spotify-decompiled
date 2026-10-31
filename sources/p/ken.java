package p;

import java.util.ArrayDeque;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ken {
    public static final ken h = new ken();
    public final Function0 a;
    public final Function0 b;
    public final Object c;
    public final ArrayDeque d;
    public final HashMap e;
    public n5 f;
    public boolean g;

    public ken() {
        l1k l1kVar = new l1k(0, s0u.a, s0u.class, "current", "current()Ljava/lang/String;", 0, (byte) 13);
        lmm lmmVar = lmm.X;
        this.a = l1kVar;
        this.b = lmmVar;
        this.c = new Object();
        this.d = new ArrayDeque();
        this.e = new HashMap();
    }

    public final void a(long j, String str, String str2) {
        c(2, str, str2, j);
    }

    public final void b() {
        jen jenVar;
        n5 n5Var;
        while (true) {
            synchronized (this.c) {
                jenVar = (jen) this.d.pollFirst();
                if (jenVar == null) {
                    this.g = false;
                    return;
                } else {
                    n5Var = this.f;
                    if (n5Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            n5Var.invoke(jenVar);
        }
    }

    public final void c(int i, String str, String str2, long j) {
        boolean z;
        String str3 = (String) this.a.invoke();
        String str4 = (String) this.b.invoke();
        synchronized (this.c) {
            HashMap map = this.e;
            Long lValueOf = null;
            z = true;
            try {
                if (i == 1) {
                    map.put(str, Long.valueOf(j));
                } else {
                    Long l = (Long) map.remove(str);
                    if (l != null) {
                        lValueOf = Long.valueOf(j - l.longValue());
                    }
                }
                jen jenVar = new jen(str, i, j, str2, str3, str4, lValueOf);
                ArrayDeque arrayDeque = this.d;
                if (this.f == null && arrayDeque.size() == 128) {
                    arrayDeque.removeFirst();
                }
                arrayDeque.addLast(jenVar);
                if (this.g || this.f == null || this.d.isEmpty()) {
                    z = false;
                } else {
                    this.g = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b();
        }
    }

    public final void d(long j, String str) {
        c(1, str, null, j);
    }
}
