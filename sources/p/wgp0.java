package p;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wgp0 {
    public final String a;
    public final vgp0 b;
    public final aip0 c;
    public final UUID d;
    public volatile long e;
    public final long f;
    public List g;
    public final uny0 h;
    public long i;
    public long j;
    public final AtomicBoolean k;

    public wgp0(String str, vgp0 vgp0Var, aip0 aip0Var, long j, long j2) {
        aip0Var.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        this.a = str;
        this.b = vgp0Var;
        this.c = aip0Var;
        this.d = uuidRandomUUID;
        this.e = j;
        this.f = j2;
        this.g = z6x.a;
        this.h = new uny0(uuidRandomUUID, str, vgp0Var.b, this.e, 0L, j2, new ConcurrentHashMap(), new ConcurrentHashMap());
        this.k = new AtomicBoolean(false);
    }

    public final void a(ml81 ml81Var) {
        if (b(ml81Var.a(), ml81Var.getKey())) {
            this.h.h.put(ml81Var.getId(), ml81Var.a().a);
        }
    }

    public final boolean b(qm81 qm81Var, String str) {
        int iOrdinal = qm81Var.ordinal();
        vgp0 vgp0Var = this.b;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return vgp0Var.d.containsKey(qm81Var);
            }
            if (iOrdinal != 3) {
                eg.o();
                return false;
            }
        }
        Set set = (Set) vgp0Var.d.get(qm81Var);
        if (set != null) {
            return set.contains(str);
        }
        return false;
    }

    public final boolean c(Long l) {
        if (!this.k.compareAndSet(false, true)) {
            return false;
        }
        aip0 aip0Var = this.c;
        this.i = l != null ? l.longValue() : aip0Var.a();
        aip0Var.getClass();
        this.j = b9p1.m(System.currentTimeMillis());
        return true;
    }
}
