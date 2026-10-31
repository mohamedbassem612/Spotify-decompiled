package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b211 extends d211 {
    public final int a;

    public b211(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b211) && this.a == ((b211) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
