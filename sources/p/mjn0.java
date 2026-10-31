package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mjn0 extends qjn0 {
    public final int a;

    public mjn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjn0) && this.a == ((mjn0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
