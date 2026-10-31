package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v6m1 implements x6m1 {
    public final boolean a;

    public v6m1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6m1) && this.a == ((v6m1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
