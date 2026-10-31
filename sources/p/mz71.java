package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mz71 {
    public final boolean a;

    public mz71(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz71) && this.a == ((mz71) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
