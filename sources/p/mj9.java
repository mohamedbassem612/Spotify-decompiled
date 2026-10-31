package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mj9 implements uj9 {
    public final String a;
    public final UUID b;

    public mj9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj9)) {
            return false;
        }
        mj9 mj9Var = (mj9) obj;
        return u890.j(this.a, mj9Var.a) && u890.j(this.b, mj9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
