package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nng0 {
    public volatile boolean a = true;
    public volatile int b = 1;
    public final mng0 c;
    public final vhc d;

    public nng0(vhc vhcVar, LinkedHashMap linkedHashMap) {
        this.d = vhcVar;
        this.c = new mng0(this, linkedHashMap);
    }

    public static nng0 i() {
        return new nng0(new vhc((byte) 15), new LinkedHashMap());
    }

    public final mng0 a() {
        new LinkedHashMap();
        throw null;
    }

    public final void b() {
        new nng0(this.d, qng0.d(d()));
    }

    public final void c() {
        if (this.a) {
            return;
        }
        k220.c();
    }

    public final Map d() {
        if (this.b == 2) {
            synchronized (this) {
                try {
                    if (this.b == 2) {
                        a();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableMap(this.c);
    }

    public final mng0 e() {
        if (this.b != 1) {
            if (this.b == 2) {
                a();
                throw null;
            }
            this.b = 1;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nng0) {
            return qng0.g(d(), ((nng0) obj).d());
        }
        return false;
    }

    public final boolean f() {
        return this.a;
    }

    public final void g() {
        this.a = false;
    }

    public final void h(nng0 nng0Var) {
        e().putAll(qng0.d(nng0Var.d()));
    }

    public final int hashCode() {
        return qng0.a(d());
    }
}
