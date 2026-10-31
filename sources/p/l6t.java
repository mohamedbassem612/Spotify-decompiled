package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l6t {
    public final int a;

    public l6t(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6t) && this.a == ((l6t) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
