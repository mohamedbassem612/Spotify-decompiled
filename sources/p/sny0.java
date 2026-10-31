package p;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sny0 implements xny0, ml81 {
    public final UUID a;
    public final String b = "event";
    public final CopyOnWriteArrayList c;

    public sny0(UUID uuid, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = uuid;
        this.c = copyOnWriteArrayList;
    }

    @Override // p.ml81
    public final qm81 a() {
        return qm81.EVENT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sny0)) {
            return false;
        }
        sny0 sny0Var = (sny0) obj;
        return this.a.equals(sny0Var.a) && this.b.equals(sny0Var.b) && this.c.equals(sny0Var.c);
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
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
