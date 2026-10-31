package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class byt implements gyt {
    public final boolean a;

    public byt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byt) && this.a == ((byt) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
