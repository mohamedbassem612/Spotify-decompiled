package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class swk implements fxk {
    public final boolean a;

    public swk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swk) && this.a == ((swk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
