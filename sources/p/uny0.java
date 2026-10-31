package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uny0 implements xny0 {
    public final UUID a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final Map g;
    public final Map h;

    public uny0(UUID uuid, String str, String str2, long j, long j2, long j3, Map map, Map map2) {
        this.a = uuid;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = map;
        this.h = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uny0)) {
            return false;
        }
        uny0 uny0Var = (uny0) obj;
        return this.a.equals(uny0Var.a) && u890.j(this.b, uny0Var.b) && this.c.equals(uny0Var.c) && this.d == uny0Var.d && this.e == uny0Var.e && this.f == uny0Var.f && this.g.equals(uny0Var.g) && this.h.equals(uny0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.e(cy30.f(cy30.f(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), 31, this.g);
    }
}
