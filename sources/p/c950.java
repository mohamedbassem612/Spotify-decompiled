package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c950 {
    public final int a;

    public c950(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c950) && this.a == ((c950) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
