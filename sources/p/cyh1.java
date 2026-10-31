package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cyh1 extends dyh1 {
    public final UUID a;
    public final String b;

    public cyh1(String str, UUID uuid) {
        this.a = uuid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyh1)) {
            return false;
        }
        cyh1 cyh1Var = (cyh1) obj;
        return this.a.equals(cyh1Var.a) && this.b.equals(cyh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
