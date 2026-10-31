package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ly40 {
    public final int a;

    public ly40(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly40) && this.a == ((ly40) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
