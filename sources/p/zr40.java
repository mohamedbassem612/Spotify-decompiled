package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zr40 extends as40 {
    public final boolean a;

    public zr40(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr40) && this.a == ((zr40) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
