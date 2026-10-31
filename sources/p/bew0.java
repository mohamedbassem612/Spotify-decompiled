package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bew0 implements kew0 {
    public final boolean a;

    public bew0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bew0) && this.a == ((bew0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
