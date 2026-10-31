package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m1e extends q1e {
    public final int a;

    public m1e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1e) && this.a == ((m1e) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
