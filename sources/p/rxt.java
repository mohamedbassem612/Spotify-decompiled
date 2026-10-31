package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxt implements sxt {
    public final boolean a;
    public final boolean b;

    public rxt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxt)) {
            return false;
        }
        rxt rxtVar = (rxt) obj;
        return this.a == rxtVar.a && this.b == rxtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
