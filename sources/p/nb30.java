package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nb30 implements ob30 {
    public final boolean a;
    public final boolean b;

    public nb30(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb30)) {
            return false;
        }
        nb30 nb30Var = (nb30) obj;
        return this.a == nb30Var.a && this.b == nb30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
