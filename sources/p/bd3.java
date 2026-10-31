package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bd3 extends ed3 {
    public final boolean a;

    public bd3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd3) && this.a == ((bd3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
