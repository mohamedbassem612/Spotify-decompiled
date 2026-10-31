package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zf9 extends qg9 {
    public final String a;
    public final UUID b;

    public zf9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf9)) {
            return false;
        }
        zf9 zf9Var = (zf9) obj;
        return u890.j(this.a, zf9Var.a) && u890.j(this.b, zf9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
