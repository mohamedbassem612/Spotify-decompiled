package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eyt implements gyt {
    public final boolean a;

    public eyt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyt) && this.a == ((eyt) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
