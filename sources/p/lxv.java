package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lxv implements oxv {
    public final boolean a;
    public final boolean b;

    public lxv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxv)) {
            return false;
        }
        lxv lxvVar = (lxv) obj;
        return this.a == lxvVar.a && this.b == lxvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
