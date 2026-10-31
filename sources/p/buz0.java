package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class buz0 implements duz0 {
    public final boolean a;

    public buz0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buz0) && this.a == ((buz0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
