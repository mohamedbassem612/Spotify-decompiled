package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e8u extends d9u {
    public final boolean a;
    public final boolean b;

    public e8u(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8u)) {
            return false;
        }
        e8u e8uVar = (e8u) obj;
        return this.a == e8uVar.a && this.b == e8uVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
