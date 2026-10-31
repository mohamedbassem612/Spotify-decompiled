package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eaf0 extends xaf0 {
    public final boolean a;

    public eaf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaf0) && this.a == ((eaf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
