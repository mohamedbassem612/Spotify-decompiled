package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ze01 {
    public final UUID a;
    public final String b;
    public final hxh1 c;

    public ze01(UUID uuid, String str, hxh1 hxh1Var) {
        this.a = uuid;
        this.b = str;
        this.c = hxh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze01)) {
            return false;
        }
        ze01 ze01Var = (ze01) obj;
        return this.a.equals(ze01Var.a) && this.b.equals(ze01Var.b) && this.c.equals(ze01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
