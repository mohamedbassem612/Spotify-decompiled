package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kuz0 {
    public final boolean a;
    public final boolean b;

    public kuz0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuz0)) {
            return false;
        }
        kuz0 kuz0Var = (kuz0) obj;
        return this.a == kuz0Var.a && this.b == kuz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
