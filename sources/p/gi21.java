package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gi21 extends si21 {
    public final boolean a;

    public gi21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi21) && this.a == ((gi21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
