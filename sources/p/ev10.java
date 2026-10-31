package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ev10 implements rv10 {
    public final boolean a;

    public ev10(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev10) && this.a == ((ev10) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
