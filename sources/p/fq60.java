package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fq60 {
    public final UUID a;
    public final String b;

    public fq60(String str, UUID uuid) {
        this.a = uuid;
        this.b = str;
    }

    public final UUID a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq60)) {
            return false;
        }
        fq60 fq60Var = (fq60) obj;
        return u890.j(this.a, fq60Var.a) && this.b.equals(fq60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
