package p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wny0 implements xny0, ml81 {
    public final UUID a;
    public final String b;
    public final long c;
    public final long d;
    public final ConcurrentHashMap e;
    public final CopyOnWriteArrayList f;
    public final qm81 g;

    public /* synthetic */ wny0(UUID uuid, String str, long j, long j2, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this(uuid, str, j, (i & 8) != 0 ? 0L : j2, new ConcurrentHashMap(), (i & 32) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }

    @Override // p.ml81
    public final qm81 a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wny0)) {
            return false;
        }
        wny0 wny0Var = (wny0) obj;
        return u890.j(this.a, wny0Var.a) && u890.j(this.b, wny0Var.b) && this.c == wny0Var.c && this.d == wny0Var.d && u890.j(this.e, wny0Var.e) && u890.j(this.f, wny0Var.f);
    }

    @Override // p.ml81
    public final UUID getId() {
        return this.a;
    }

    @Override // p.ml81
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31)) * 31);
    }

    public wny0(UUID uuid, String str, long j, long j2, ConcurrentHashMap concurrentHashMap, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = uuid;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = concurrentHashMap;
        this.f = copyOnWriteArrayList;
        this.g = qm81.TRACE;
    }
}
