package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v7g0 {
    public final int a;

    public v7g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7g0) && this.a == ((v7g0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
