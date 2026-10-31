package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gdu implements idu {
    public final boolean a;

    public gdu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdu) && this.a == ((gdu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
