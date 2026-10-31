package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i731 implements m731 {
    public final String a;
    public final iu30 b;

    public i731(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    public final String a() {
        return this.a;
    }

    public final iu30 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i731)) {
            return false;
        }
        i731 i731Var = (i731) obj;
        return this.a.equals(i731Var.a) && this.b.equals(i731Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
