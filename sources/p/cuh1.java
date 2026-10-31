package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cuh1 implements juh1 {
    public final boolean a;

    public cuh1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuh1) && this.a == ((cuh1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
