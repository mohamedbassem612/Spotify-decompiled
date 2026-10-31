package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gd1 {
    public final boolean a;

    public gd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd1) && this.a == ((gd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
