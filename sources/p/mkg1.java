package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mkg1 {
    public final boolean a;

    public mkg1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkg1) && this.a == ((mkg1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
