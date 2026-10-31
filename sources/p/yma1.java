package p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yma1 {
    public final UUID a;
    public final String b;
    public final long c;
    public final long d;
    public final ConcurrentHashMap e;

    public yma1(UUID uuid, String str, long j, long j2, ConcurrentHashMap concurrentHashMap) {
        this.a = uuid;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = concurrentHashMap;
    }

    public static yma1 a(yma1 yma1Var, long j) {
        return new yma1(yma1Var.a, yma1Var.b, yma1Var.c, j, yma1Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yma1)) {
            return false;
        }
        yma1 yma1Var = (yma1) obj;
        return this.a.equals(yma1Var.a) && u890.j(this.b, yma1Var.b) && this.c == yma1Var.c && this.d == yma1Var.d && this.e.equals(yma1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }
}
