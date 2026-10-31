package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v8u extends d9u {
    public final boolean a;
    public final boolean b;

    public v8u(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8u)) {
            return false;
        }
        v8u v8uVar = (v8u) obj;
        return this.a == v8uVar.a && this.b == v8uVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
