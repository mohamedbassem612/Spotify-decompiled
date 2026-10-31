package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ri0 implements e0x {
    public final boolean a;

    public ri0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri0) && this.a == ((ri0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
